package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;
import com.springinaction.quests.Quest;

/**
 * Created by Edson on 22/11/2016.
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest()throws QuestException{
        quest.embark();
    }
}

