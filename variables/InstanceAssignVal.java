class DemoInstance{
    private int x;
    void assignVal(int p)
    {
        x = p;
    }
    int showx()
    {
        return x;
    }
    
}

public class InstanceAssignVal {
        public static void main(String[] args) {
             DemoInstance y = new DemoInstance();
        // y.x = 14;
        // System.out.println("y.x = "+y.x); 
        y.assignVal(20);
        System.out.println(y.showx());
        }
}
