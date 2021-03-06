package com.springInAction.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Juggler)ctx.getBean("duke");
        performer.perform();


        System.out.println(" Now enter Kenny, autowired ByName");
        performer = (Instrumentalist) ctx.getBean("kenny");
        performer.perform();

        performer = (OneManBand) ctx.getBean("hank");
        performer.perform();

    }
}
