package interfaceHomework;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    Programmer programmer = new Programmer();
    Cook cook = new Cook();

    ArrayList<Worker> workers = new ArrayList<>();
      workers.add(cook);
      workers.add(programmer);
      workers.add(director);

    for(Worker worker:workers){
      worker.work();
    }

    ArrayList<Driver> drivers = new ArrayList<>();
      drivers.add(cook);
      drivers.add(programmer);

      for (Driver driver:drivers){
        driver.drive();
      }
  }
}
