package com.springInAction.springIdol;

import org.springframework.stereotype.Component;

@Component
public class Stage {

    public Stage() {

    }

    private static class  StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}


