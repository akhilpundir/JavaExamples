import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Byte Stream Example
public class FileEncryption {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";
        int shift = 1; // Caesar cipher shift

        try {
            // Encrypt the input file
            encryptFile(inputFile, encryptedFile, shift);
            System.out.println("File encrypted successfully.");

            // Decrypt the encrypted file
            decryptFile(encryptedFile, decryptedFile, shift);
            System.out.println("File decrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void encryptFile(String inputFileName, String outputFileName, int shift) throws IOException {
        try (FileInputStream input = new FileInputStream(inputFileName);
             FileOutputStream output = new FileOutputStream(outputFileName)) {
            int byteRead;
            while ((byteRead = input.read()) != -1) {
                // Apply Caesar cipher encryption
                byte encryptedByte = (byte) (byteRead + shift);
                output.write(encryptedByte);
            }
        }
    }

    private static void decryptFile(String inputFileName, String outputFileName, int shift) throws IOException {
        try (FileInputStream input = new FileInputStream(inputFileName);
             FileOutputStream output = new FileOutputStream(outputFileName)) {
            int byteRead;
            while ((byteRead = input.read()) != -1) {
                // Apply Caesar cipher decryption
                byte decryptedByte = (byte) (byteRead - shift);
                output.write(decryptedByte);
            }
        }
    }
}
