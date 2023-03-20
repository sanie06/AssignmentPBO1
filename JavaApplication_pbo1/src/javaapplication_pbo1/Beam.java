/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_pbo1;

/**
 *
 * @author Lenovo
 */
public class Beam extends Rectangle implements CalculateSpace {
    
    //v p l t
    //lp 2 (pl)(pt)(lt)
    private  double h;
    private double p;
    private double l;
    
    Beam (double p, double l, double h){
        super(p, l);
        this.h = h;
        
    }

    @Override
    public double Surface() {
        return 2 * Area() + Circumtance() * h;
    }

    @Override
    public double volume() {
        return Area() * h;
    }

    
}
