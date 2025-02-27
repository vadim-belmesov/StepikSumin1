package shape;

public class rectangle extends Shape{

  public rectangle(int a, int b) {
    super(a, b);
  }

  @Override
  public int getPerimeter() {
    return (getA() + getB()) * 2;
  }

  @Override
  public void showPerimeter() {
    System.out.println(getPerimeter());
  }
}
