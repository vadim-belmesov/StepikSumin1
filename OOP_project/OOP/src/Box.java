public class Box {
    double length;
    double width;
    double height;


    //Конструктор класса
    //Теперь когда мы создаём экземпляр класса, мы обязательно должны
    //передать параметры
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(int size){
        this.length = size;
        this.width = size;
        this.height = size;
    }

    void setDimens(double length, double width, double height){
            this.length = length;
            this.width = width;
            this.height = height;
    } 

    double showVolume(){
        double volume = length * width * height;
        return volume;
    }
}
