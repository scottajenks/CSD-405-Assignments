
/*Scott Jenks
 * 1/10/2023
 * Module 4 - ArrayList Assignment
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ScottArrayListTest {
    public static void main(String[] args) {

        // Create ArrayList called numberList
        ArrayList<Integer> numberList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (input ends when you enter 0): ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            numberList.add(number); // Adds number to list if it doesn't equal 0
            number = input.nextInt();
        }

        // Show the largest number in the ArrayList
        System.out.println("The largest number from your input is " + max(numberList));

        input.close();
    }

    // Method to return the largest number from the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return 0;

        Integer maxNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxNumber)
                maxNumber = list.get(i);
        }
        return maxNumber;
    }
}
