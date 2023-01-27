package com.Rusl2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class zadachi2 {
    public static void main(String[] args) throws IOException {
        String a, b, c;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = buff.readLine().split(" ");
        a = str[0];
        b = str[1];
        c = str[2];
       calc(a, b, c);
  //      roman(a, b, c);
        System.out.println(calc(a, b, c));
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(c);
        if (y > 10 || x > 10) {
            throw new IOException();
        }
    }

        private static String roman(String a, String b, String c) throws IOException {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String letters[] = {"I", "II", "III", "IV", "V", "VI","VII","VIII","IX", "X"};
            boolean flag = false;
            for (int i = 0; i < letters.length; i ++) {
                if (letters[i].equals(a)) {
                    flag = true;
                }
                if (letters[i].equals(c)) {
                    flag = true;
                }
            }

     return roman(a, b, c);

    }
    private static String calcRoman(String a, String b, String c) {
        int sum2 = 0;
        switch (b) {
             case "+":
                sum2 = letterToNumber(a) + letterToNumber(b);
                break;
            case "-":
                sum2 = letterToNumber(a) - letterToNumber(b);;
                break;
            case "*":
                sum2 = letterToNumber(a) * letterToNumber(b);
                break;
            case "/":
                sum2 = letterToNumber(a) / letterToNumber(b);
                break;
        }
        String sum3 = Integer.toString(sum2);
        return sum3;
    }
    private static String calc(String a, String b, String c) {
        int f = Integer.parseInt(a);
        int d = Integer.parseInt(c);
        int sum = 0;
        switch (b) {
            case "+":
                sum = f + d;
                break;
            case "-":
                sum = f - d;
                break;
            case "*":
                sum = f * d;
                break;
            case "/":
                sum = f / d;
                break;

        }


        String sum2 = Integer.toString(sum);
        return sum2;
    }

        private static int letterToNumber(String letter) {
            if (letter.equals("I") ) {
                return 1;
            } else if (letter.equals("II")) {
                return 2;
            } else if(letter.equals("III")) {
                return 3;
            } else if(letter.equals("IV")) {
                return 4;
            } else if(letter.equals("V")) {
                return 5;
            } else if(letter.equals("VI")) {
                return 6;
            } else if(letter.equals("VII")) {
                return 7;
            } else if(letter.equals("VIII")) {
                return 8;
            } else if(letter.equals("IX")) {
                return 9;
            }  else if(letter.equals("X")) {
                return 10;
            } else return -1;
        }





    }








