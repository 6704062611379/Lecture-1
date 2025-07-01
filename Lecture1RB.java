/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture1rb;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Lecture1RB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Input radius: ");
        final double PI = 3.14; 
        double radius = user.nextDouble();
        double area = PI*radius ;
        System.out.println("Area = "+area);
        int a = (int) 10.0; //dow casting int < double *****
        double b = 1; // up casting double > int ******
        //float c = 10.0;  in java it look 10.0 = double ******
        float c = (float)10.0; // dow casting 
        // java is very picky type data !!!
        float d = 10.0f;
        
        /*
        System.out.print("Input a: ");
        int a = user.nextInt();
        System.out.print("Input b: ");
        int b = user.nextInt();
        int c = a + b;
        System.out.println("a = "+a+" b = "+b+" c = "+c);
       */
    }
    
}
