//package com.seleniumexpress.lc.config;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer 
//{
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//
//		AnnotationConfigWebApplicationContext webapplicationContext = new AnnotationConfigWebApplicationContext();
//		webapplicationContext.register(LoveCalculatorAppConfig.class);
//		
//		//create a Dispatcher servlet
//		DispatcherServlet dispatcherservlet = new DispatcherServlet(webapplicationContext);
//		
//		
//		//register dispatcherservelet with servletContext
//		 ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherservlet);
//		 myCustomDispatcherServlet.setLoadOnStartup(1);
//		 myCustomDispatcherServlet.addMapping("/");
//	
//	}
//
//}
