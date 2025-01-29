public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Конструктор в котором используется другой конструктор
    Box(int size){
        this(size, size, size); //перегрузка конструктора
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


    double getVolume(){
       return length * width * height;
    }
}
