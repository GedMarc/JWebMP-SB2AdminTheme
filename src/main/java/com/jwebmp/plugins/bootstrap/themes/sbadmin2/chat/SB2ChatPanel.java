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
package com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.panel.BSPanelDefault;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2DropDown;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2ThemeClasses;

/**
 * The default chat panel that takes chat message types
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 9, 2016
 */
public class SB2ChatPanel
		extends BSPanelDefault
{

	private static final long serialVersionUID = 1L;

	/**
	 * The drop down menu in the header bar
	 */
	private SB2DropDown dropDownMenu;
	/**
	 * The list of chat messages
	 */
	private List<ISB2ChatMessage, NoAttributes, GlobalEvents, ? extends List> chatList;

	//private SB2ChatLeftMessage

	/**
	 * A default sb2 chat panel
	 */
	public SB2ChatPanel()
	{
		addClass(SB2ThemeClasses.Chat_Panel);
	}

	/**
	 * A default sb2 chat panel with the given settings
	 *
	 * @param icon
	 * 		The icon
	 * @param title
	 * 		The title
	 */
	public SB2ChatPanel(String icon, String title)
	{
		super(icon, title);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2ChatPanel))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2ChatPanel that = (SB2ChatPanel) o;

		if (!getDropDownMenu().equals(that.getDropDownMenu()))
		{
			return false;
		}
		return getChatList().equals(that.getChatList());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getDropDownMenu().hashCode();
		result = 31 * result + getChatList().hashCode();
		return result;
	}

	/**
	 * Returns the drop down menu attached
	 *
	 * @return
	 */
	public SB2DropDown getDropDownMenu()
	{
		if (dropDownMenu == null)
		{
			dropDownMenu = new SB2DropDown();
		}
		return dropDownMenu;
	}

	/**
	 * Sets the drop down menu attached
	 *
	 * @param dropDownMenu
	 */
	public void setDropDownMenu(SB2DropDown dropDownMenu)
	{
		this.dropDownMenu = dropDownMenu;
	}

	/**
	 * Returns the list used to display the chat messages
	 *
	 * @return
	 */
	public List<ISB2ChatMessage, NoAttributes, GlobalEvents, ? extends List> getChatList()
	{
		if (chatList == null)
		{
			setChatList(new List(false));
		}
		return chatList;
	}

	/**
	 * Sets the list used to display the messages
	 *
	 * @param chatList
	 */
	public void setChatList(List<ISB2ChatMessage, NoAttributes, GlobalEvents, ? extends List> chatList)
	{
		remove(this.chatList);
		this.chatList = chatList;
		if (this.chatList != null)
		{
			this.chatList.addClass(SB2ThemeClasses.Chat);
			getPanelBody().add(this.chatList);
		}
	}
}
