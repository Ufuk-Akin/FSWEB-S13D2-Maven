package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("--------------");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("--------------");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));



    }

    public static boolean isPalindrome (int number) {

        String stringNumber = Integer.toString(number).replaceAll("-","");
        String reversedNumber = "" ;

        for (int i = 0; i < stringNumber.length() ; i++) {
            reversedNumber = stringNumber.charAt(i) + reversedNumber ;
        }
        return stringNumber.equals(reversedNumber);
    }

    public static boolean isPerfectNumber (int number) {

        int sum = 0;

        if(number <= 1) {
            return false;
        }

        for (int i = 1; i <= number /2 ; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    public static String  numberToWords (int sayi) {

        if (sayi < 0) return "Invalid Value";

        char[] digits = String.valueOf(sayi).toCharArray();

        String sayiToText ="";

        for (char digit : digits) { //
            switch (digit) {
                case '0':
                    sayiToText += "Zero ";
                    break;
                case '1':
                    sayiToText += "One ";
                    break;
                case '2':
                    sayiToText += "Two ";
                    break;
                case '3':
                    sayiToText += "Three ";
                    break;
                case '4':
                    sayiToText += "Four ";
                    break;
                case '5':
                    sayiToText += "Five ";
                    break;
                case '6':
                    sayiToText += "Six ";
                    break;
                case '7':
                    sayiToText += "Seven ";
                    break;
                case '8':
                    sayiToText += "Eight ";
                    break;
                case '9':
                    sayiToText += "Nine ";
                    break;
            }


        }

        return sayiToText.trim();

    }

}



