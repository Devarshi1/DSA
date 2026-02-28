package Recursion.BasicProblems;

public class BasicProblem5 {
    // Print numbers from N to 1 using backtracking
    public void backTracking2(int i, int n){
        if (i>n) return;
        backTracking2(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        BasicProblem5 sol = new BasicProblem5();
        int n = 9;
        sol.backTracking2(1,n);
    }
}
