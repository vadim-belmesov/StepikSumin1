package java_syntaxis_examples;

public class Foreach {
    public static void main(String[] args) {
        String[] studensNames = {
            "Vanya", 
            "Petya",
            "Nikolay",
            "Alexander"
        };

        //Вывод с помощью
        for(int i = 0; i < studensNames.length; i++){
            System.out.println(studensNames[i]);
        }
        
        //foreach
        for (String name : studensNames) {
            System.out.println(name);
        }
        //При выполнении цикла в переменную String name на время итерации
        //сохраняется элемент из массива, с которым мы работаем
        //после этого элемент удаляется чтобы записать следующее значение
    
        int count = 100;
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = count + i;
            System.out.println(array[i]);
        }
        
        for(int numbers : array){
            System.out.println(numbers);
        }
    }    
}