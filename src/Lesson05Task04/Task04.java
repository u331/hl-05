package Lesson05Task04;

//Create an array of 15 random integers from the segment [0;   9].
// Display the array on the screen. Count how many in the array of
// even elements and display this number on the screen on a separate line.

public class Task04 {

    public static void main(String[] args) {

        int[] arr = new int[15];
        int even = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0) even++;
            System.out.println(arr[i]);
        }
        System.out.println("even: " + even);

    }



}
