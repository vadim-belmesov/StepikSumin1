public class Rectangle {
    double length;
    double width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    void setRecDimens(double length, double width){
        this.length = length;
        this.width = width;
    } 

    double rectangleSquare(){
        return this.width * this.length;
    }
}
