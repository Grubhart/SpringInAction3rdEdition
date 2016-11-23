package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;
import com.springinaction.quests.Quest;


public class BraveKnight implements Knight{

    private Quest quest;


    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;

    }

    public void embarkOnQuest()throws QuestException{

        quest.embark();

    }
}

