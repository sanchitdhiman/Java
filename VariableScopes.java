public class VariableScopes {

    static int x = 10;  // static variable
    char y = 'a';   // instance variable

    void method() {
        int x = 20; // local variable
        System.out.println("x = " + x);
    }

    void anotherMethod() {
        x = 11; // Static variable, x
        System.out.print("x = " + x);
    }

    public void main(String[] args) {

        System.out.print("Local variable: ");
        this.method();

        System.out.println("Instance variable: y = " + this.y);

        System.out.print("Static variable: ");
        this.anotherMethod();
    }
}
