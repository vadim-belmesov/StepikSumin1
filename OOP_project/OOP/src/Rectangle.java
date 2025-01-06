public class Rectangle {
    double length;
    double width;
    
    void setRecDimens(double length, double width){
        this.length = length;
        this.width = width;
    } 

    double rectangleSquare(){
        return this.width * this.length;
    }
}
