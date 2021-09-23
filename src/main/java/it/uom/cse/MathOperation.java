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

    public static int sumOfPrimes(int n){
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int n){
        if(n == 1) return false;
        for (int i = 2; i*i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
