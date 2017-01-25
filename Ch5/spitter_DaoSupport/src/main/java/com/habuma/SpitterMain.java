package com.habuma;


import com.habuma.domain.spitter.persistence.Spitter;
import com.habuma.spitter.persistence.SimpleSpitterDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpitterMain {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dataSource-context.xml");

        SimpleSpitterDao dao = (SimpleSpitterDao) ctx.getBean("spitterDao");

        Spitter spitter= new Spitter();
        spitter.setUsername("Edson");
        spitter.setEmail("edson@mail.com");
        spitter.setFullname("edson chavez");
        spitter.setPassword("passsword");
        dao.addSpitter(spitter);



    }

}

