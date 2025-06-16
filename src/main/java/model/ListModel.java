package model;

import java.util.ArrayList;

public class ListModel {
    public static void listOfNumbers(){
        // List = ArrayList - LinkedList - Stack - Vector

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(21);
        numbers.add(9);

        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        numbers.remove(1);
    }
}
