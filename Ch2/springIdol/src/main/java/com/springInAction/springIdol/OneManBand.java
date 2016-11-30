package com.springInAction.springIdol;

import sun.instrument.InstrumentationImpl;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer{

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for(Instrument instrument : instruments){
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
