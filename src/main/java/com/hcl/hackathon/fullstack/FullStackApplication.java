package com.hcl.hackathon.fullstack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Arrays;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan("com.hcl.hackathon.fullstack")
public class FullStackApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(FullStackApplication.class);

	private static void verbose(ApplicationContext ctx) {
		LOGGER.debug("Let's inspect the beans provided by Spring Boot:");
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			LOGGER.debug(beanName);
		}
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FullStackApplication.class, args);

		// Print out the cdi contect for debug perpose ...
		FullStackApplication.verbose(context);
	}
}