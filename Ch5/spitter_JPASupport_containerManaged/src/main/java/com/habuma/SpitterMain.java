package com.habuma;


import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.persistence.SpitterDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpitterMain {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("persistence-context.xml");

        SpitterDao dao = (SpitterDao) ctx.getBean("spitterDao");

        Spitter spitter= new Spitter();
        spitter.setUsername("Edson");
        spitter.setEmail("edson@mail.com");
        spitter.setFullname("edson chavez");
        spitter.setPassword("passsword");
        dao.addSpitter(spitter);



    }

}

