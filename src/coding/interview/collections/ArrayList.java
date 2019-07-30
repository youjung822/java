package coding.interview.collections;


//https://www.baeldung.com/java-tutorial
//https://www.baeldung.com/java-collections-complexity
//https://www.baeldung.com/java-arraylist
//https://adrianmejia.com/most-popular-algorithms-time-complexity-every-programmer-should-know-free-online-tutorial-course/#O-1-Constant-time


import java.util.stream.Stream;

public class ArrayList {

    public static void main(String[] args){
       /*
        * REF site))https://books.google.co.jp/books?id=O6fJBAAAQBAJ&pg=PA29&lpg=PA29&dq=compareToIgnoreCase()+time+complexity&source=bl&ots=YimDgYNHfJ&sig=ACfU3U2iYmryt90-p6mxYwwhdR6Cu5uBFg&hl=en&sa=X&ved=2ahUKEwiwoqT0xc_jAhUhxYsBHXPXBXAQ6AEwEXoECAgQAQ#v=onepage&q=compareToIgnoreCase()%20time%20complexity&f=false
        * Q1.Do you know what Sorting algorithm JDK uses for Java's Collections.sort(List<E>) method?
        * A. Java 8's Collections.sort(List<E>) uses Iterative merge sort algorithm, it requires fewer
        * than nlong(n) comparisons when the input array is partially sorted(adaptive) and this algorithm
        * guaranteed to be stable in nature.
        * */

        //Sorting Examples in Java 8
        //EX1. Sort Array of Strings ignoring the case and print them to System out
        String[] names = {"One","Two","Three","Four","Five","Six","Seven"};
        Stream.of(names).sorted(String::compareToIgnoreCase).forEach(System.out::println);

        //EX2. Sort String based on their length
        Stream.of(names)
                .sorted((o1,o2)->Integer.compare(o1.length(),o2.length()))
                .forEach(System.out::println);

    }
}
