package homework.interfaceHomework;

public class Programmer implements Driver, Worker{

  @Override
  public void drive() {
    System.out.println("Программист водит авто");
  }

  @Override
  public void work() {
    System.out.println("Программист работает");
  }
}
