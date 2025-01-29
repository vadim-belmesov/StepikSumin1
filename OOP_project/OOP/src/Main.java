public class Main {
    public static void main(String[] args) throws Exception {
        Box current = new Box(10);
        Box another = current.copy2();
        Box increasedBox = current.increase();

        current.showVolume();
        another.showVolume();
        increasedBox.showVolume();

//    System.out.println(current.compareNotPrint(another));

    }
}
