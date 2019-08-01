package coding.interview.collections;

import coding.interview.array.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class BasicVector {
    //Vector Basic: https://www.geeksforgeeks.org/java-util-vector-class-java/
    /*
    Vector implements a dynamic growable array of objects that means it can grow
    or shrink as required.
    It contains components that can be accessed using an integer index
    It extends AbstractList and implements List interfaces.

    Constructor:
    Vector(): Creates a default vector of initial capacity is 10.
    Vector(int size): Creates a vector whose initial capacity is specified by size.
    Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and increment is
    specified by incr. It specifies the number of elements to allocate each time that a vector is resized upward.
    Vector(Collection c): Creates a vector that contains the elements of collection c.

    Important points regarding Increment of vector capacity:
    If increment is specified, Vector will expand according to it in each allocation cycle
    but if increment is not specified then vector’s capacity get doubled in each allocation cycle.
    Vector defines three protected data member:
    int capacityIncreament: Contains the increment value.
    int elementCount: Number of elements currently in vector stored in it.
    Object elementData[]: Array that holds the vector is stored in it.

    */
    //Difference between ArrayList vs Vector : https://www.geeksforgeeks.org/vector-vs-arraylist-java/
    /*
    1)Synchronization
    Vector is synchronized meaning only one thread at a time can access the code,
    ArrayList is NOT synchronized, which means multiple threads can work on arrayList at the same time.
    2) Performance: ArrayList is faster
    3) Data Growth: ArrayList and Vector both grow and shrink dynamically.
     ArrayList increments 50% of the current array size if the number of elements exceeds its capacity
     , while vector increments 100% – essentially doubling the current array size. (Reason for Vector is more expensive)
    4) Traversal
    Vector uses Enumeration and Iterator
    ArrayList: Iterator only

    How to choose vector over arraylist?
    A1. Multithreading is concerned, vectors are often preferable.
    A2. If we don’t know how much data we are going to have, but know the rate at which it grows,
    Vector has an advantage, since we can set the increment value in vectors.
    A3. ArrayList is newer and faster. If we don’t have any explicit requirements for using either of them,
    we use ArrayList over vector.
    */

    public static void main(String[] args){
        diffVectorArrayList();

        //***Constructor***//
        Vector v = new Vector();// Creates a default vector of capacity 10
        Vector vec = new Vector(1);
        //specified by size and increment which is the number of elements to allocate each time that a vector is resized upward.
        Vector<Integer> vi = new Vector<Integer>(2,3);

        ArrayList<String> al = new ArrayList<String>();
        al.add("apple");
        al.add("banana");
        al.add("clementine");
        al.add("dorian");
        //Creates a vector that contains the elements of collection
        Vector<ArrayList<String>> vecCol = new Vector(al);

        //***add(), addAll() regardless of dataType!***//
        System.out.println();
        //Can Vector hold data regardless of data type? Yes. !!!!Remember!!
        v.add("String");
        v.add(12);
        v.add(new Person());
        System.out.println(v);

        //Can arraylist hold data regardless of data type?? Yes !!!!Remember!!
        ArrayList abc = new ArrayList();
        abc.add("String");
        abc.add(12);
        abc.add(new Person());
        System.out.println("arrayList abc: "+ abc);

        abc.add(1,10);
        v.add(1,30);
        System.out.println("Vector v: " + v);
        Vector addVec = new Vector();
        addVec.addAll(0,abc);
        System.out.println("addVec: "+ addVec);

        //***Clone, contain, clear***//
        ArrayList clonedArr = new ArrayList();
        clonedArr = (ArrayList) v.clone();
        vec = (Vector) v.clone(); // a clone of this ArrayList instance.
        v.clear();


    }
    private static void diffVectorArrayList(){
        //create an ArrayList
        ArrayList<String> al = new ArrayList<String>();
        al.add("apple");
        al.add("banana");
        al.add("clementine");
        al.add("dorian");

        //traverse elements using iterator
        System.out.println("ArrayList elements are: ");
        Iterator iterator = al.iterator(); //Remember!!!
        while(iterator.hasNext()){ //Remember!!!
            System.out.println(iterator.next());
        }

        //create a vector
        Vector<String> vector = new Vector<String>();
        vector.addElement("fruits");
        vector.addElement("grape");
        vector.addElement("hummus");

        //Traverse elements using Enumeration
        System.out.println("\nVector elements are: ");
        Enumeration<String> enums = vector.elements(); //Remember!!!
        while(enums.hasMoreElements()){//Remember!!!
            System.out.println(enums.nextElement());
        }
    }
}
