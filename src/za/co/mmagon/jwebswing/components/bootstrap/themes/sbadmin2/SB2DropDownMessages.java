/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.components.bootstrap.themes.sbadmin2;

import za.co.mmagon.jwebswing.base.html.Bold;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSColoursOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSDefaultOptions;
import za.co.mmagon.jwebswing.plugins.moment.Moment;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A shortcut class to building drop down message types
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
public class SB2DropDownMessages extends SB2DropDown
{

	private static final long serialVersionUID = 1L;

	private List<SB2DropDownMessage> messages;

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 */
	public SB2DropDownMessages()
	{
		this(null);
	}

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 *
	 * @param messages
	 */
	public SB2DropDownMessages(List<SB2DropDownMessage> messages)
	{
		this.messages = messages;
		getDropDownContents().addClass(SB2ThemeClasses.DropDown_Messages);
	}

	/**
	 * Read from a URL
	 *
	 * @param content
	 *
	 * @return
	 *
	 * @throws IOException
	 */
	public static SB2DropDownMessages fromUrl(URL content) throws IOException
	{
		List list2 = new JavaScriptPart().FromToList(content, SB2DropDownMessage[].class);
		SB2DropDownMessages messages = new SB2DropDownMessages(list2);
		messages.preConfigure();
		return messages;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getMessages().forEach(message ->
			                      {
				                      ListItem li = new ListItem();
				                      Link link = new Link(StaticStrings.STRING_HASH);
				                      Div topSection = new Div();
				                      Moment date = new Moment(message.getDate(), ComponentTypes.Span);

				                      date.addClass(BSDefaultOptions.Pull_Right);
				                      date.addClass(BSColoursOptions.Text_Muted);
				                      topSection.add(new Bold(message.getName()));
				                      topSection.add(date);

				                      Div messageSection = new Div();
				                      messageSection.add(message.getMessage());
				                      li.add(link);
				                      link.add(topSection);
				                      link.add(messageSection);
				                      getDropDownContents().add(li);
			                      });
		}
		super.preConfigure();
	}

	/**
	 * Returns the current messages
	 *
	 * @return
	 */
	public List<SB2DropDownMessage> getMessages()
	{
		if (messages == null)
		{
			messages = new ArrayList<>();
		}
		return messages;
	}

	/**
	 * Sets the current messages array list
	 *
	 * @param messages
	 */
	public void setMessages(List<SB2DropDownMessage> messages)
	{
		this.messages = messages;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
