package Lesson05Task01;

//1. Create ArrayList and print it.

import java.util.ArrayList;

public class Task01 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(3);

        for ( int i=0 ; i < a.size(); i++ ){
            System.out.println(a.get(i));
        }


    }

}
