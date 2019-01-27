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

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2AdminPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrap.themes.sbadmin2.implementations.SB2ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap.themes.sbadmin2.implementations.SB2ExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat to com.fasterxml.jackson.databind, com.jwebmp.core;
}
