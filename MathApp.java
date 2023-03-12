package com.mathoperations;


// functional interface
@FunctionalInterface
interface MathOperation{
    int calculation(int a, int b);
    static void printResult(int a, int b, String function, MathOperation obj){
        System.out.println(function+" is "+obj.calculation(a,b));
    }
}
public class MathApp {
    public static void main(String[] args) {

        //Lambda expression
        MathOperation multiplication = (a,b) -> a*b;
        MathOperation divide = (a,b) -> a/b;
        MathOperation adding = (a,b) -> a+b;
        MathOperation subtraction = (a,b) -> a-b;


        System.out.println("Adding numbers : "+ adding.calculation(4,6));
        System.out.println("Subtracting numbers : "+ subtraction.calculation(9,5));
        System.out.println("Multiply numbers :"+ multiplication.calculation(25,5));
        System.out.println("Divide numbers :"+ divide.calculation(99,9));

        MathOperation.printResult(5,4,"addition ",adding);
        MathOperation.printResult(5,4,"subtraction ",subtraction);
        MathOperation.printResult(25,5,"dividing ",divide);
        MathOperation.printResult(5,6,"Multiplication ",multiplication);

    }
}