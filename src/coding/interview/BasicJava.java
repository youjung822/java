package coding.interview;

public class BasicJava {
    public static void main(String[] args){
        int a =5, b=7;
        //Comment Test
        //The ? : operator(Ternary) in Java
        System.out.println((a > b) ? "Result is \"True\"" :"Result is \"False\"");

        //While (true) then go into the statement, otherwise done looping
        while(a<b){
            System.out.println("a="+ a + " b= "+ b);
            a++;
        }
        int length = 3;

        //!!!! Question, I thought the ++/-- operation will be the first and the assign the value of array.
        //However, it seems like assign value with arrayOrig[3] then increase the indexOrig++.... why??
        //That's wrong. It depends on where the operators are located.
        //If it is before the variable(ex, --length), operator(--) first and then while loop.
        //If it is after the variable(ex, length-- ), while loop first and then operator(--).
        //Answer: http://www.c4learn.com/java/java-increment-decrement-operator/
        while(length-- > 0){
            System.out.println("Lengh: " + length);
        }

    }
}
