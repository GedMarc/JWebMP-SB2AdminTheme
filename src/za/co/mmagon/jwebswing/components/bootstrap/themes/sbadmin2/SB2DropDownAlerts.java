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

import za.co.mmagon.jwebswing.base.html.*;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSColoursOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSDefaultOptions;
import za.co.mmagon.jwebswing.plugins.moment.Moment;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_SPACE;

/**
 * A shortcut class to building drop down message types
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
public class SB2DropDownAlerts extends SB2DropDown
{

	private static final long serialVersionUID = 1L;

	private java.util.List<SB2DropDownAlert> messages;

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 */
	public SB2DropDownAlerts()
	{
		this(null);
	}

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 *
	 * @param messages
	 */
	public SB2DropDownAlerts(List<SB2DropDownAlert> messages)
	{
		this.messages = messages;
		getDropDownContents().addClass(SB2ThemeClasses.DropDown_Tasks);
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
	public static SB2DropDownAlerts fromUrl(URL content) throws IOException
	{
		List list2 = new JavaScriptPart().FromToList(content, SB2DropDownAlert[].class);
		SB2DropDownAlerts messages = new SB2DropDownAlerts(list2);
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
				                      Link link = new Link(STRING_HASH);
				                      Italic i = buildItalicEntry(message);

				                      Div topSection = buildTopSection(message);
				                      topSection.add(i);
				                      li.add(link);
				                      link.add(topSection);

				                      getDropDownContents().add(li);
				                      addDivider();
			                      });
		}
		super.preConfigure();
	}

	protected Italic buildItalicEntry(SB2DropDownAlert message)
	{
		Italic i = new Italic()
		{
			private static final long serialVersionUID = 1L;

			@Override
			protected StringBuilder renderAfterTag()
			{
				StringBuilder sb = new StringBuilder();
				sb.append(STRING_SPACE).append(message.getMessage());
				return sb;
			}
		};
		i.addClass(message.getIcon());
		return i;
	}

	protected Div buildTopSection(SB2DropDownAlert message)
	{
		Div topSection = new Div();
		Span span = new Span();
		span.addClass(BSDefaultOptions.Pull_Right);
		span.addClass(BSDefaultOptions.Text_Muted);
		topSection.add(span);
		Moment date = new Moment(message.getDate(), ComponentTypes.Span);

		date.addClass(BSDefaultOptions.Pull_Right);
		date.addClass(BSColoursOptions.Text_Muted);
		topSection.add(date);
		return topSection;
	}

	/**
	 * Returns the current messages
	 *
	 * @return
	 */
	public List<SB2DropDownAlert> getMessages()
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
	public void setMessages(List<SB2DropDownAlert> messages)
	{
		this.messages = messages;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2DropDownAlerts))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2DropDownAlerts that = (SB2DropDownAlerts) o;

		return getMessages().equals(that.getMessages());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getMessages().hashCode();
		return result;
	}
}
