package com.leonious;

public class totalEvenNumberChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finisNumber = 20;
        // modification of code//
        int evenNumberFound = 0;
        //**********************//

        while( number <= finisNumber) {
            number++;
            if( !isEvenNumber(number)) {
                continue;
            }
            //modification of code//
            System.out.println(" Even number " + number);
            evenNumberFound++;
            if(evenNumberFound >= 5) {
                break;
                // *********//
            }

        }
        System.out.println("Total even number found = " + evenNumberFound);
    }
    public static boolean isEvenNumber (int evenChecker) {
        while (evenChecker % 2 == 0) {
            return true;
        }
        return false;
    }
}
