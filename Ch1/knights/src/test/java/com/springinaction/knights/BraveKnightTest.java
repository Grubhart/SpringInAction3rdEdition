package com.springinaction.knights;

import com.springinaction.exceptions.QuestException;
import com.springinaction.quests.Quest;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {

        Quest mockQuest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(mockQuest,new Minstrel() );
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
