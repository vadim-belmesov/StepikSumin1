public class Main {
    public static void main(String[] args) throws Exception {
        //int
        System.out.println(Math.multiple(10, 5));

        //double
        System.out.println(Math.multiple(10.3, 5.1));

        //single
        System.out.println(Math.multiple(100));

        Box cube = new Box(11);
        cube.showVolume();
    }
}
