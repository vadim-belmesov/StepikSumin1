package homework.interfaceHomework;

public class Cook implements Driver, Worker{

  @Override
  public void drive() {
    System.out.println("Повар водит авто");
  }

  @Override
  public void work() {
    System.out.println("Повар работает");
  }
}
