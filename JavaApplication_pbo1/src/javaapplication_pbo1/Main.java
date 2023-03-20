/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_pbo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int menu;
        boolean repeat = true;
        
        while(repeat){
            System.out.println("Program Calculate Area & Volume");
            System.out.println("1. Calculate Beam");
            System.out.println("2. Calculate Cylinder");
            System.out.println("0. Exit");
            System.out.println("Menu : ");
            menu = input.nextInt();
            
        switch(menu){
            
            case 1 :
                //calculate beam
                CalculateBeam();
                break;
            case 2 :
                //calculate cylinder
                CalculateCylinder();
                break;
            case 0 :
                System.out.println("- Program End -");
                repeat = false;
                break;
               default:
               System.out.println("Please input the right number of menu");
                }    
        
         if(repeat) {
                System.out.println("\nBack to menu (press enter)");
                input.nextLine(); 
                input.nextLine(); 
            }
                                 
        }
        
    }
    
    public static void CalculateBeam(){
        
        Scanner input = new Scanner(System.in);
        double p, l, h ;
        
        System.out.print("-Caculate Beam-");
        System.out.print("Long : ");
        p = input.nextDouble();
        System.out.print("Wide : ");
        l = input.nextDouble();
        System.out.print("Height : "); 
        h = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(p,l);
        Beam beam = new Beam(p,l,h);
        System.out.println("Area Rectangle : " + rectangle.Area());
        System.out.println("Circumtance Rectangle : " + rectangle.Circumtance());
        System.out.println("Surface Beam : " + beam.Surface());
        System.out.println("Volume Beam : " + beam.volume());
        
    }
    
    public static void CalculateCylinder(){
        
        Scanner input = new Scanner(System.in);
        double r,h;
        
        System.out.println("-Calculate Cylinder-");
        System.out.print("Radius : ");
        r = input.nextDouble();
        System.out.print("Height : ");
        h = input.nextDouble();
        
        Circle circle = new Circle(r);
        Cylinder cylinder = new Cylinder (r,h);
        System.out.println("Area Circle : " + circle.Area());
        System.out.println("Circumtance Circle : " + circle.Circumtance());
        System.out.println("Surface Cylinder: " + cylinder.Surface());
        System.out.println("Volume Cylinder : " + cylinder.volume());
        
    }
    
}
