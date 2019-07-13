package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.printAboutMovieActor();
        
         BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie mv1= (Movie) beanFactory.getBean("movie");
        mv1.printAboutMovieActor();

        BeanDefinitionRegistry factory = new XmlBeanFactory(new ClassPathResource("beans.xml));
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        Movie mv2 =((XmlBeanFactory)factory).getBean("movie",Movie.class);
        mv2.printAboutMovieActor();

    }
}
