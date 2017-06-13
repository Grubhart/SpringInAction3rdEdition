package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler{


    @Autowired
    private Poem poem;

    public PoeticJuggler() {
    }

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }


    public PoeticJuggler(int beanBangs, Poem poem) {
        super(beanBangs);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting ...");

        poem.recite();

    }
}
