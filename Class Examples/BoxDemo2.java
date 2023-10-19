class Box{
    double width;
    double height;
    double length;
    double volume(){
        return width*height*length;
    }
}
class BoxDemo2{
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box();
        // any number of objects can be created here
        double vol;
        box1.width = 10;
        box1.height = 20;
        box1.length = 10;
        
        vol = box1.volume();
        System.out.println("Volume of mybox = "+vol);
        
        box2.width = 10;
        box2.height = 15;
        box2.length = 10;
        
        vol = box2.volume();
        System.out.println("Volume of box2 = "+vol);

    }
}