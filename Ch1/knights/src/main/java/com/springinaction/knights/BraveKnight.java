package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;
import com.springinaction.quests.Quest;


public class BraveKnight implements Knight{

    private Quest quest;
    private Minstrel minstrel;




    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel= minstrel;
    }

    public void embarkOnQuest()throws QuestException{
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}

