class DemoInstance{
    public int x;    
}

class Instance{
    public static void main(String[] args) {
        DemoInstance y = new DemoInstance();
        DemoInstance z = new DemoInstance();
        z.x = 12;
        y.x = 14;
        System.out.println("y.x = "+y.x);
        System.out.println("z.x = "+z.x);   
    }
}