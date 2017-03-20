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
package za.co.mmagon.jwebswing.components.bootstrap.themes;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 *
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum SB2BootstrapReferencePool implements ReferencePool
{

    BootstrapSBAdmin2Reference(null, new CSSReference("BSAdmin2Theme", 3.36, "startbootstrap-sb-admin-2/dist/css/sb-admin-2.css")),
    BootstrapTimelineReference(null, new CSSReference("BSAdmin2TimelineTheme", 3.36, "startbootstrap-sb-admin-2/dist/css/timeline.css")),
    BootstrapSocialThemeReference(null, new CSSReference("BSSocialTheme", 3.36, "bootstrap-social/bootstrap-social.css")),;

    private SB2BootstrapReferencePool()
    {
    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private SB2BootstrapReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.Third);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.Third);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
    }
}
