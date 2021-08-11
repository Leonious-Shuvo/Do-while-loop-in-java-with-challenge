package com.leonious;

public class evenNumberOrNot {
    public static void main(String[] args) {

        int number = 0;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if( !isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
        }
//        System.out.println("It is " + isEvenNumber(23));
    }
    public static boolean isEvenNumber ( int evenChecker) {
        while ( evenChecker % 2 == 0) {
            return true;
        }
        return false;
    }

}
