package com.springmvc.training.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "com.springmvc.training.controller",
        "com.springmvc.training.exception",
        "com.springmvc.training.interceptor"
})
public class WebConfig implements WebMvcConfigurer {

    // Later: override addInterceptors(InterceptorRegistry registry) to register the interceptor.
}
