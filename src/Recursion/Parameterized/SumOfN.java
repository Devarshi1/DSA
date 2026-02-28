package Recursion.Parameterized;

public class SumOfN {
    public void sumOfN(int i, int sum) {
        if (i<1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1,sum+i );
    }
    public static void main (String[] args){
        // We created an object named sol because - a static method cannot directly call a non-static method
        // Why can't we call non-static method from static method?
        // Answer:
        // Because static methods belong to the class, and non-static methods belong to objects. Without creating an object, the method doesn’t have memory allocated to operate on.
        SumOfN sol = new SumOfN();
        int n = 6;
        sol.sumOfN(n, 0);
    }
}
