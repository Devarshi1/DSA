package Recursion.BasicProblems;

// Print a name 5 times using recursion
public class BasicProblem1 {

    public void printName (String name, int n, int count ) {
        if (count == n)
            return;
        System.out.println(name);
        printName(name, n, count+1);
    }

    public static void main (String[] args){
        BasicProblem1 sol = new BasicProblem1();
        int n = 5;
        String name = "Devarshi";

        sol.printName(name,n, 0 );

    }
}
