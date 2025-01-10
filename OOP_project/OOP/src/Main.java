public class Main {
    public static void main(String[] args) throws Exception {


        //Экз класса Box
        Box box1 = new Box(10, 10, 10);
        System.out.println(box1.getVolume());

        
        //Экз класса прямоугольник
        Rectangle rectangle1 = new Rectangle(10, 20);
        System.out.println(rectangle1.rectangleSquare());

        //Экз класса Работник
        Worker worker1 = new Worker("Ivan", "engineer", 100.0);
        worker1.showInfo();
    }
}
