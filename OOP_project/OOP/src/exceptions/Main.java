package exceptions;

public class Main {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;
    try {
      int c1 = a/b;
      int c = Integer.parseInt("dfadasdas");
    }
    catch (Exception e) {
      System.out.println("Возникло исключение:\n"
              + "*** " + e.getClass() + "\n"
              + "*** " + e.getMessage() );
    }
    System.out.println("Hello");
  }
}

