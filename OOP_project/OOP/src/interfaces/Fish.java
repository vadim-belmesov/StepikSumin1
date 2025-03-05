package interfaces;

public class Fish extends Animal implements AbleToSwim {
  @Override
  public void eat() {
    System.out.println("Рыбий корм");
  }

  @Override
  public void swim() {
    System.out.println("Рыба плавает");
  }
}
