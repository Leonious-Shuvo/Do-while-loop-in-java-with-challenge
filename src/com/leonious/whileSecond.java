package com.leonious;

public class whileSecond {
    public static void main(String[] args) {
        int count = 0;
        while(count != 7) {
            System.out.println("Count Value is " + count);
            count++;
        }

        count =1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }
    }
}
