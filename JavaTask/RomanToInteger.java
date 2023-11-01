package JavaTask;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println( " Enter Roman Number: " );
        String romanNumeral=sc.nextLine();
        int integer = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " in integer: " + integer);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanCharToInt(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }
}
