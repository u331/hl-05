package Lesson05Task09;

//9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
//        Create HashSet<Integer> and add all unique numbers from the ArrayList.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// There is the long code version
// Another one is in Task09a class

public class Task09b {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 100; i++){
            int val = (int)(Math.random()*10);
            arr.add(val);
            hs.add(val);
        }

        //no print required by conditions
//        Iterator<Integer> itr = hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

    }

}
