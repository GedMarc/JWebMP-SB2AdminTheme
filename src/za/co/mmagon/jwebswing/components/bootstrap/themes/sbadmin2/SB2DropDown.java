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

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.htmlbuilder.css.lists.ListCSS;
import za.co.mmagon.jwebswing.htmlbuilder.css.lists.ListStyleType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

/**
 * A drop down list item for the top nav bar. Comes out as an icon
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 4, 2016
 */
@ListCSS(ListStyleType = ListStyleType.none)
@ComponentInformation(name = "SB2 Drop Down", description = "A drop down button usable on the navigation bar", url = "https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html")
public class SB2DropDown extends ListItem
{

	private static final long serialVersionUID = 1L;

	private Component dropDownComponent;
	private List dropDownContents;

	public SB2DropDown()
	{
		super();
		addClass(SB2ThemeClasses.DropDown);
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
	public void setDropDownComponent(Button dropDownComponent)
	{
		getChildren().remove(this.dropDownComponent);
		this.dropDownComponent = dropDownComponent;
		if (this.dropDownComponent != null)
		{
			getChildren().add(this.getDropDownComponent());
			getDropDownComponent().addClass(SB2ThemeClasses.DropDown_Toggle);
			getDropDownComponent().addAttribute(ButtonAttributes.Data_Toggle, "dropdown");
		}
	}

	/**
	 * Adds a menu divider
	 *
	 * @return
	 */
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

		if (!getDropDownComponent().equals(that.getDropDownComponent()))
		{
			return false;
		}
		return getDropDownContents().equals(that.getDropDownContents());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getDropDownComponent().hashCode();
		result = 31 * result + getDropDownContents().hashCode();
		return result;
	}
}
