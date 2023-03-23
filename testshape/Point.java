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
class Point implements Shape{
    double x;
    double y;
    void getI(double x1,double y1){
        x=x1;
        y=y1;
    }
    @Override
    public double getArea(){
        return 0;    
}
}
