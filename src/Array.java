public class Array {
    public static void main(String[] args) {
        //Массив(пустой) строкового типа на 12 элементов 
        String[] namesOfMonth = new String[12];
        
        //Первой ячейке присовим значение Января
        namesOfMonth[0] = "January"; 
        namesOfMonth[1] = "February"; 
        namesOfMonth[2] = "March"; 
        namesOfMonth[3] = "April"; 
        namesOfMonth[4] = "May"; 
        namesOfMonth[5] = "June"; 
        namesOfMonth[6] = "July"; 
        namesOfMonth[7] = "August"; 
        namesOfMonth[8] = "September"; 
        namesOfMonth[9] = "October";
        namesOfMonth[10] = "November"; 
        namesOfMonth[11] = "December";

        //Перебор массива
        for(int i = 0; i < 12; i++){
            System.out.println(namesOfMonth[i]);
        }

        //Вывод в строку через запятую и с точкой
        for( int j = 0; j < namesOfMonth.length; j++){
            if (j != namesOfMonth.length-1) {
                System.out.print(namesOfMonth[j] + ", ");
            }else
            System.out.println(namesOfMonth[j] + ".");
        }

        //Вывести значения числового массива
        int[] numbers = {4, 1, 3, 6};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Вывести значения числового массива в обратном порядке
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
