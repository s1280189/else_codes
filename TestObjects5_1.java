/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjects5_1;

/**
 *
 * @author tanagishunsuke
 */
class Rectangle{
    int perimeter;
    public int RecMethod(int height,int length){
        perimeter=2*height+2*length;
        return perimeter;
    }
}

class Box{
    int perimeter;
    public int BoxMethod(int height,int length,int width){
        perimeter=4*(height+length+width);
        return perimeter;
    }

}
public class TestObjects5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int yz = new Rectangle().RecMethod(2, 3);
        int x = new Box().BoxMethod(2, 3, 4);
        System.out.println("Rectangle_perimeter="+yz);
        System.out.println("Box_perimeter="+x);
    }
    
}
