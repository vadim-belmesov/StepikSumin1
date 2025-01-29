public class Box {
    double length;
    double width;
    double height;


    //Конструктор класса
    //Теперь когда мы создаём экземпляр класса, мы обязательно должны
    //передать параметры
    Box(){
        this(10);
    }
    
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(int size){
        this(size, size, size); //перегрузка конструктора
    }

    double showVolume(){
        double volume = length * width * height;
        return volume;
    }
}
