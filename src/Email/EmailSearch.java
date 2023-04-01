package Email;

import java.util.Scanner;

public class EmailSearch {
	public static void main(String[] args) {
        // create an array of email IDs
        String[] emailArray = {"shyam@gmail.com", "simplilearn@example.com", "alice@example.com", "ram@example.com"};

        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email ID to search: ");
        String searchEmail = scanner.nextLine();

        // loop through the array and check if the search email ID exists in the array
        boolean found = false;
        for (String email : emailArray) {
            if (searchEmail.equalsIgnoreCase(email)) {
                found = true;
                break;
            }
        }

        // print the result
        if (found) {
            System.out.println(searchEmail + " exists in the array.");
        } else {
            System.out.println(searchEmail + " does not exist in the array.");
        }
    }
}


