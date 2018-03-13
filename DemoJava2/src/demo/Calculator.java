/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.util.Scanner;

/**
 *
 * @author TingFu
 */
public class Calculator {
    int number1; 
    int number2;
    
    void add(int a, int b) {
        a = number1;
        b = number2;
        System.out.println(a+b);
    }
    
    void subst(int a, int b) {
        a = number1;
        b = number2;
        System.out.println(a-b);
    }
    
    void multi(int a, int b) {
        a = number1;
        b = number2;
        System.out.println(a*b);
    }
    
    void divis(int a, int b) {
        a = number1;
        b = number2;
        System.out.println(b==0?"Divisor must be differ 0":(float)a/b);
    }
    
    public static void main(String[] args) {
        Calculator PhepTinh = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        PhepTinh.number1 = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        PhepTinh.number2 = scanner.nextInt();
    }
}
