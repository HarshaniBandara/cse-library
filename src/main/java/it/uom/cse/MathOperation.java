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

}
