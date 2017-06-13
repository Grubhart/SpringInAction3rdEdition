package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class OneManBand implements Performer{

    @Autowired
    private Map<String,Instrument> mapInstrument;

    @Autowired
    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {


        //map
        for(String key : mapInstrument.keySet()){
            System.out.println(key + ":");
            Instrument instrument = mapInstrument.get(key);
            instrument.play();
        }

        //List Instruments
        for(Instrument instrument : instruments){
            instrument.play();
        }


    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setMapInstrument(Map<String, Instrument> mapInstrument) {
        this.mapInstrument = mapInstrument;
    }
}
