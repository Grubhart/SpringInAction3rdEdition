package com.springInAction.springIdol;

/**
 * Created by Edson on 24/11/2016.
 */
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


