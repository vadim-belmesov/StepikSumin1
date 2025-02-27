package test;

import Examples.Rectangle;
import box.Box;
import box.weightBox;
import shape.Shape;
import shape.rectangle;
import shape.triangle;

public class Main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(10,20);
        triangle triangle1 = new triangle(10,10,30);

        triangle1.showPerimeter();
        rectangle1.showPerimeter();

    }
}
