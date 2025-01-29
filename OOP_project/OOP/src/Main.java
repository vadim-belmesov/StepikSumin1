public class Main {
    public static void main(String[] args) throws Exception {
        Box current = new Box(10);
        Box another = current.copy2();

        current.showVolume();
        another.showVolume();

//    System.out.println(current.compareNotPrint(another));

    }
}
