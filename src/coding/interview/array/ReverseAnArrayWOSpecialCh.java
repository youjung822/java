package coding.interview.array;

/*
https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/

Reverse an array without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Examples:

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

*/

public class ReverseAnArrayWOSpecialCh {
    public static void main(String[] args){
        String strOrig = "a,b$c";
        //Spilt the string into array
        char[] arrOrig = strOrig.toCharArray();

        String strRevrsed = "";
        //char[] arrReversed[arrOrig.length];
        //For loop to append the character in the other order
        for(int i =0; i < arrOrig.length; i++){
            char c = arrOrig[i];
            //Check if the character is special
            // true -> locate it its own
            // false -> locate it reversal side
            /*if(c.matches("^[a-zA-Z]*$")){
                arrReversed[i] = c;
            } else {
                arrReversed[arrOrig.length-i-1] = c;
            }
            System.out.println( arrReversed.toString());
            */
        }

    }
}
