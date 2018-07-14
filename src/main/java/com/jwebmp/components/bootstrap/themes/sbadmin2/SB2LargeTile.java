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
package com.jwebmp.components.bootstrap.themes.sbadmin2;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.Span;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.containers.BSRow;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap.panel.BSPanel;
import com.jwebmp.plugins.bootstrap.panel.BSPanelThemes;

/**
 * The SB Admin 2 Tile
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 3, 2016
 */
@ComponentInformation(name = "SB2 Large Tile",
		description = "A large tile showing a icon, large text, a sub text and a navigation link",
		url = "https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html")
public class SB2LargeTile
		extends Div
{

	private static final long serialVersionUID = 1L;

	private ComponentHierarchyBase description;
	private ComponentHierarchyBase footer;

	private BSPanel panel;

	private String footerText;
	private String footerGoIcon;

	private ComponentHierarchyBase icon;
	private ComponentHierarchyBase title;

	/**
	 * Constructs a new large admin tile
	 */
	public SB2LargeTile()
	{

	}

	/**
	 * @param largeIcon
	 * 		The large icon on the left
	 * @param title
	 * 		The large text on the right
	 * @param description
	 * 		The text under the title
	 * @param footer
	 * 		The footer to display
	 */
	public SB2LargeTile(ComponentHierarchyBase largeIcon, String title, ComponentHierarchyBase description, ComponentHierarchyBase footer)
	{
		this(largeIcon, new Div(title), description, footer);
	}

	/**
	 * @param largeIcon
	 * 		The large icon on the left
	 * @param title
	 * 		The large text on the right
	 * @param description
	 * 		The text under the title
	 * @param footer
	 * 		The footer to display
	 */
	public SB2LargeTile(ComponentHierarchyBase largeIcon, ComponentHierarchyBase title, ComponentHierarchyBase description, ComponentHierarchyBase footer)
	{
		setIcon(largeIcon);
		setTitle(title);
		setDescription(description);
		setFooter(footer);

		addClass("col-lg-3 col-md-6");
	}

	/**
	 * @param largeIcon
	 * 		The large icon on the left
	 * @param title
	 * 		The large text on the right
	 * @param description
	 * 		The text under the title
	 * @param footer
	 * 		The footer to display
	 */
	public SB2LargeTile(ComponentHierarchyBase largeIcon, String title, String description, ComponentHierarchyBase footer)
	{
		this(largeIcon, new Div(title), new Div(description), footer);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getPanel().setPanelBody(null); //no body on the large tile

			Div rightSide = new Div();
			rightSide.addClass("col-xs-9");

			BSRow headerRow = new BSRow();
			if (this.icon != null)
			{
				Div iconDiv = new Div();
				iconDiv.addClass("col-xs-3");
				iconDiv.add(this.icon);
				iconDiv.addClass("pull-left");
				headerRow.add(iconDiv);
			}

			if (this.title != null)
			{
				Div iconDiv = new Div();
				iconDiv.addClass("col-xs-12");
				iconDiv.add(getTitle());
				iconDiv.addClass("pull-right");
				getTitle().addClass("huge");
				rightSide.add(iconDiv);
			}

			panel.getPanelHeader()
			     .add(headerRow);

			rightSide.add(getDescription());
			rightSide.addClass(BSDefaultOptions.Text_Right);

			headerRow.add(rightSide);

			Span footerTextSpan = new Span();
			footerTextSpan.setText(footerText);
			footerTextSpan.addClass("pull-left");
			Span footerTextIconSpan = new Span();
			footerTextIconSpan.add(footerGoIcon);
			footerTextIconSpan.addClass("pull-right");

			Div footerDiv = new Div();
			Div clearFix = new Div();
			clearFix.addClass("clearfix");

			footerDiv.add(footerTextSpan);
			footerDiv.add(footerTextIconSpan);
			footerDiv.add(clearFix);

			getPanel().getPanelFooter()
			          .add(footerDiv);

			setConfigured(true);
			add(getPanel());
		}
		super.preConfigure();
	}

	public BSPanel getPanel()
	{
		if (panel == null)
		{
			panel = new BSPanel(BSPanelThemes.Default);
		}

		return panel;
	}

	public void setPanel(BSPanel panel)
	{
		getChildren().remove(this.panel);
		this.panel = panel;
		if (this.panel != null)
		{
			add(this.panel);
		}
	}

	/**
	 * The large text on the right
	 *
	 * @return
	 */
	public ComponentHierarchyBase getTitle()
	{
		if (title == null)
		{
			setTitle("");
		}
		return title;
	}

	/**
	 * The text under the title
	 *
	 * @return
	 */
	public ComponentHierarchyBase getDescription()
	{
		if (description == null)
		{
			setDescription(new Div());
		}
		return description;
	}

	/**
	 * The text under the title
	 *
	 * @param description
	 */
	public final void setDescription(ComponentHierarchyBase description)
	{
		this.description = description;
	}

	/**
	 * Sets the title space of the div
	 *
	 * @param title
	 *
	 * @return
	 */
	public Div setTitle(String title)
	{
		Div titleDiv = new Div();
		titleDiv.setText(title);
		this.title = titleDiv;
		return titleDiv;
	}

	/**
	 * The large text on the right
	 *
	 * @param title
	 */
	public final void setTitle(ComponentHierarchyBase title)
	{
		this.title = title;
		if (!(this.title instanceof Div))
		{
			Div d = new Div();
			d.add(title);
			this.title = d;
		}
	}

	/**
	 * The text under the title
	 *
	 * @param description
	 *
	 * @return
	 */
	public Div setDescription(String description)
	{
		Div descDiv = new Div();
		descDiv.setText(description);
		this.description = descDiv;
		return descDiv;
	}

	/**
	 * The large icon on the left
	 *
	 * @param largeIcon
	 */
	public void setLargeIcon(ComponentHierarchyBase largeIcon)
	{
		this.icon = largeIcon;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2LargeTile))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2LargeTile that = (SB2LargeTile) o;

		if (!getDescription().equals(that.getDescription()))
		{
			return false;
		}
		if (!getFooter().equals(that.getFooter()))
		{
			return false;
		}
		if (!getPanel().equals(that.getPanel()))
		{
			return false;
		}
		if (getFooterText() != null ? !getFooterText().equals(that.getFooterText()) : that.getFooterText() != null)
		{
			return false;
		}
		if (getFooterGoIcon() != null ? !getFooterGoIcon().equals(that.getFooterGoIcon()) : that.getFooterGoIcon() != null)
		{
			return false;
		}
		if (!getIcon().equals(that.getIcon()))
		{
			return false;
		}
		return getTitle().equals(that.getTitle());
	}

	/**
	 * The footer to display
	 *
	 * @return
	 */
	public ComponentHierarchyBase getFooter()
	{
		if (footer == null)
		{
			setFooter(new Div());
		}
		return footer;
	}

	/**
	 * The footer to display
	 *
	 * @param footer
	 */
	public final void setFooter(ComponentHierarchyBase footer)
	{
		if (footer != null)
		{
			footer.addClass("panel-footer");
		}
		this.footer = footer;
	}

	/**
	 * Returns the footer text
	 *
	 * @return
	 */
	public String getFooterText()
	{
		return footerText;
	}

	/**
	 * The footer text
	 *
	 * @param footerText
	 */
	public void setFooterText(String footerText)
	{
		this.footerText = footerText;
	}

	/**
	 * The icon for the footer go to
	 *
	 * @return
	 */
	public String getFooterGoIcon()
	{
		return footerGoIcon;
	}

	/**
	 * The icon for the footer to go to
	 *
	 * @param footerGoIcon
	 */
	public void setFooterGoIcon(String footerGoIcon)
	{
		this.footerGoIcon = footerGoIcon;
	}

	/**
	 * The large icon on the left
	 *
	 * @return
	 */
	public ComponentHierarchyBase getIcon()
	{
		return icon;
	}

	/**
	 * The large icon on the left
	 *
	 * @param icon
	 */
	public final void setIcon(ComponentHierarchyBase icon)
	{
		this.icon = icon;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getDescription().hashCode();
		result = 31 * result + getFooter().hashCode();
		result = 31 * result + getPanel().hashCode();
		result = 31 * result + (getFooterText() != null ? getFooterText().hashCode() : 0);
		result = 31 * result + (getFooterGoIcon() != null ? getFooterGoIcon().hashCode() : 0);
		result = 31 * result + getIcon().hashCode();
		result = 31 * result + getTitle().hashCode();
		return result;
	}
}
