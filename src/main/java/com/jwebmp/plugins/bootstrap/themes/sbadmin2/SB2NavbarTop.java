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

import com.jwebmp.core.Component;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.ListItem;

import java.util.Iterator;

/**
 * The SB 2 nav bar component
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
public class SB2NavbarTop
		extends Div
{


	private Component leftHeader;
	private List rightHeader;

	/**
	 * Constructs an empty NavBar top
	 */
	public SB2NavbarTop()
	{
		this(null, null);
	}

	/**
	 * Constructs a new SB@ NavBar top with the given header, and menu list
	 *
	 * @param leftHeader
	 * @param menuList
	 */
	public SB2NavbarTop(Component leftHeader, List menuList)
	{
		setLeftHeader(leftHeader);
		setRightHeader(menuList);
		setTag("nav");
		addClass(SB2ThemeClasses.Navbar);
		addClass(SB2ThemeClasses.Navbar_Default);
		addClass(SB2ThemeClasses.Navbar_Static_Top);
	}

	@Override
	public void preConfigure()
	{
		if (rightHeader != null)
		{
			for (Iterator iterator = rightHeader.getChildren()
			                                    .iterator(); iterator.hasNext(); )
			{
				ComponentHierarchyBase next = (ComponentHierarchyBase) iterator.next();
				if (next instanceof ListItem)
				{
					ListItem li = (ListItem) next;
					li.addClass(SB2ThemeClasses.DropDown);
				}
			}
		}
		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getLeftHeader() != null ? getLeftHeader().hashCode() : 0);
		result = 31 * result + (getRightHeader() != null ? getRightHeader().hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2NavbarTop))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2NavbarTop that = (SB2NavbarTop) o;

		if (getLeftHeader() != null ? !getLeftHeader().equals(that.getLeftHeader()) : that.getLeftHeader() != null)
		{
			return false;
		}
		return getRightHeader() != null ? getRightHeader().equals(that.getRightHeader()) : that.getRightHeader() == null;
	}

	/**
	 * The left bar header
	 *
	 * @return
	 */
	public Component getLeftHeader()
	{
		return leftHeader;
	}

	/**
	 * The left bar header
	 *
	 * @param leftHeader
	 */
	public final void setLeftHeader(Component leftHeader)
	{
		getChildren().remove(this.leftHeader);
		this.leftHeader = leftHeader;
		if (this.leftHeader != null)
		{
			leftHeader.addClass(SB2ThemeClasses.Navbar_Header);
			getChildren().add(this.leftHeader);
		}
	}

	/**
	 * Gets the menu list for the nav-bar
	 *
	 * @return
	 */
	public List getRightHeader()
	{
		return rightHeader;
	}

	/**
	 * Sets the menu list for the nav-bar
	 *
	 * @param rightHeader
	 */
	public final void setRightHeader(List rightHeader)
	{
		getChildren().remove(this.rightHeader);
		this.rightHeader = rightHeader;
		if (rightHeader != null)
		{
			rightHeader.addClass(SB2ThemeClasses.Nav);
			rightHeader.addClass(SB2ThemeClasses.Navbar_Top_Links);
			rightHeader.addClass(SB2ThemeClasses.Navbar_Right);
			getChildren().add(this.rightHeader);
		}
	}
}
