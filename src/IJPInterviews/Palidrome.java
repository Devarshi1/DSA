package IJPInterviews;

public class Palidrome {

    public static boolean isPalindrome (String s){
        String rev = "";
        for (int i=s.length()-1; i>=0; i--){
            rev = rev +s.charAt(i);
        }
        if (rev.equals(s)){
            return true;
        }
            return false;
    }
    public static boolean isPalindromeOptimized (String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i) == s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
    public static void main (String [] args){
        String s = "level";
//        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeOptimized(s));
    }
}
