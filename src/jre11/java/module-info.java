import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2AdminPageConfigurator;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.implementations.SB2ExclusionsModule;

module com.jwebmp.components.bootstrap.themes.sbadmin2 {

	exports com.jwebmp.plugins.bootstrap.themes.sbadmin2;
	exports com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.plugins.moment;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with SB2AdminPageConfigurator;
	provides IGuiceScanJarExclusions with SB2ExclusionsModule;
	provides IGuiceScanModuleExclusions with SB2ExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat to com.fasterxml.jackson.databind, com.jwebmp.core;
}
