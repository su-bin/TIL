public class OverflowExample {
    public static void main(String[] args) {
        int x = 1000000;        // long x = 1000000;
        int y = 1000000;        // long y = 1000000;
        int z = x + y;      // long z = x + y;
        System.out.println(z);
    }
}
