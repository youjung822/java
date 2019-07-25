package coding.interview.array;

/*
In Java all arrays are dynamically allocated.(discussed below)
Arrays are objects in Java.
Every array type implements the interfaces Cloneable and java.io.Serializable.

Array can contains primitives data types as well as objects of a class depending on the Definition of array.
In case of primitives data types, the actual values are stored in ==>> contiguous memory locations.
In case of objects of a class, the actual objects are stored in ==> heap segment.

[References]
https://www.javatpoint.com/array-in-java

* */

import java.io.Serializable;
import java.util.HashMap;

public class Basic {
    public Basic(){

    }

    public static void main(String[] args){
        System.out.println("Title: Java Array Practice");

        //** Declaration, instantiation, initialization
        int a[];//declaration
        a = new int[5];//instantiation
        a[0]=10;//initialization
        for(int j=1;j<a.length;j++){
            a[j] = a[j-1]+10;
        }

        int b[]={33,3,4,5};//declaration, instantiation and initialization
        int c[] = new int[3];//declaration, instantiation
        c=a;

        //** For loop and Foreach loop
        System.out.println("\n* For with i=0.");
        for(int i=0;i<c.length;i++){//length is the property of array
            System.out.println(c[i]);
        }

        System.out.println("\n* Foreach with k:b.");
        for(int k :b){ //!!!Remember!!!!
            System.out.println(k);
        }

        //** Passing Array to a Method in Java
        printArray(b);

        //** Returning string Array from the Method
        System.out.println("\n* Return StringArray");
        String[] m = getStringArray();
        for(String s: m){
            System.out.println(s);
        }
        System.out.println("\n* Return ObjectArray");
        Object[] n = getObjectArray();
        for(Object s: n){
            Person p = (Person) s;
            System.out.println(p.getFullName());
        }

        //** What is the class name of Java array?
        //printClassNameType();

        //** Copying a Java Array
        System.out.println("\nCopy a portion of a string");
        System.out.println(copyPartialString("abEliotdefg"));

        //** Cloning an Array in Java
        System.out.println("\nClone whole string");
        System.out.println(cloneArray("Youjung Kim"));
    }

    public static void printArray(int[] abc){
        System.out.println("\nprintArray(): abc");
        for(int k:abc){
            System.out.println(k);
        }
    }

    //declaration, instantiation and initialization of string Arry
    private static String[] getStringArray(){
        //declaration, instantiation and initialization
        //1) Declaring a Java string array with an initial size
        String[] toppings1 = new String[3];

        //2) Declare a Java string array with no initial size
        String[] toppings2;
        toppings2 = new String[3];
        toppings2[0] = "Cheese";
        toppings2[1] = "Pepperoni";
        toppings2[2] = "Black Olives";

        //3) Declaring and populating a Java string array
        String[] a ={"abc","def","ghi","jkl"};
        String[] toppings3 = {"Cheese", "Pepperoni", "Black Olives"};

        return toppings3;
    }

    //declaration, instantiation and initialization of Object Array = string Array
    private static Person[] getObjectArray(){

        Person[] ppl = new Person[3];
        ppl[0] = new Person();
        ppl[1] = new Person("Eliot","Bignell",30,'M');
        ppl[2] = new Person("Minjung","Kim",31,'F');

        Person[] ppl2 = ppl;
        return ppl2;
    }

    private static void printClassNameType(){

        //primitive
        System.out.println("\nPrimitive class name and type.");
        System.out.println(int.class.getName());// output: int
        System.out.println(int.class.getCanonicalName());// output: int
        System.out.println(int.class.getSimpleName());// output: int
        System.out.println(int.class.getTypeName());// Added in Java 8 // output: int

        System.out.println("\nObject class name and type.");
        System.out.println(String.class.getName()); //output: java.lang.string
        System.out.println(String.class.getCanonicalName());//output: java.lang.string
        System.out.println(String.class.getSimpleName());//output: string
        System.out.println(String.class.getTypeName());//output: java.lang.string

        //inner class
        System.out.println("\nInner class name and type");
        System.out.println(HashMap.SimpleEntry.class.getName()); //output: java.util.AbstractMap$SimpleEntry
        System.out.println(HashMap.SimpleEntry.class.getCanonicalName());//output: java.util.AbstractMap.SimpleEntry
        System.out.println(HashMap.SimpleEntry.class.getSimpleName());//output: SimpleEntry
        System.out.println(HashMap.SimpleEntry.class.getTypeName());//output: java.util.AbstractMap$SimpleEntry

        //anonymous inner class
        System.out.println("\nAnonymous inner class name and type");
        System.out.println(new Serializable(){}.getClass().getName());//output: coding.interview.array.Basic$1
        System.out.println(new Serializable(){}.getClass().getCanonicalName()); //output: null
        System.out.println(new Serializable(){}.getClass().getSimpleName()); // output: (none)
        System.out.println(new Serializable(){}.getClass().getTypeName());// output:coding.interview.array.Basic$4
    }

    private static String copyPartialArray(){
        char[] orig = {'a','b','e','l','i','o','t','c','d','e'};
        char[] copyTo = new char[5];

        System.arraycopy(orig,2,copyTo,0,5);//**Remember
        return String.valueOf(copyTo);//**Remember!!!
    }

    private static String copyPartialString(String strOrig){

        char[] orig = strOrig.toCharArray();//**Remember!!!!
        char[] copyTo = new char[5];

        System.arraycopy(orig,2,copyTo,0,5);//**Remember
        return String.valueOf(copyTo);//**Remember!!!
        //arr.toString() will return address of the array
    }

    private static String cloneArray(String strOrig){
        char[] arrOrig = strOrig.toCharArray();
        char[] arrCloned = arrOrig.clone();//** Remember

        return String.valueOf(arrCloned); //** Remember
    }
}



