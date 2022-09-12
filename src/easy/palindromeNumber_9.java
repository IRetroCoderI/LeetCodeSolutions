package easy;

import java.util.Arrays;

public class palindromeNumber_9 {
    public static void main(String[] args) {
        int num = 123454321;
        System.out.println(isPalindrome(num));
    }
    static public boolean isPalindrome(int x){
        String y = String.valueOf(x);
        char[] reverse = new char[y.length()];
        for(int i = y.length()-1, j=0; i>=0; i--, j++){
            reverse[j] = y.charAt(i);    //i goes backwards and j goes forward
                                        //last value of test number becomes first in array, reversing the string
        }
        if(y.equals(String.valueOf(reverse))){ return true; } else { return false; }
    }
}
