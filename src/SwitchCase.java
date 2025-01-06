public class SwitchCase {
    public static void main(String[] args) {
      
        int number_month = 3;
        if (number_month == 3) {
            System.out.println("March");
        } else if (number_month == 2) {
            System.out.println("February");
        }
    
        //Для подобного рода задач проще использовать switch case
        switch (number_month) {
            case 3:
                System.out.println("March");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                break;
        }

        //Новая конструкция switch case
        String[] namesOfMonths = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        String month = "December";
        switch (month) {
            case "December", "January", "February" -> System.out.println(namesOfMonths[0]);
            case "March", "April", "May" -> System.out.println(namesOfMonths[1]);
            case "June", "July", "August" -> System.out.println(namesOfMonths[2]);
            case "September", "October", "November" -> System.out.println(namesOfMonths[3]);
            default -> System.out.println("Неизвестное значение месяца");    
        }
    }
}