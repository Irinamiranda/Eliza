package com.company;

import java.util.Random;

public class RandomAnswer {
    //create method for random greeting
    public static String randomAnswer() {
        String[] randAnswer = {
                "Please tell me more.",
                "Many of my patients tell me the same thing.",
                "It is getting late, maybe we had better quit."
        };

        int randomIndex = new Random().nextInt(randAnswer.length);

        return randAnswer[randomIndex];

    }
    //create method for random answer
    public static String elizaQuestion() {
        String[] randQuestion = {
                "Why do you say that",
                "You seem to think that",
                "So, you are concerned that"
        };
        int randIndex = new Random().nextInt(randQuestion.length);
        return randQuestion[randIndex];
    }
}
