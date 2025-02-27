package box;

public class weightBox extends Box{
  private double weigh;

  public weightBox(){
    this.weigh = 10;
  }

  public weightBox(Box another, double weigh) {
    super(another);
    this.weigh = weigh;
  }

  public weightBox(double length, double width, double height, double weigh) {
    super(length, width, height);
    this.weigh = weigh;
  }

  public weightBox(double size, double weigh) {
    super(size);
    this.weigh = weigh;
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println(weigh);
  }
}
