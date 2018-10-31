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
package com.jwebmp.plugins.bootstrap.themes.sbadmin2;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.htmlbuilder.css.lists.ListCSS;
import com.jwebmp.core.htmlbuilder.css.lists.ListStyleType;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.utilities.StaticStrings;

/**
 * A drop down list item for the top nav bar. Comes out as an icon
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
@ListCSS(ListStyleType = ListStyleType.none)
@ComponentInformation(name = "SB2 Drop Down",
		description = "A drop down button usable on the navigation bar",
		url = "https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html")
public class SB2DropDown
		extends ListItem
{


	private Component dropDownComponent;
	private List dropDownContents;

	public SB2DropDown()
	{
		super();
		addClass(SB2ThemeClasses.DropDown);
	}

	/**
	 * Adds a menu divider
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ListItem addDivider()
	{
		ListItem divider = new ListItem();
		divider.addClass("divider");
		getDropDownContents().add(divider);
		return divider;
	}

	/**
	 * Sets the drop down contents
	 *
	 * @return
	 */
	public List getDropDownContents()
	{
		if (dropDownContents == null)
		{
			setDropDownContents(new List(false));
		}
		return dropDownContents;
	}

	/**
	 * Sets the drop down contents
	 *
	 * @param dropDownContents
	 */
	@SuppressWarnings("unchecked")
	public void setDropDownContents(List dropDownContents)
	{
		getChildren().remove(this.dropDownContents);
		this.dropDownContents = dropDownContents;
		if (this.dropDownContents != null)
		{
			getChildren().add(this.dropDownContents);
			this.dropDownContents.addClass(SB2ThemeClasses.DropDown_Menu);
		}
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2DropDown))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2DropDown that = (SB2DropDown) o;

		return getDropDownComponent().equals(that.getDropDownComponent()) && getDropDownContents().equals(that.getDropDownContents());
	}

	/**
	 * Returns the drop down component
	 *
	 * @return
	 */
	public Component getDropDownComponent()
	{
		if (dropDownComponent == null)
		{
			setDropDownComponent(new Link(StaticStrings.STRING_HASH));
		}
		return dropDownComponent;
	}

	/**
	 * Sets the drop down component
	 *
	 * @param dropDownComponent
	 */
	@SuppressWarnings("unchecked")
	public void setDropDownComponent(Link dropDownComponent)
	{
		getChildren().remove(this.dropDownComponent);
		this.dropDownComponent = dropDownComponent;
		if (this.dropDownComponent != null)
		{
			getChildren().add(this.dropDownComponent);
			dropDownComponent.addClass(SB2ThemeClasses.DropDown_Toggle);
			dropDownComponent.addAttribute(LinkAttributes.Data_Toggle, "dropdown");
		}
	}

	/**
	 * Sets the drop down component
	 *
	 * @param dropDownComponent
	 */
	@SuppressWarnings("unchecked")
	public void setDropDownComponent(Button dropDownComponent)
	{
		getChildren().remove(this.dropDownComponent);
		this.dropDownComponent = dropDownComponent;
		if (this.dropDownComponent != null)
		{
			getChildren().add(getDropDownComponent());
			getDropDownComponent().addClass(SB2ThemeClasses.DropDown_Toggle);
			getDropDownComponent().addAttribute(ButtonAttributes.Data_Toggle, "dropdown");
		}
	}

}
