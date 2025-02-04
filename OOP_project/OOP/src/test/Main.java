package test;

import Examples.MyMath;

public class Main {
    public static void main(String[] args){
        String a = "1000";
        String b = "2000";

        System.out.println(a + b); //10002000

        //Используем метод для преобразования
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        System.out.println(a1 + b1); //3000

    }
}
