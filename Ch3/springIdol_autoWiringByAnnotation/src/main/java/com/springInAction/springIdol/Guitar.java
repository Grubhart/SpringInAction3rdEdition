package com.springInAction.springIdol;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

    public void play() {
        System.out.println("clang, clang, clang");
    }
}
