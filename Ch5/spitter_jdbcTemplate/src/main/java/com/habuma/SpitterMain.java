package com.habuma;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpitterMain {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dataSource-context.xml");

        ctx.getBean("simpleJdbcTemplateSpitterDao");
    }

}

