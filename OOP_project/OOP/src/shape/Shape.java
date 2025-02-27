package shape;
public class Shape {
  int a;
  int b;

  Shape(int a, int b){
    this.a = 10;
    this.b = 5;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getPerimeter(){
    return 0;
  }

  void showPerimeter(){
    System.out.println(getPerimeter());
  }
}
