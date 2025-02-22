public class BitwiseOperations {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println();

        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("~x = " + (~x));
        System.out.println("~y = " + (~y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("x << y = " + (x << y));
        System.out.println("x >> y = " + (x >>> y));
        System.out.println("x >>> y = " + (x >>> y));
    }
}
