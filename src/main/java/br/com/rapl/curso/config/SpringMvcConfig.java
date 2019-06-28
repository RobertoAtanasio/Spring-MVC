package br.com.rapl.curso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// dirá como utilizar o spring mvc
//public class SpringMvcConfig implements WebMvcConfigurer {
//public class SpringMvcConfig extends WebMvcConfigurerAdapter {

@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/resources/bootstrap/");
//	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");				// tipo de arquivo que será usado como página
		resolver.setViewClass(JstlView.class);	// tipo de recurso que será utilizado na página
		return resolver;
	}

//	@Override
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter(new TipoSexoConverter());
//	}
	
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
//		source.setBasename("messages");
//		return source;
//	}
	
}
