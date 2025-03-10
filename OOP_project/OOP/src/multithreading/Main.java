package multithreading;

public class Main {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      //воспользуемся анонимным классом
      @Override
      public void run() {
        for (int i = 0; i < 10_000_000;i++){
          System.out.println(i);
          try {
            Thread.sleep(1000); //усыпляем поток на время
          } catch (InterruptedException e) {
          }
        }
      }
    });
    thread.start(); //здесь будут выводиться 1
  }
}
