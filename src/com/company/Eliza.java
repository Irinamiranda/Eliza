package com.company;

import java.util.Scanner;

public class Eliza {
    //create method to replace pronouns for future usage as a question
    public static String dialog() {

        Scanner s = new Scanner(System.in);
        String myAnswer = s.nextLine();


            String[] eliza = myAnswer.split(" ");
            for (int i = 0; i < eliza.length; i++) {
                if ((eliza[i].equalsIgnoreCase("I")) || (eliza[i].equalsIgnoreCase("me"))) {
                    eliza[i] = "you";
                } else if (eliza[i].equalsIgnoreCase("my")) {
                    eliza[i] = "your";
                } else if (eliza[i].equalsIgnoreCase("am")) {
                    eliza[i] = "are";
                }

            }
            return String.join(" ", eliza);

        }

    }







