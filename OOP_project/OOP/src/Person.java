public class Person {
    private String name;
    private int age;

    public void setAge(int age){
        if (age >= 0) {
            this.age = age;
        }else System.out.println("Enter correct age");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
