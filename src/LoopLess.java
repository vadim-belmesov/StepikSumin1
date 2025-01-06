public class LoopLess {

/*    public static void main(String[] args){
        int i = 1;
        while (i <= 4){
            System.out.println(i);
            i++;
        }
    }*/
/*    public static void main(String[] args) {
        int i = 1;
        while (i < 100){
            System.out.println(i);
            i++;
            if (i==7){
                break;
            }
        }
    } */
    /*public static void main(String[] args) {
        int a = 0;
        do{
            System.out.println("Hello!");
        } while (a > 0);
    }*/
    /* public static void main(String[] args) {
        //все четные числа от 0 до 1000
        int i = 0;
        while( i <= 100){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    } */
   /* public static void main(String[] args) {
    int i = 0;
    do{
        System.out.println(i);
    }while(i > 0);
   } */
/*     public static void main(String[] args) {
        for(int i=0; i < 100; i++){
            System.out.println(i);
        }
    } */
public static void main(String[] args) {
    //Вывести при помощи FOR все числа от 1000 до 0 которые делятся на 3 без остатка
    for(int i = 100; i >= 0; i--){
        if (i%3 == 0) {
            System.out.println(i);
        }
    }
}

}
