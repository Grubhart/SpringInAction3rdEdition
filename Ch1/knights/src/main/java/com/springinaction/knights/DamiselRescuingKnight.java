package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;
import com.springinaction.quests.RescueDamselQuest;


public class DamiselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamiselRescuingKnight() {
        this.quest = new RescueDamselQuest();

    }

    public void embarkOnQuest() throws QuestException {

        quest.embark();

    }
}
