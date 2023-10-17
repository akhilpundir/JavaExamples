import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ByteStream {
    public static void main(String[] args) {
        String inputFile = "football.png";
        String outputFile = "inverted.jpg";

        try {
            // Load the input image
            BufferedImage image = ImageIO.read(new File(inputFile));

            // Perform pixel manipulation (invert colors)
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    int rgb = image.getRGB(x, y);
                    int invertedRgb = ~rgb;
                    image.setRGB(x, y, invertedRgb);
                }
            }

            // Save the manipulated image
            File output = new File(outputFile);
            ImageIO.write(image, "jpg", output);

            System.out.println("Pixels Inverted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
