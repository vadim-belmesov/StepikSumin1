package Main;
public class Variable {
  public static void main(String[] args) {
    int days = 366;
    int years = 0;
    int month = 0;
/*
* Выводить интерпретацию значения для date сокращая до минимального, то есть, если мы
* укажем, что days = 365 , то нужно вывести 1 year, 0 month
*
* */
    System.out.println("Year = " + days % 365);
  }
}
