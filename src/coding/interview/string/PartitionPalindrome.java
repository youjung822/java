package coding.interview.string;

public class PartitionPalindrome {
    /* https://www.geeksforgeeks.org/palindrome-partitioning-dp-17/
    * Given a string, a partitioning of the string is a palindrome partitioning
    * if every substring of the partition is a palindrome. For example,
    * “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”.
    * Determine the fewest cuts needed for palindrome partitioning of a given string.
    * For example, minimum 3 cuts are needed for “ababbbabbababa”. The three cuts
    * are “a|babbbab|b|ababa”. If a string is palindrome, then minimum 0 cuts are
    * needed. If a string of length n containing all different characters, then minimum
    *  n-1 cuts are needed.
    * */

    public static void mian(String[] args){
        String input = "ini";

        //substring Whole -> few -> letter
        //Check if the input is Palindrome
    }

    private static boolean isPalindrome(String input){
        int start = 0;
        int end = input.length();

        while(start <end){
            if(input.charAt(start++)!=input.charAt(end--)) return false;
        }
        return true;
    }
}
