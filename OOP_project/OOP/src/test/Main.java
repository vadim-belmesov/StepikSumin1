package test;

import box.Box;
import box.weightBox;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        weightBox box2 = new weightBox(10,20,30,58);

        box1.showInfo();
        box2.showInfo();

    }
}
