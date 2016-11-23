package com.springinaction.knights;

import com.springinaction.knights.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight= (Knight)ctx.getBean("knight");
        knight.embarkOnQuest();
    }
}
