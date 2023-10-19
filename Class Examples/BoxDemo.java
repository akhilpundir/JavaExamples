class Box{
    double width;
    double height;
    double length;
}
class BoxDemo{
    public static void main(String args[]){
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.length = 10;
        //compute volume
        vol = mybox.height*mybox.width*mybox.length;
        System.out.println("Volume of mybox = "+vol);
        //this is not good code, becuase it becomes lengthy to calculate:
        Box box2 = new Box();
        box2.width = 10;
        box2.height = 15;
        box2.length = 10;
        vol = box2.height*box2.width*box2.length;
        System.out.println("Volume of box2 = "+vol);

    }
}