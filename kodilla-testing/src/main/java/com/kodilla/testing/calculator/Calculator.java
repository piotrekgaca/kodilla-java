package com.kodilla.testing.calculator;

public class Calculator {
    {
        public int addAB(int a, int b) {
        return a + b;
    }

    public int substractAB(int a, int b) {
        return a - b;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Calculator calculator = new Calculator();
        int result = calculator.addAB(7, 3);
        int result = calculator.substractAB(7, 3);
        System.out.println(result);
        System.out.println("It works!");
    }
}
