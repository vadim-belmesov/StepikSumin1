public class Main {
    public static void main(String[] args) throws Exception {
        //Экземпляр класса Test
        Test test = new Test();
        //используем параметризованный метод square
        //System.out.println(test.square(10));


        //Экз класса Box
        Box box1 = new Box();
        //Установка занчений с помощью спец метода
        box1.setDimens(10, 10, 10);
        System.out.println(box1.getVolume());

        
        //Экз класса прямоугольник
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setRecDimens(10, 20);
        System.out.println(rectangle1.rectangleSquare());
    }
}
