package Lesson05Task07;

//7. Create HashMap<String, String> and add 10 pairs:
//        watermelon, berry;
//        banana, fruit;
//        cherry, berry;
//        pineapple, fruit;
//        melon, vegetable;
//        cranberry, berry;
//        apple, fruit;
//        iris, flower;
//        potato, vegetable;
//        carrot, vegetable;
//
//        Print the content of the map, each pair from a new line.
//        Example:
//        watermelon - berry;
//        cherry - berry;
//        ...

import java.util.HashMap;
import java.util.Map;

public class Task07 {

    public static void main(String[] args) {

        Map < String, String > plants = new HashMap<>();

        plants.put("watermelon", "berry");
        plants.put("banana", "fruit");
        plants.put("cherry", "berry");
        plants.put("pineapple", "fruit");
        plants.put("melon", "vegetable");
        plants.put("cranberry", "berry");
        plants.put("apple", "fruit");
        plants.put("iris", "flower");
        plants.put("potato", "vegetable");
        plants.put("carrot", "vegetable");

        System.out.println( "watermelon" + " - " + plants.get("watermelon") );
        System.out.println( "banana" + " - " + plants.get("banana") );
        System.out.println( "cherry" + " - " + plants.get("cherry") );
        System.out.println( "pineapple" + " - " + plants.get("pineapple") );
        System.out.println( "melon" + " - " + plants.get("melon") );
        System.out.println( "cranberry" + " - " + plants.get("cranberry") );
        System.out.println( "apple" + " - " + plants.get("apple") );
        System.out.println( "iris" + " - " + plants.get("iris") );
        System.out.println( "potato" + " - " + plants.get("potato") );
        System.out.println( "carrot" + " - " + plants.get("carrot") );

    }
}
