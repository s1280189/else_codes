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
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point i=new Point();
        Circle j=new Circle();
        Rectangle k=new Rectangle();
        i.getI(2, 3);
        j.getRadius(4);
        k.getW_and_H(5.5, 6.3);
        double area;
        area=i.getArea()+j.getArea()+k.getArea();
        System.out.println("Sum of Area:"+area);
    }
    
}
