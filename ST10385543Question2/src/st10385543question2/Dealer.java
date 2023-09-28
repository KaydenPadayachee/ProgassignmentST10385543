/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385543question2;

/**
 *
 * @author kpada
 */
// extends the customer class 
// part of inheritance
    public class Dealer extends Customer {
    private String course;

    public Dealer(String name, int userId, String course) {//constructor
        super(name, userId);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
    

