package multithreading;

public class Main {
  static boolean isFive = false;

  public static void main(String[] args) {
    //первый поток
    Thread thread = new Thread(new Runnable() {
      //воспользуемся анонимным классом
      @Override
      public void run() {
        for (int i = 0; i < 10_000_000;i++){
          if (i == 5){
            isFive = true;
          }
          System.out.println(i);
          try {
            Thread.sleep(1000); //усыпляем поток на время
          } catch (InterruptedException e) {
          }
        }
      }
    });
    thread.start(); //здесь будут выводиться 1


  //второй поток
    Thread thread2 = new Thread(new Runnable() {
      //воспользуемся анонимным классом
      @Override
      public void run() {
        for (int i = 0; i < 10_000_000;i++){
          if(isFive){
            break;
          }

          System.out.println(i);
          try {
            Thread.sleep(1000); //усыпляем поток на время
          } catch (InterruptedException e) {
          }
        }
      }
    });
      thread2.start(); //здесь будут выводиться 1
  }
}