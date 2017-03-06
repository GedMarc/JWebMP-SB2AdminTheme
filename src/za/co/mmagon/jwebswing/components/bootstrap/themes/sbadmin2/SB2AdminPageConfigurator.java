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

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
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
public class SB2AdminPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
