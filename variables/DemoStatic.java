// class OtherClass{
//      public static int x = 18;
// }
public class DemoStatic {
   public static int x = 18;
    public static void main(String[] args) {
        System.out.println("static var x = "+ x);
        System.out.println("x = "+DemoStatic.x);
        //creating first object
        DemoStatic obj1 = new DemoStatic();
        obj1.x = 20;

        //creating 2nd object
        DemoStatic obj2 = new DemoStatic();
        obj2.x = 22;
        System.out.println("obj1.x = "+obj1.x);
        System.out.println("obj2.x = "+obj2.x);

        
    }
}
