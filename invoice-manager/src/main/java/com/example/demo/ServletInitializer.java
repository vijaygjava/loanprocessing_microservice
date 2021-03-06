package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InvoiceManagerApplication.class);
	}

}

//https://www.briansdevblog.com/2019/04/service-integration-with-netflix-feign-and-ribbon/