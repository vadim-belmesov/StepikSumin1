package Examples;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//Геттеры для имени и возраста
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

//Сеттер для возраста
    public void setAge(int age){
        if (age >= 0) {
            this.age = age;
        }else System.out.println("Enter correct age");
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + " Возраст: " + this.age;
    }
}
