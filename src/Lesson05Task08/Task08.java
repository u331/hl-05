package Lesson05Task08;

//8. Create HashMap<String, String> and add 10 pairs:
//    watermelon, berry;
//    banana, fruit;
//    cherry, berry;
//    pineapple, fruit;
//    melon, vegetable;
//    cranberry, berry;
//    apple, fruit;
//    iris, flower;
//    potato, vegetable;
//    carrot, vegetable;
//    Print only vegetables to the console.
//1) Do not use predefined keys to get vegetables. You should use conditions to find vegetables.
//1) Map iterator;
//2) Map.Entry
//3) Foreach

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Task08 {

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

        //the way to print with itterator
        Iterator < Map.Entry <String, String >> entries = plants.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            if(value == "vegetable"){
                System.out.println(key + " - " + value);
            }
        }

        System.out.println("~~~");

        //the way to print with foreach
        for (Map.Entry <String, String>  entry: plants.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(value == "vegetable"){
                System.out.println(key + " - " + value);
            }
        }





    }
}
