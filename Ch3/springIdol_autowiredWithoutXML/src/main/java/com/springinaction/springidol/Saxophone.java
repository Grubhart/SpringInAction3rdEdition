package com.springinaction.springidol;


import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {

    public void play() {
        System.out.println("Toot Toot");
    }
}
