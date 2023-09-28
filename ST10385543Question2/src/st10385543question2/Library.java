/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385543question2;

/**
 *
 * @author kpada
 */
public class Library {
    //variables
    private Book[] books;
    private int bookCount;
  

    public Library(int capacity) {//constructor
        books = new Book[capacity];
        bookCount = 0;

  
    }
// the method that adds book
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
// method that displays the books
    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getTitle());
        }
    }
    // method that does the searching for the books
            public Book searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // if book not found
    }
}
    /*
1. 2. searching for student 
line 37 to 43
idea taken from stack over flow and modified
https://stackoverflow.com/questions/30664009/easy-way-to-get-task-name-by-task-definition-id

*/

    

