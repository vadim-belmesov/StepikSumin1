package test;

import Examples.MyMath;
import Examples.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        ArrayList<String> List = new ArrayList<>();
        for (String name: names){
            for (int num:numbers){
                List.add(name + " - " + num);
            }
        }

        for (String item: List){
            System.out.println(item);
        }

    }

}
