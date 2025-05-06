package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println(isPalindrome(-1221));
        //System.out.println(isPerfectNumber(27));
        //System.out.println(numberToWords(-9234));
    }
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        if (number == 0) {
            return true;
        }
        String stringifiedNumber = String.valueOf(number);
        int startPointer = 0;
        int endPointer = stringifiedNumber.length() - 1;

        while (startPointer < endPointer) {
            if(stringifiedNumber.charAt(startPointer) != stringifiedNumber.charAt(endPointer)){
                return false;
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if(number <= 0){ //perfect number has to be a positive integer
            return false;
        }
        int sumOfDivisors = 0;

        for(int i = 1; i <= number/2; i++) { //Only divisor larger than half is number itself
            if(number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return (sumOfDivisors == number);
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String returnStr = "";
        String stringifiedNumber = String.valueOf(number);
        char[] cArr = stringifiedNumber.toCharArray();

        for(char c : cArr){
            switch (c) {
                case '0':
                    returnStr += "Zero ";
                    break;
                case '1':
                    returnStr += "One ";
                    break;
                case '2':
                    returnStr += "Two ";
                    break;
                case '3':
                    returnStr += "Three ";
                    break;
                case '4':
                    returnStr += "Four ";
                    break;
                case '5':
                    returnStr += "Five ";
                    break;
                case '6':
                    returnStr += "Six ";
                    break;
                case '7':
                    returnStr += "Seven ";
                    break;
                case '8':
                    returnStr += "Eight ";
                    break;
                case '9':
                    returnStr += "Nine ";
                    break;
            }
        }

        return returnStr.trim();
    }
}
