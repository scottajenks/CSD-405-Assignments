/*Scott Jenks
 * 1/24/2023
 * Module 5 - ArrayList Assignment with Exceptions
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Jenks_Program1 {

    public static void main(String[] args) {

        // Create list to store coding terms
        ArrayList<String> codingTerms = new ArrayList<>();

        // Add coding terms to list
        codingTerms.add("Computer");
        codingTerms.add("Java");
        codingTerms.add("Python");
        codingTerms.add("Method");
        codingTerms.add("Variable");
        codingTerms.add("String");
        codingTerms.add("Boolean");
        codingTerms.add("Mouse");
        codingTerms.add("Coffee");
        codingTerms.add("Git Hub");

        // Print out list
        for (String i : codingTerms) {
            System.out.println(i);
        }

        // Ask user which word they would like to see again
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhich coding term would you like to see again?");
        String word = input.nextLine();

        // Look through list to find users word
        try {
            // if codingTerms arrayList contins users word
            codingTerms.contains(word);
            // find index location of word
            Integer wordLocation = codingTerms.indexOf(word);
            // print the word in the index location
            System.out.println("\n" + codingTerms.get(wordLocation) + " is in the list!");
        } catch (Exception e) {
            System.out.println("\nOut of Bounds");
        }

        // Close Scanner
        input.close();
    }
}
