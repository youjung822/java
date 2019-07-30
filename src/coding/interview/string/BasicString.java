package coding.interview.string;
/*
* [Remember]
* 1) Special character display: \+special character
* */

public class BasicString {
    public static void main(String[] args){
        System.out.println("BasicString");
        System.out.println("In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.");
        System.out.println("The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.");

        char[] arrChar = {'j','a','v','a','s','c','r','i','p','t'};
        String str = new String(arrChar);
        String str2 = str;

        /* Basic function for String*/
        str.charAt(0);//Returns the value at the specified index.
        str.concat("Youjung is good at"); //Concatenates the specified string to the end of this string.

        /* str.compareTo(string abc);
         * The comparison is based on the Unicode value of each character in the strings.
         * (-) returns < 0 then the String calling the method is lexicographically first ex))"apple".compareTo ("banana")
         * (0) returns == 0 then the two strings are lexicographically equivalent
         * (+) returns > 0 then the parameter passed to the compareTo method is lexicographically first. ex)) "computer".compareTo ("comparison")
         */
        "apple".compareTo ("banana");
        str.compareToIgnoreCase("JAVASCRIPT");
        str.contains("ava"); //Case sensitive, Returns true if this string contains the specified sequence of char values.

        /* str.equals(str)
         * The function checks whether the references to the objects are equal (==)
         * as well as the actual contents of the string. (each contents)
         * ((Reference))The  == operator checks whether the references to the objects are equal.
         */
        str.equals(str);
        str.equalsIgnoreCase("JAVASCRIPT"); //This function uses String.regionalMatches().

        /* str3.regionMatches(ignoreCase: false, toffset: 3,other: "Minjung Kim",ooffset: 3,len: 8)
         * Tests if two string regions are equal.
         */
        String str3 = "Youjung Kim";
        System.out.println(str3.regionMatches(false,3,"Minjung Kim",3,8));
        System.out.println(regionMatchesYJ(str3, "Minjung",3,3,8));

        /*System.out.println("Output of str.charAt(0): "+str.charAt(0));
        System.out.println("Output of str.concat(\"Youjung\"): "+ str.concat("Youjung is good at"));
        System.out.println("Output of \"apple\".compareTo (\"banana\"): "+"apple".compareTo ("banana"));
        System.out.println("Output of \"cocoa\".compareTo (\"cocoa\"): "+"cocoa".compareTo ("cocoa"));
        System.out.println("Output of : \"computer\".compareTo (\"comparison\"): "+"computer".compareTo ("comparison"));
        System.out.println("Output of str.compareToIgnoreCase(\"JAVASCRIPT\"): "+str.compareToIgnoreCase("JAVASCRIPT"));
        System.out.println("Output of str.contains(\"AVA\"): "+ str.contains("AVA"));
        System.out.println("Output of str.equals(str2): "+str.equals(str2));
        System.out.println("Output of str.equals(\"javascript\"): "+str.equals("javascript"));
        System.out.println("Output of str.equals(str2): "+str.equals(str2));
        System.out.println("Output of str ==\"javascript\": "+ (str=="javascript"));
        */
        //
        /*
        str.getBytes();
        str.length();
        str.indexOf();
        str.lastIndexOf();
        str.replace();
        str.startsWith();
        str.substring();
        str.split();
        str.intern();
        str.trim();
        str.toLowerCase();
        str.toUpperCase();
        */

    }

    public static boolean regionMatchesYJ(String strOrig, String strCompare, int indexOrig, int indexCompare, int length){

        if(strOrig==strCompare){
            return true;
        }
        else{
            char[] arrOrig = strOrig.toCharArray();
            char[] arrCompare = strCompare.toCharArray();
            for(int i =0; i <strOrig.length(); i ++){
                System.out.println("index i: "+ i + " value: "+ arrOrig[i]);
            }

            System.out.println("Before while length: "+length + " indexO: "+ indexOrig +" indexC: "+indexCompare);
            while(length-- > 0){
                char ch1 = arrOrig[indexOrig++];
                //!!!! Question, I thought the ++ operation will be the first and the assign the value of array.
                //However, it seems like assign value with arrayOrig[3] then increase the indexOrig++.... why??
                //Answer: http://www.c4learn.com/java/java-increment-decrement-operator/

                char ch2 = arrCompare[indexCompare++];
                System.out.println("Length: "+length+" ch1: "+ch1 + " ch2: "+ ch2);

                if(ch1 == ch2){
                    continue;
                }
                return false;
            }

        }
        return true;

    }


}
