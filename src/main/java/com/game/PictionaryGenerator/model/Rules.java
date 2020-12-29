package com.game.PictionaryGenerator.model;

public enum Rules {
    Rule_1_Draw_60("60 seconds to draw"),
    Rule_2_Guess_60("60 seconds to guess"),
    Rule_3_Participant_Raise_Hand("Raise hand to participate"),
    Rule_4_Participant_Mute("Participant drawing has to be on mute"),
    Rule_5_Draw_rule_1("Draw anything on the whiteboard"),
    Rule_6_Draw_rule_2("Draw anything on a white paper"),
    Rule_7_Hint("After 30 seconds of guessing, hint will be provided"),
    Rule_8_Participant_Exception_1("Can't use text from Clue or Topic"),
    Rule_9_Topic("Participant can pick own topic and hint");


    public final String rule;

    private Rules(String rule) {
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }
}
