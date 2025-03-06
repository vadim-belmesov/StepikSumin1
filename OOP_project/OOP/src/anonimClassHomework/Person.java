package anonimClassHomework;

public class Person implements Officiant, Client{
  @Override
  public void placeOrder(Officiant officiant, String dish) {
    System.out.println("officiant" + dish);
  }

  @Override
  public void bringOrder(String dish) {
    System.out.println(dish);
  }
}
