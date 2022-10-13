/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author uniepedreis
 */
public class GradeBook {
    private String courseName;
    public void setCourseName(String name){
        courseName= name;
    }
    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the Grade Book!");
    }
    
}
