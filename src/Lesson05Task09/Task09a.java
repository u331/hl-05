package Lesson05Task09;

//9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
//        Create HashSet<Integer> and add all unique numbers from the ArrayList.

import java.util.ArrayList;
import java.util.HashSet;

// There is the short code version
// Another one is in Task09b class

public class Task09a {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            arr.add( (int)(Math.random()*10) );
        }

        HashSet<Integer> hs = new HashSet<>(arr);
        //no print required by conditions
        //System.out.println(hs);

    }

}
