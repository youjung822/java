package coding.interview.collections;


//https://www.baeldung.com/java-tutorial
//https://www.baeldung.com/java-collections-complexity
//https://www.baeldung.com/java-arraylist
//https://adrianmejia.com/most-popular-algorithms-time-complexity-every-programmer-should-know-free-online-tutorial-course/#O-1-Constant-time


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayList {

    public static void main(String[] args){
        List lst = new ArrayList();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);

        Iterator iter = lst.iterator();
        while(iter.hasNext()){
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
}
