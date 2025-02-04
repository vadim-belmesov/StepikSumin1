package test;

import Examples.MyMath;
import Examples.Person;

public class Main {
    public static void main(String[] args){
        String text = "This is John. He is 27";


        Person man = new Person(text.substring(8,12), 0);
        //String age = text.substring(21,22);

        man.setAge(Integer.parseInt(text.substring(20,22)));
        System.out.println(man.getName() + " " + man.getAge());

    }
}
