public class Main {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Ivan", 20);

        //Можно изменить возраст, так как public
        person1.age = -22;

        System.out.println(person1.name + " age " + person1.age);
    }
}
