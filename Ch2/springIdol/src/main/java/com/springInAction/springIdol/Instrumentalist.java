package com.springInAction.springIdol;


public class Instrumentalist implements Performer {

    private Instrument instrument;

    private String song;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.println("playing "+song+" :");
        instrument.play();

    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
