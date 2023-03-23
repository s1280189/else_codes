/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjects;

/**
 *
 * @author tanagishunsuke
 */
class Rectangle{
    int perimeter;
    public int RectangleMethod(int height,int length){
        perimeter=2*height+2*length;    
        return perimeter;
    }
}

class Box extends Rectangle{
    public int BoxMethod(int width){
        int perimeter=super.RectangleMethod(2, 3);
        System.out.println("Rectangle_Perimeter=" +perimeter);
        perimeter=4*width+2*(perimeter);
        return perimeter;
    }
}

public class TestObjects extends Box {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = new Box().BoxMethod(4);
        System.out.println("Box_Perimeter=" +x);       
    }
    
}
