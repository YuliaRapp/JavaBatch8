package com.syntax.class18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);*/


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.contains("aeiou")) {
                System.out.println(word);
            }


        }
    }
}
