package com.springInAction.springIdol;


import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer{

    private Map<String,Instrument> mapInstrument;

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
