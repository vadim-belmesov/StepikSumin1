package homework.interfaceHomework;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    Programmer programmer = new Programmer();

    director.force(new Worker() {
      @Override
      public void work() {
        System.out.println("Работаю");
      }
    });
  }
}
