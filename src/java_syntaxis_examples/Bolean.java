package java_syntaxis_examples;

public class Bolean {
    public static void main(String[] args) {
      int temp = 24;
      boolean hot = temp >= 25;
      boolean cold = temp <= 22;
      int time = 23;
      boolean isNight = time > 22 || time < 6; //ночь, если время больше 22 или меньше 6 часов
  
      if (hot && !isNight) { //если жарко и не ночь
        System.out.println("Кондиционер включён!");
      }else if (cold) {
        System.out.println("Кондиционер выключен!");
      }else {
        System.out.println("Кондиционер ничего не делает!");
      }
    }
  }

  