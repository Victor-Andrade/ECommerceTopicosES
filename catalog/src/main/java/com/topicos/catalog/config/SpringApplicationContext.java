package com.topicos.catalog.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplicationContext {

    private static ApplicationContext CONTEXT;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        CONTEXT = context;
    }

    public static Object getBean(String beanName) {
        return CONTEXT.getBean(beanName);
    }

}
