package com.springInAction.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Juggler)ctx.getBean("poeticJuggler");
        performer.perform();

        performer = (Instrumentalist) ctx.getBean("instrumentalist");// kenny

        performer.perform();

        System.out.println("now enter oneManBand");
        performer = (OneManBand) ctx.getBean("oneManBand");
        performer.perform();

    }
}
