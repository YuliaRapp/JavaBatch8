package com.syntax.reviewclass6;

import com.syntax.class29.PrintInfo;

public class MethodsExample2 {

    public static void main(String[] args) {

       printNTime("Please Study ",10);
    }

    static void printNTime(String word, int nTimes) {
        for (int i = 0; i < nTimes ; i++) {
            System.out.println(word);
        }
    }

}
