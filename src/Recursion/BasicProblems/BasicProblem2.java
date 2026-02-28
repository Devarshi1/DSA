package Recursion.BasicProblems;

public class BasicProblem2 {
    //  Print numbers from 1 to N
    public void printNumbers(int n, int count ){
        if (count > n)
            return;
        System.out.println(count);
        printNumbers(n, count+1);
    }
    public static void main (String[] args){
        BasicProblem2 sol = new BasicProblem2();
        int n = 23;
        sol.printNumbers(n,1);

    }
}
