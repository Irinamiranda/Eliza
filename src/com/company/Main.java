package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! How can I help you? or enter Q to quit");
        Scanner s = new Scanner(System.in);
        String myAnswer = s.nextLine();


        while (!myAnswer.equalsIgnoreCase("Q"))

         {
             System.out.println(RandomAnswer.randomAnswer());
             System.out.println(RandomAnswer.elizaQuestion() + " " + Eliza.dialog());
             System.out.println("How can I help you? or enter Q to quit");// write your code here
             myAnswer = s.nextLine();

             }

             }
        }



