/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10385543question2;

import java.util.Scanner;

/**
 *
 * @author kpada
 */
public class ST10385543Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // simple code that was modified 
        // brings the classes in
               Library library = new Library(10);
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        int userId;
        //while loop to see if the id is valid
        while (true) {
            System.out.print("Enter your user ID: ");
            String userIdStr = scanner.nextLine();

            // Validates if the integer is valid
            try {
                userId = Integer.parseInt(userIdStr);
                break; // Exit the loop if parsing is successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid inputs, Please enter a valid integer for the user ID.");
            }
        }

        System.out.println("User: " + userName + ", UserID: " + userId);

        // Allow the user to add books to the library
        while (true) {
            System.out.print("Enter book title (or type 'Quit' to exit): ");
            String bookTitle = scanner.nextLine();
            // if loops
            if (bookTitle.equalsIgnoreCase("Quit")) {
                break;
            }

            System.out.print("Enter books author: ");
            String bookAuthor = scanner.nextLine();

            Book book = new Book(bookTitle, bookAuthor);
            library.addBook(book);
            System.out.println("your book was added successfully.");
        }

        // Displays info from library
        System.out.println("All Books in the Library:");
        library.displayBooks();

        // Searches for a book
        System.out.print("Enter the title of the book: ");
        String searchTitle = scanner.nextLine();
        Book foundBook = library.searchBook(searchTitle);
// if loops
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
    
    
}

/*
Reference 
1. Farrell, J. 2019. Java Programming. 9th edition. Cengage Learning.
Free copy is available on EBSCOhost. eBook ISBN (Limited User Access:
1 copy available):
https://ezproxy.iielearn.ac.za/login?url=http://search.ebscohost.com/l
2. searching for student 
line 37 to 43
idea taken from stack over flow and modified
https://stackoverflow.com/questions/30664009/easy-way-to-get-task-name-by-task-definition-id
3.  loops 
used throughout
idea taken from geeksforgeeks
https://www.geeksforgeeks.org/loops-in-java/?ref=gcse
*/