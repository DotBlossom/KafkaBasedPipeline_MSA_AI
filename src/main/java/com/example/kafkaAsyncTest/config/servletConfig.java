package com.example.kafkaAsyncTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class servletConfig {

    //Spring MVC thread inheritable(httpContext for jwt Partial Async response) Actions
    @Bean
    DispatcherServlet dispatcherServlet() {
        DispatcherServlet servlet = new DispatcherServlet();
        servlet.setThreadContextInheritable(true);
        return servlet;
    }
}
