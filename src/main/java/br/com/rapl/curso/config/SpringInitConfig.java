package br.com.rapl.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// "simula" o arquivo web.xml. É a classe que é executada inicialmente quando a aplicação é inicializada

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	// classe raiz. Quando o servidor iniciar vai subir a aplicação e esta classe será a primeira configuração da aplicação

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	// classe que tem a parte de servlet
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcConfig.class};
	}

	// toda vez que a aplicação encontrar na URL uma "/" ela saberá que está lidando com um servlet
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	
}
