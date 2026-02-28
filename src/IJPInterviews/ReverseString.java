package IJPInterviews;

public class ReverseString {
        public static void main (String[] args){
            String s = "points";
            String reversedS = "";
            for ( int i = s.length()-1; i>=0; i--){
                reversedS = reversedS +s.charAt(i);
            }
            System.out.println(reversedS);
        }
    }

