public class Method {
    // Parameters and Arguments
    static void myMethod(String name) {
        System.out.println(name + " Refsnes");
    }
    // Multiple Parameters
    static void myMethod1(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    //Return Values
    static int myMethod2(int x, int y) {
        return x * y;
    }
    //store the result in a variable,recommended, as it is easier to read and maintain
    static int myMethod3(int x, int y) {
        int z = x+y;
        return z;
    }
    //Method Overloading
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    //Java Recursion:the technique of  making a function call itself

    // call a method
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        myMethod1("Liam", 5);
        myMethod1("Jenny", 8);
        myMethod1("Anja", 31);
        System.out.println(myMethod2(10, 3));
        System.out.println(myMethod3(10, 3));
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }
}
