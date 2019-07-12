package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
      AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
      BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
      context.registerShutdownHook();
        /*Movie movie1=context.getBean("movie1",Movie.class);

        BeanFactory beanFactory=new  XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=context.getBean("movie2",Movie.class);
       // movie1.printAboutMovieActor();
        System.out.println();
        movie2.setBeanFactory(beanFactory);
        movie1.setApplicationContext(context);
        movie1.setBeanName("Movie Bean");*/






    }
}
