package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int sumOfIntegers(int n){
        int total=0;
        for(int k=0;k<=n;k++) total += k;
        return total;
    }

    public static int fib(int n){

        if(n<0){
            throw new IllegalArgumentException("n cannot be lesser than 0");
        }

        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

}
