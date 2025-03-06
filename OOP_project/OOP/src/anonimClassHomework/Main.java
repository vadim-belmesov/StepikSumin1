package anonimClassHomework;

public class Main {
  public static void main(String[] args) {

    Person client = new Person();
    Person officiant = new Person();

    client.bringOrder("Суп");
    officiant.placeOrder(officiant, " Суп");

  }
}
