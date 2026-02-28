package Recursion.BasicProblems;

public class BasicProblem3 {
    public void printNumbers (int n){
        if (n<1) return;
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main (String[] args){
        BasicProblem3 sol = new BasicProblem3();
        int n = 9;
        sol.printNumbers(n);
    }
}
