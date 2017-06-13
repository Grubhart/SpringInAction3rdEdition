package com.springInAction.springIdol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    @Value("Jingle bell")
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
