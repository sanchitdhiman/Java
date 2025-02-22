public class PositiveAndEven {
    public static void main(String[] args) {
        int x = 24;

        System.out.println("x = " + x);

        boolean y = ((x > 0) && (x % 2 == 0)) ? true : false;
        System.out.println("Positive and Even? : " + y);
    }
}
