package Lesson05Task05;

//5. Create ArrayList of Strings. Add 5 different Strings to it.
//    Using any cycle print all the values of the ArrayList to the console.
//1) Create ArrayList of String and initialize it.
//2) The size of the ArrayList should be printed to the console.
//3) All values should be printed to the console (each from a new line)

import java.util.ArrayList;

public class Task05 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        int size = 0;

        a.add("Strin01");
        a.add("Strin02");
        a.add("Strin03");
        a.add("Strin04");
        a.add("Strin05");
        size = a.size();

        System.out.println("Size: " + size);
        for (int i = 0; i < size; i++){
            System.out.println(a.get(i));
        }

    }

}
