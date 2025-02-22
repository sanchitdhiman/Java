public class Rectangle {
    public static void main(String[] args) {
        int l = 10;
        int b = 25;

        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println();

        int perimeter = 2 * (l + b);
        int area = l * b;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
