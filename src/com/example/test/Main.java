package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("sub= "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("div= " + calculator.getDivisionResult());
    }
}
