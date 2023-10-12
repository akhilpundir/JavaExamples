public class TypePromotion {
    public static void main(String[] args) {
        byte b = 50;
        // b = b*2; // this will be an int value, so can't assign an int to byte
        b = (byte)(b*2);
        System.out.println(b);

        int x;
        x = (int)(200/1.4);
        System.out.println("x="+x);

    }
}
