public class Main {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Ivan", 20);

        //Можно изменить возраст, так как public
        person1.setAge(-22);
        person1.setAge(22);

        System.out.println(person1.getName() + " age " + person1.getAge());
    }
}
