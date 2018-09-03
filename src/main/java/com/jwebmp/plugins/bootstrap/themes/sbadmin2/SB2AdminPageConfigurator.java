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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "SB2 Admin Theme",
		pluginUniqueName = "sb2-admin-theme",
		pluginDescription = "SB Admin 2 Bootstrap admin theme, dashboard template, or webapp UI starter. The theme features a variety of custom jQuery plugins to add extended functionality past the built in Bootstrap UI features.",
		pluginVersion = "1.2",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "bootstrap,themes, admin",
		pluginSubtitle = "A Bootstrap admin theme, dashboard, or web app UI featuring powerful jQuery plugins for extended functionality.",
		pluginGitUrl = "https://github.com/BlackrockDigital/startbootstrap-sb-admin-2",
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-SB2AdminTheme",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-SB2AdminTheme",
		pluginOriginalHomepage = "https://startbootstrap.com/template-overviews/sb-admin-2/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/SB2AdminTheme.jar/download",
		pluginIconUrl = "startbootstrap-sb-admin-2/icon.png",
		pluginIconImageUrl = "startbootstrap-sb-admin-2/example.jpg",
		pluginLastUpdatedDate = "2017/03/04"
)
public class SB2AdminPageConfigurator
		implements IPageConfigurator
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return SB2AdminPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		SB2AdminPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return SB2AdminPageConfigurator.enabled;
	}

}
