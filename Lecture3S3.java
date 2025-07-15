/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture3s3;
public class Lecture3S3 {
    public static void main(String[] args) {
        int x = 1;
        A obj = new A();
        System.out.println("x = "+x);
        System.out.println("Inside object"+obj);
        obj.f(); // call instance method  
        A.g(); // call class mathod
         // x = 40;  in class invisible
        obj.x = 40; // instance attibute
        A.y = 50; // class attibute
        
    }
    
}
class A{
    int x; //instance attibute
    static int y = 0; // class attibute
    void f(){ // instance mathod
        x = 10;
        h();
    }
    static void g(){ // class mathod
        // f();
        // x = 20;
        A obj = new A();
        obj.f();
        obj.x = 20;
        y = 40;
        e();
    }
    void h(){
        x = 40;
    }
    static void e(){
        // x = 50; Can' do it
        A obj = new A();
        obj.h();
        obj.x = 50;
    }
}
