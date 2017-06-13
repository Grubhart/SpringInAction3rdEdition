package com.springInAction.springIdol;


public class PoeticJuggler extends Juggler{

    private Poem poem;

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
