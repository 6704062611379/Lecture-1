/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture2s3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Lecture2s3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student moodeng = new Student("Moodeng", "Chon", 67001, 001);
        moodeng.printStdInfo();
        /*double radius = sc.nextDouble();
        Circle circle1 = new Circle(); // like int x;
        circle1.setRadius(radius);
        double ans = circle1.getArea();
        System.out.println("Radius = "+ans);
        Circle circle2 =  new Circle (20);
        System.out.println("Area = "+circle2);
        */
    }
    
}

class Circle {
    //attribute
    private double radius;
    private double area;
    //constructor
    Circle(){ //default constructor
         this.radius = 0;
         this.area = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    
    //method
    void calArea(){
        area = 3.14 * radius * radius;
    }
    double getArea(){ // it is getter
        calArea();
        return area;
    }
    void setRadius(double radius){ // it is setter
        this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }
    
    
    
}
