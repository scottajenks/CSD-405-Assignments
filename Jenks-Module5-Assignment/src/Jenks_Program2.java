/*Scott Jenks
 * 1/24/2023
 * Module 5 - Create, write and read file Assignment
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Jenks_Program2 {

    public static void main(String[] args) {

        // Create file data.file if it does not exist
        try {
            File newFile = new File("data.file");
            if (newFile.createNewFile()) {
                System.out.println("File " + newFile.getName() + " has been created.");

                // Write 10 randomly generated numbers to file
                try {
                    FileWriter writeInNewFile = new FileWriter("data.file");

                    for (int i = 0; i < 10; i++) {
                        int randomNumber = (int) (Math.random() * 100);
                        writeInNewFile.write(randomNumber + " ");
                    }
                    System.out.println("10 numbers were selected at random and added to " + newFile.getName());

                    // Close file
                    writeInNewFile.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            } else {
                System.out.println("The file " + newFile.getName() + " already exists.");

                // Append 10 randomly generated numbers to file
                try {
                    FileWriter writeInNewFile = new FileWriter("data.file", true);

                    for (int i = 0; i < 10; i++) {
                        int randomNumber = (int) (Math.random() * 100) + 1;
                        writeInNewFile.write(randomNumber + " ");
                    }
                    System.out.println("10 MORE numbers were selected at random and added to " + newFile.getName());

                    // Close file
                    writeInNewFile.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Reopen, read and display contents of file
        try {
            File openFile = new File("data.file");
            Scanner readFile = new Scanner(openFile);
            System.out.println("\nThe contents of the file " + openFile.getName() + " are:");
            while (readFile.hasNext()) {
                String data = readFile.next();
                System.out.printf("%-4s", data);
            }
            // Close file
            readFile.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
