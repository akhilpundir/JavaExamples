// Demonstrate static variables, methods, and blocks.
class UseStatic {
    static int a = 3; //first
    static int b;
    static void myStaticMethod(int x) {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
}
static{
    //static block
    b = a*4; //second
}


    public static void main(String args[]) {
        myStaticMethod(42); // third
    }
}