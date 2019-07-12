package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void destroy() throws Exception {
        System.out.println("Overridden method destroy");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("overridden method afterPropertiesSet");

    }
    public void customInit()
    {
        System.out.println("Bean Initialized");
    }
    public void customDestroy()
    {
        System.out.println("Bean Destroyed");
    }
}
