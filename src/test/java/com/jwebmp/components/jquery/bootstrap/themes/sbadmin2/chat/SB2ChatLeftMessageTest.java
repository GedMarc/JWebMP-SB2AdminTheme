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
package com.jwebmp.components.jquery.bootstrap.themes.sbadmin2.chat;

import com.jwebmp.components.bootstrap.themes.sbadmin2.chat.SB2ChatLeftMessage;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author GedMarc
 */
public class SB2ChatLeftMessageTest

{

	public SB2ChatLeftMessageTest()
	{
	}

	/**
	 * Test of preConfigure method, of class SB2ChatLeftMessage.
	 */
	@Test
	public void testLeftMessage()
	{
		SB2ChatLeftMessage message = new SB2ChatLeftMessage();
		message.setMessageDate(new Date());
		System.out.println(message.toString(true));
		//message.setHeaderText(headerText);
	}

}
