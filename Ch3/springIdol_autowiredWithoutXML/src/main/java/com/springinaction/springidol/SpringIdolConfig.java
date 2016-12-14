package com.springinaction.springidol;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke(){
        return new Juggler();
    }

    @Bean
    public Performer duke15(){
        return new Juggler(15);
    }

    @Bean
    public Performer keny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("jingle bells");
        return kenny;
    }

    @Bean
    public Poem sonet29(){
        return new Sonet29();
    }

    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonet29());
    }





}
