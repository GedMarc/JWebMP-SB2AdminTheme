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
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.BSProgressBar;
import za.co.mmagon.jwebswing.plugins.bootstrap.progressbar.bar.BSProgressBarThemes;

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
public class SB2DropDownTasks extends SB2DropDown
{

	private static final long serialVersionUID = 1L;

	private java.util.List<SB2DropDownTask> messages;

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 */
	public SB2DropDownTasks()
	{
		this(null);
	}

	/**
	 * Construct a new sb admin 2 dropdown formatted as messages
	 *
	 * @param messages
	 */
	public SB2DropDownTasks(java.util.List<SB2DropDownTask> messages)
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
	public static SB2DropDownTasks fromUrl(URL content) throws IOException
	{
		List list2 = new JavaScriptPart().FromToList(content, SB2DropDownTask[].class);
		SB2DropDownTasks messages = new SB2DropDownTasks(list2);
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
				                      Link link = new Link("#");
				                      Div container = new Div();
				                      Paragraph topSection = new Paragraph();
				                      Span span = new Span();
				                      span.addClass("pull-right");
				                      span.addClass("text-muted");
				                      span.setText(message.getPercentage() + "% Complete");

				                      topSection.add(new Bold(message.getName()));
				                      topSection.add(span);

				                      BSProgressBar progressBar = new BSProgressBar(true);
				                      progressBar.getProgressBar().setMin(0);
				                      progressBar.getProgressBar().setMax(100);
				                      progressBar.getProgressBar().setValue(message.getPercentage());
				                      progressBar.getProgressBar().setLabel("" + message.getPercentage() + " % Complete");
				                      progressBar.setActive(true);
				                      progressBar.getProgressBar().setTheme(BSProgressBarThemes.valueOf(message.getData()));
				                      //progressBar.add(message.getMessage());

				                      container.add(topSection);
				                      container.add(progressBar);
				                      li.add(link);
				                      link.add(container);
				                      getDropDownContents().add(li);
				                      addDivider();
			                      });
		}
		super.preConfigure();
	}

	/**
	 * Returns the current messages
	 *
	 * @return
	 */
	public java.util.List<SB2DropDownTask> getMessages()
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
	public void setMessages(List<SB2DropDownTask> messages)
	{
		this.messages = messages;
	}
}
