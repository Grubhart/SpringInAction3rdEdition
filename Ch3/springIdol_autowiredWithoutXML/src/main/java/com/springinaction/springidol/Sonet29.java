package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component
public class Sonet29 implements Poem {

    private static String[] LINES={
            "When,in disgrace with fortune and men's eyes,",
            "I all alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries",
            "And lookup on myself and curse my fate,",
            "Wishing me like to one more rich in hope,",
            "Featured like him,like him with friends possess'd,",
            "Desiring this man's art and that man's scope,",
            "With what I most enjoy contented least;",
            "Yet in these thoughts myself almost despising,",
            "Haply I think on thee,and then my state,",
            "Like to the lark at break of day arising",
            "From sullen earth,sings hymns at heaven's gate;",
            "Forthy sweet love remember'd such wealth brings",
            "That then Is corn to change my state with kings."};


    public Sonet29() {
    }

    public void recite() {
        for (int i = 0; i < LINES.length ; i++) {

            System.out.println(LINES[i]);
            
        }
    }
}
