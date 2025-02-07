package test;

import Examples.MyMath;
import Examples.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<String> elements = getElements();
        for (String element: elements){
            System.out.println(element);
        }

        ArrayList<String> ArrElements = getArrayElements();
        System.out.println(ArrElements.get(1));

    }

    private static HashSet<String> getElements(){
        HashSet<String> elements = new HashSet<>();
        elements.add("One");
        elements.add("Two");
        elements.add("Three");
        elements.add("Four");

        return elements;
    }

    private static ArrayList<String> getArrayElements() {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("OneArr");
        elements.add("TwoArr");
        return elements;
    }
}
