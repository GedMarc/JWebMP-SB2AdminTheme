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

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.base.interfaces.ICssClassName;
import com.jwebmp.core.utilities.StaticStrings;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * A list of all the classes with SB Admin 2 theme https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 3, 2016
 */
public enum SB2ThemeClasses
		implements ICssClassName
{
	Panel,
	Panel_Default,
	Panel_Heading,
	Panel_Primary,
	Panel_Secondary,
	Panel_Warning,
	Panel_Danger,
	Panel_Info,
	Panel_Footer,
	Panel_Body,
	Navbar_Top_Links,
	DropDown,
	DropDown_Menu,
	DropDown_Messages,
	DropDown_Tasks,
	DropDown_Alerts,
	DropDown_User,
	DropDown_Toggle,
	Sidebar,
	Sidebar_Search,
	Sidebar_Nav,
	Navbar_Collapse,
	Nav_Second_Level,
	Nav_Third_Level,
	Chat,
	Chat_Img,
	Chat_Body,
	Chat_Panel,
	Login_Panel,
	Show_Grid,
	Panel_Green,
	Panel_Red,
	Panel_Yellow,
	Timeline,
	Timeline_Badge$Primary,
	Timeline_Badge$Success,
	Timeline_Badge$Warning,
	Timeline_Badge$Danger,
	Timeline_Badge$Info,
	Timeline_Title,
	Timeline_Body,
	Navbar_Default,
	Navbar_Static_Top,
	Navbar_Brand,
	Navbar,
	Navbar_Header,
	Nav,
	Navbar_Right;

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		             .replace('$', CHAR_SPACE);
	}

}
