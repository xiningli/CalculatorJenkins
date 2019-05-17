package com.xiningli.practice.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String o = sc.next();
        char op = o.charAt(0);
        int j = sc.nextInt();
        int result;
        switch (op) {
            case '+':
                result = Calculator.add(i, j);
                break;
            case '-':
                result = Calculator.subtract(i, j);
                break;
            case '*':
                result = Calculator.multiply(i, j);
                break;
            case '/':
                result = Calculator.divide(i, j);
                break;
            default:
                result = Calculator.mod(i,j);
                break;
        }

        System.out.println(result);



    }
}
