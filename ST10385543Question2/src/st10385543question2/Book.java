/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385543question2;

/**
 *
 * @author kpada
 */
public class Book {
    // uses private variables
    private String title;
    private String author;

    public Book(String title, String author) {// constructor
        //allows user to enter and also saves the information
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
    

