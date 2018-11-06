package com.jwebmp.plugins.bootstrap.themes.sbadmin2.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SB2ExclusionsModule
		implements IGuiceScanModuleExclusions<SB2ExclusionsModule>,
				           IGuiceScanJarExclusions<SB2ExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-sb2-admin-theme-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.components.bootstrap.themes.sbadmin2");
		return strings;
	}
}
