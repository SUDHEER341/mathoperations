package com.mathoperations;
interface MathOperation {
    int calculate(int x, int y);
    public class MathOperations {

        public static void main(String[] args) {

            MathOperation adding = (a, b) -> a + b;
            MathOperation subtraction = (a, b) -> a - b;
            MathOperation multiplication = (a, b) -> a * b;
            MathOperation divide = (a, b) -> a / b;

            System.out.println("Perform addition : " + adding.calculate(56, 12));
        }
    }
}
