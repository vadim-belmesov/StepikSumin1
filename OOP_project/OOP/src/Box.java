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


    void setDimens(double length, double width, double height){
            this.length = length;
            this.width = width;
            this.height = height;
    } 

    double getVolume(){
        double volume = length * width * height;
        return volume;
    }
}
