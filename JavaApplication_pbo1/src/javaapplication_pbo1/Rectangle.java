/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_pbo1;

public class Rectangle implements CalculateFlatField {
    
    //panjang lebar
    private double p;
    private double l;
    
    Rectangle(double p, double l){
        this.p = p;
        this.l = l;        
    }

    
    public double Area() {
        return  p * l;
    }

 
    public double Circumtance() {
        return 2 * (p + l) ;
    }
       
    
}
