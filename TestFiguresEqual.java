/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfiguresequal;

/**
 *
 * @author tanagishunsuke
 */
class Shape {
  String name;
  double perimeter;
  double area;
  public Shape(String name) { 
    this.name = name;
  }
  public Shape() {
    name = "no name";
  }
  public String getName() {
    return name;
  }
  @Override
  public String toString() {
    return getClass().getName() + " " + name;
  }
}

class Circle extends Shape{
   
}
class Rectangle extends Shape{
  
}
class Square extends Rectangle{
    
}
class Parallelogram extends Rectangle{
   
}
class Rhombus extends Square{
  
}
public class TestFiguresEqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
}
