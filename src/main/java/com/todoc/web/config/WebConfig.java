package com.todoc.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@Slf4j  
@Configuration  
public class WebConfig implements WebMvcConfigurer {  

    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
        registry.addResourceHandler("/**")  
                .addResourceLocations("file:src/main/resources/static/");  
    }  
}
