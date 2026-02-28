package Recursion.Funtional;

public class FactorialOfN {
    public static int factorialOfN (int n ){
        if(n==1) return 1;
        return n * factorialOfN(n-1);
    }
    public static void main (String [] args ){
        int n = 1;
        int answer = factorialOfN(n);
        System.out.println(answer);
    }
}
