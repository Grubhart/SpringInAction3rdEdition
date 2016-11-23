package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;

public interface Knight {
    void embarkOnQuest() throws QuestException;
}
