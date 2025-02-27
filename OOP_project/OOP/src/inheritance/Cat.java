package inheritance;

public class Cat extends CatFamily {
  public Cat(){
    super(4, 2, false);
  }

  @Override
  public void eat(){
    System.out.println("Ем сухой корм");
  }
}
