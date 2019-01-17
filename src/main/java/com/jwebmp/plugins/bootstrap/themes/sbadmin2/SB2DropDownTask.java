/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.themes.sbadmin2;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * A standard message display format from SB2 Admin Theme
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
@ComponentInformation(name = "SB2 Drop Down Tasks",
		description = "A shortcut to generating the tasks with progress bar drop downs",
		url = "https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html")
public class SB2DropDownTask
		extends JavaScriptPart
{


	/**
	 * The name in bold
	 */
	private String name;
	/**
	 * The message to display
	 */
	private String message;

	/**
	 * The percentage
	 */
	private double percentage;
	/**
	 * Any particular URL to point to
	 */
	private String url;
	/**
	 * Any applicable data field
	 */
	private String data;

	/**
	 * Constructs a new standardized drop down message
	 */
	public SB2DropDownTask()
	{

	}

	/**
	 * With just a name
	 *
	 * @param name
	 */
	public SB2DropDownTask(String name)
	{
		this.name = name;
	}

	/**
	 * Returns the given percentage for this guy
	 *
	 * @return
	 */
	public double getPercentage()
	{
		return percentage;
	}

	/**
	 * Sets a given percentage for this guy
	 *
	 * @param percentage
	 */
	public void setPercentage(double percentage)
	{
		this.percentage = percentage;
	}

	/**
	 * The physical Bold component (text is in getText(
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Gets the current message
	 *
	 * @return
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Sets the current message
	 *
	 * @param message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * Any linking URL
	 *
	 * @return
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * Sets the URL to go to
	 *
	 * @param url
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * Any data that needs to be stored
	 *
	 * @return
	 */
	public String getData()
	{
		return data;
	}

	/**
	 * Any data that needs to be stored
	 *
	 * @param data
	 */
	public void setData(String data)
	{
		this.data = data;
	}
}
