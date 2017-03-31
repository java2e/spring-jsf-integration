package com.demircioglumhmt;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Define dispatcher and ServletContext
 * Web initiliazing with spring framework
 * @author mdemircioglu
 *
 */

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("start-up");
		
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(SpringConfiguration.class);
		ctx.setServletContext(servletContext);
		servletContext.addListener(new ContextLoaderListener(ctx));
		servletContext.addListener(new RequestContextListener());
		Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
		
		
	}



}
