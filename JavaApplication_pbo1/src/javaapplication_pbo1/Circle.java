/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_pbo1;


public class Circle implements CalculateFlatField {
    private double r; //jari-jari
    
    Circle(double r){
        this.r = r ;
    }
            

 
    public double Area() {
       return Math.PI * r * r; 
    }


    public double Circumtance() {
        return 2 * Math.PI * r;
    }
    
    
}
