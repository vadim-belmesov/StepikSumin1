public class Array {
    public static void main(String[] args) {
        String[] namesOfMonth = new String[12];//массив на 12 элементов
        namesOfMonth[0] = "Январь";
        namesOfMonth[1] = "Февраль";
        namesOfMonth[2] = "Март";
        namesOfMonth[3] = "Апрель";
        namesOfMonth[4] = "Май";
        namesOfMonth[5] = "Июнь";
        namesOfMonth[6] = "Июль";
        namesOfMonth[7] = "Август";
        namesOfMonth[8] = "Сентябрь";
        namesOfMonth[9] = "Октябрь";
        namesOfMonth[10] = "Ноябрь";
        namesOfMonth[11] = "Декабрь";

        for (int i = 0; i < namesOfMonth.length; i++) {
            if (i == 11){
                System.out.print(namesOfMonth[i] + ".");
                break;
            }
            System.out.print(namesOfMonth[i] + ", ");
        }
    }
}
