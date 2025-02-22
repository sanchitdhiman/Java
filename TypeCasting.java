public class TypeCasting {
    public static void main(String[] args) {
        int x = 24212;
        float y = 34234.234234f;
        double z = 2.412423425134123141532254235211;

        System.out.println("int: " + x);
        System.out.println("float: " + y);
        System.out.println("double: " + z);

        System.out.println();

        int a = (int) y;
        int b = (int) z;

        float c = x;
        float d = (float) z;

        double e = x;
        double f = y;

        System.out.println("float -> int: " + a);
        System.out.println("double -> int: " + b);
        System.out.println("int -> float: " + c);
        System.out.println("double -> float: " + d);
        System.out.println("int -> double: " + e);
        System.out.println("float -> double: " + f);
    }
}
