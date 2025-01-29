public class Main {
    public static void main(String[] args) throws Exception {
    Box current = new Box(10);
    Box another = new Box(current);

    current.showVolume();
    another.showVolume();

//    System.out.println(current.compareNotPrint(another));

    }
}
