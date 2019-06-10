package Lesson05Task03;

//3. Create Map vehicles : vehicles.put("BMW", 5);, print

import java.util.*;

public class Task03 {

    public static void main(String[] args) {

        String key = "BMW";
        Integer value = 5;
        Map < String, Integer > vehicles = new HashMap<>();

        vehicles.put(key, value);
        System.out.println( key + " - " + vehicles.get(key) );
    }

}
