package com.springInAction.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Edson on 24/11/2016.
 */
public class SpringIdolMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Juggler)ctx.getBean("duke");
        performer.perform();
    }
}
