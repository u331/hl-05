package Lesson05Task06;

//6. Create ArrayList of Strings. Add 10 different Strings to it.
//    Using any cycle find the longest String in the list and print it out.
//    If there are several String with the same legth - print each from a new line.
//1) Create ArrayList of String and initialize it.
//2) All values with the highest length should be printed out.

import java.util.ArrayList;

public class Task06 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        int longest = 0;

        arr.add("Strin01");
        arr.add("Strin023");
        arr.add("Strin01234");
        arr.add("Strin012345");
        arr.add("Strin0123456");
        arr.add("Strin01");
        arr.add("Strin023");
        arr.add("Strin01234");
        arr.add("Strin012345");
        arr.add("Strin0123456");

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() > longest){
                longest = arr.get(i).length();
            }
        }

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() == longest){
                System.out.println(arr.get(i));
            }
        }

    }

}
