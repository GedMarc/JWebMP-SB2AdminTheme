/*
 * Copyright (C) 2016 GedMarc
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
package com.jwebmp.components.jquery.bootstrap.themes.sbadmin2.chat;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat.SB2ChatLeftMessage;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat.SB2ChatPanel;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat.SB2ChatRightMessage;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class SB2ChatPanelTest

{

	public SB2ChatPanelTest()
	{
	}

	@Test
	public void testChatLeft()
	{
		SB2ChatPanel chatPanel = new SB2ChatPanel();
		chatPanel.getChatList()
		         .add(new SB2ChatLeftMessage());
		chatPanel.getPanelHeader()
		         .add("Text or something");
		chatPanel.getPanelBody()
		         .add("stuff 2");
		chatPanel.getPanelFooter()
		         .add("stuff 3");
		System.out.println(chatPanel.toString(true));
	}

	@Test
	public void testChatRight()
	{
		SB2ChatPanel chatPanel = new SB2ChatPanel();
		chatPanel.getChatList()
		         .add(new SB2ChatRightMessage());
		chatPanel.getPanelHeader()
		         .add("Text or something");
		chatPanel.getPanelBody()
		         .add("stuff 2");
		chatPanel.getPanelFooter()
		         .add("stuff 3");
		System.out.println(chatPanel.toString(true));
	}

	@Test
	public void testLink()
	{
		SB2ChatPanel chatPanel = new SB2ChatPanel();
		chatPanel.getPanelHeader()
		         .add("Text or something");
		chatPanel.getPanelBody()
		         .add("stuff 2");
		chatPanel.getPanelFooter()
		         .add("stuff 3");
		System.out.println(chatPanel.toString(true));
	}

	@Test
	public void testDiv()
	{
		SB2ChatPanel chatPanel = new SB2ChatPanel();
		chatPanel.getPanelHeader()
		         .add("stuff");
		chatPanel.getPanelBody()
		         .add("stuff 2");
		chatPanel.setPanelFooter(new Div());
		chatPanel.getPanelFooter()
		         .add("stuff 3");
		System.out.println(chatPanel.toString(true));
	}

}
