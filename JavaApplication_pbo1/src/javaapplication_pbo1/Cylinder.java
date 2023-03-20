/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_pbo1;


public class Cylinder extends Circle implements CalculateSpace {
    
    // volume = phi r2 t
    //lp = 2 phi r (r+t)
    private double r;
    private double h;
    
    Cylinder(double r, double h){
        super(r);
        this.h = h;
       
    }

    @Override
    public double Surface() {
        return Area() * h;
    }

    @Override
    public double volume() {
         return Circumtance() * (r + h) ;
    }
    
    
    
}
