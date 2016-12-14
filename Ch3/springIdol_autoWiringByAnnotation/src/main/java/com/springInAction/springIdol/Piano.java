package com.springInAction.springIdol;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument{
    public void play() {
        System.out.println("Plin Plin Plin");
    }
}
