public class DemoNarrowing {
    public static void main(String[] args) {
        int b = 12;
        byte a;
        a = (byte)b;
        System.out.println("a = "+b);

        double d = 2.14;
        // int i = d;
        int i = (int)d;
        System.out.println("i = "+i);

        byte x = (byte)128;
        System.out.println(128%256);// -ve value in Reduced modulo system
        System.out.println(x);

    }
}
