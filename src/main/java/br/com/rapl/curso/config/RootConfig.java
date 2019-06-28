package br.com.rapl.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// @ComponentScan diz ao framework onde ele irá procurar as classes que ela vai gerenciar

@Configuration
@ComponentScan("br.com.rapl.curso")	
@EnableWebMvc
public class RootConfig {

}
