package Examples;

public class MyMath {

  private static final double PI = 3.14;

  public static double length(double radius){
    return 2 * PI * radius;
  }

  public static double area(double radius){
    //pi = 10;
    return PI * radius * radius;
  }

  //Так как методы ниже не используют параметры объекта,
  //можно их сделать static и привязать к классу
  public static int multiple(int a, int b){
    return a * b;
  }

  public static double multiple(double a, double b){
    return a * b;
  }

  public static int multiple(int a){
    return a * a;
  }
}
