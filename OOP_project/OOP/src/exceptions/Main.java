package exceptions;

public class Main {
  public static void main(String[] args) {
    String[] names = new String[5];

    try {
      System.out.println(names[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Вы за пределами массива ");
    }
  }
}

