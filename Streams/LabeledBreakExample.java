public class LabeledBreakExample {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            innerLoop: // Label for the inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking both loops.");
                    break outerLoop; // Use the label to break the outer loop
                }
            }
        }
    }
}
