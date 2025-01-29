public class Main {
    public static void main(String[] args) throws Exception {
    Box current = new Box(10);
    Box another = new Box(20);

    System.out.println(current.compareNotPrint(another));

    }
}
