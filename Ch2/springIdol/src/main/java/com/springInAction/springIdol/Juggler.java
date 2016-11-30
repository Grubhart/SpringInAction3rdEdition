package com.springInAction.springIdol;


public class Juggler implements Performer{

    private int beanBangs = 3;

    public Juggler() {
    }

    public Juggler(int beanBangs) {
        this.beanBangs = beanBangs;
    }

    public void perform() throws PerformanceException {

        System.out.println("Juggling "+beanBangs+" BeanBags!!!");
    }
}
