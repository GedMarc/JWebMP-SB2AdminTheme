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
package com.jwebmp.components.jquery.bootstrap.themes;

import com.jwebmp.Page;
import com.jwebmp.base.html.Body;
import com.jwebmp.base.html.Comment;
import com.jwebmp.components.bootstrap.themes.SB2Theme;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class SBAdmin2ThemeTest

{

	public SBAdmin2ThemeTest()
	{
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testAddingThemeToBody()
	{
		SB2Theme theme = new SB2Theme();
		Page p = new Page();
		Body b = p.getBody();
		b.add(new Comment("Stuff"));
		b.addTheme(theme);

		System.out.println(p.toString(true));

	}

	@Test
	@SuppressWarnings("unchecked")
	public void testAddingThemeToAny()
	{
		SB2Theme theme = new SB2Theme();
		Page p = new Page();
		Body b = p.getBody();
		b.add(new Comment("Stuff"));
		b.addTheme(theme);
	}
}
