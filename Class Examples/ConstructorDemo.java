/* Here, Box uses a constructor to initialize the
dimensions of a box.
*/
class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        this. width = 10;
        this.height = 10;
        this.depth = 10;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
 }
    class ConstructorDemo {
        public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
            Box mybox1 = new Box();
            Box mybox2 = new Box();
            double vol;
            // get volume of first box
            vol = mybox1.volume();
            System.out.println("Volume is " + vol);
            // get volume of second box
            vol = mybox2.volume();
            System.out.println("Volume is " + vol);
        }
    }