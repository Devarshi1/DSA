package Recursion.BasicProblems;

public class BasicProblem4 {
    // Print 1 to N using backtracking (Do not use i+1)
    public void backTracking1(int n){
        if (n<1) return;
        backTracking1(n-1);
        System.out.println(n);
    }
    public static void main (String[] args){
        BasicProblem4 sol = new BasicProblem4();
        int n = 5;
        sol.backTracking1(n);
    }
}
