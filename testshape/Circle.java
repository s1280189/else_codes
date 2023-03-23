/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author tanagishunsuke
 */
class Circle implements Shape{
    double x;
    void getRadius(double x1){
        x=x1;  
    }
    @Override
    public double getArea(){
        
        return x*x*Math.PI;    
}
    
}
