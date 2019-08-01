package coding.interview.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class BasicDeque {

    //Summary of method related to deque
    //https://www.geeksforgeeks.org/deque-interface-java-example/
    /*            Functions        Default Dir
    Insert    | Add, Offer     | From Tail
    Deletion  | Poll,Remove    | From Head
    Retrieval | Peak, Iterator | From Tail

    add(element): Adds an element to the tail.
    addFirst(element): Adds an element to the head.
    addLast(element): Adds an element to the tail.
    offer(element): Adds an element to the tail and returns a boolean to explain
                    if the insertion was successful.
    offerFirst(element): Adds an element to the head and returns a boolean to explain
                    if the insertion was successful.
    offerLast(element): Adds an element to the tail and returns a boolean to explain
                    if the insertion was successful.
    iterator(): Return an iterator for this deque.
    descendingIterator(): Returns an iterator that has the reverse order for this
                deque.
    push(element): Adds an element to the head.
    pop(element): Removes an element from the head and returns it.
    removeFirst(): Removes the element at the head.
    removeLast(): Removes the element at the tail.
    poll(): Retrieves and removes the head of the queue represented by this deque
            (in other words, the first element of this deque),
            or returns null if this deque is empty.
    pollFirst(): Retrieves and removes the first element of this deque, or
                returns null if this deque is empty.
    pollLast(): Retrieves and removes the last element of this deque, or
            returns null if this deque is empty.
    peek(): Retrieves, but does not remove, the head of the queue represented by this
            deque (in other words, the first element of this deque), or
            returns null if this deque is empty.
    peekFirst(): Retrieves, but does not remove, the first element of this deque, or
                returns null if this deque is empty.
    peekLast(): Retrieves, but does not remove, the last element of this deque, or
                returns null if this deque is empty.
     */
    public static void main(String[] args){
        Instant start = Instant.now();
        System.out.println(start.toString() + "Dequeue(Double edged Queue) basic");
        System.out.println("Features \n1.resizable array \n2.Null is prohibited. " +
                "\n3.Multiple thread is not supported.");
        //Add elements to the que in various ways
        Deque<String> deque = new LinkedList<String>();// new ArrayDeque<String>();
        deque.add("Element 1 (Tail)");
        deque.addFirst("Element2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)");
        deque.offer("Element 5(Tail)");
        deque.offerFirst("Element 6(Head)");
        deque.offerLast("Element 7(Tail)");
        System.out.println(deque + "\n");

        //Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while(iterator.hasNext()){
            System.out.print(" "+(String)iterator.next());
        }
        System.out.println("\nReverse Iterator");
        Iterator revIterator = deque.descendingIterator();
        while(revIterator.hasNext()){
            System.out.print(" "+revIterator.next());
        }
        System.out.println();
        //Peek returns the head without deleting it from the deque
        System.out.println("Peek: "+deque.peek());// E6
        System.out.println("After peek: "+ deque); //E6, E4,E2,...

        //Pop returns the head and removes it from the deque
        System.out.println("Pop: "+ deque.pop());//E6
        System.out.println("After pop: "+ deque); //E4,E2,...

        //Check if a specific element exists in the deque
        System.out.println("Contains element 3: "+deque.contains("Element 3 (Tail)"));

        //Remove the first and last elements
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing first and the last"+deque);
        Instant end = Instant.now();
        System.out.println("Duration: "+ Duration.between(start,end).toMillis());
    }
}
