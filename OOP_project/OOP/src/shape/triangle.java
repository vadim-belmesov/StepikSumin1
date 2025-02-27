package shape;

public class triangle extends Shape{
  int c;

  public triangle(int a, int b, int c) {
    super(a, b);
    this.c = c;
  }

  @Override
  public int getPerimeter() {
    return getA() + getB() + c;
  }

  public void showPerimeter() {
    System.out.println("Perimeter = " + getPerimeter());
  }
}
