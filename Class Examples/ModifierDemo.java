class AccessModifiersDemo {
    public String publicVar = "This is public.";
    private String privateVar = "This is private.";
    protected String protectedVar = "This is protected.";

    public void publicMethod() {
        System.out.println("This method is public.");
    }

    private void privateMethod() {
        System.out.println("This method is private.");
    }

    protected void protectedMethod() {
        System.out.println("This method is protected.");
    }
}

public class ModifierDemo {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing public members
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Private members and methods cannot be accessed from outside the class
        // Uncommenting the following lines will result in a compilation error
        // System.out.println(obj.privateVar);
        // obj.privateMethod();

        // Accessing protected members
        System.out.println(obj.protectedVar);
        obj.protectedMethod();
    }
}
