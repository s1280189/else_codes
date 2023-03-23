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
class Rectangle implements Shape {
    double w;
    double h;
    void getW_and_H(double w1,double h1){
       w=w1;
       h=h1;
    }
    @Override
    public double getArea(){
        return w*h;   
}
}
