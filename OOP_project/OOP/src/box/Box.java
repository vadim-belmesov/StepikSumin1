package box;

public class Box {
    private double length;
    private double width;
    private double height;



    Box increase(){
        return new Box(this.length * 2, this.width * 2,this.height * 2);
    }

    Box copy(Box first){
        return first;
    }

    Box copy2(){
        return new Box(this.length, this.width,this.height);
    }

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Конструктор в котором используется другой конструктор
    public Box(int size){
        this(size, size, size); //перегрузка конструктора
    }
    Box(Box another){
        this(another.length, another.width, another.height); //перегрузка конструктора
    }


    //Пустой конструктор где мы также вызываем контструктор для 1 элемента
    Box(){
        this(10);
    }

    //Метод сравнения объектов с выводом в консоль
    void comparePrint(Box another){
        double currentVolume  = getVolume();
        double anotherVolume = another.getVolume();

        if(currentVolume > anotherVolume){
            System.out.println("currentVolume > anotherVolume");
        } else if (currentVolume < anotherVolume) {
            System.out.println("currentVolume < anotherVolume");
        }else
            System.out.println("currentVolume == anotherVolume");
    }



    //Метод сравнения объектов без вывода в консоль
    int compareNotPrint(Box another){
        double currentVolume  = getVolume();
        double anotherVolume = another.getVolume();

        if(currentVolume > anotherVolume){
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        }else {
            return 0;
        }
    }

    private void setDimension(double length, double width, double height){
        this.length = length;
        this.width = length;
        this.height = length;
    }

    private double getVolume(){
       return length * width * height;
    }

    void showVolume(){
        System.out.println(length * width * height);
    }
}
