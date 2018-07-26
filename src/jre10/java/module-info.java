import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2AdminPageConfigurator;

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

	provides IPageConfigurator with SB2AdminPageConfigurator;
	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2 to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat to com.fasterxml.jackson.databind,com.jwebmp.core;
}
