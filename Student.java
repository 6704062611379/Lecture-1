/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture2s3;

/**
 *
 * @author student
 */
public class Student {
    private String name;
    private String surname;
    private int id;
    private double gpa;
    
    Student(){
    }

    public Student(String name, String surname, int id, double gpa) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gpa = gpa;
    }
    
    //methon
    void printStdInfo(){
        System.out.println("Id: "+this.id+"Name: "+this.name+" Surname: "+this.surname);
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
