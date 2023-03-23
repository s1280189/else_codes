/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures;

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
    double radius=3;
    @Override
    public String toString(){
        return getClass().getName()+ " " + name;
    }
    public double periMethod(){
        perimeter=radius*2*Math.PI;
        return perimeter;
    }
    public double AreaMethod(){
        area=radius*radius*Math.PI;
        return area;
    }
}
class Rectangle extends Shape{
    double[] adjside={2,4};
    @Override
    public String toString(){
        return getClass().getName()+ " " + name;
    }
    public double periMethod(){
        perimeter=adjside[0]*2+adjside[1]*2;
        return perimeter;
    }
    public double AreaMethod(){
        area=adjside[0]*adjside[1];
        return area;
    }
}
class Square extends Rectangle{
    double side=4;
    @Override
    public String toString(){
        return getClass().getName()+ " " + name;
    }
    public double periMethod(){
        perimeter=side*4;
        return perimeter;
    }
    public double AreaMethod(){
        area=side*side;
        return area;
    }
}
class Parallelogram extends Rectangle{
    double[] adjside={4,5};
    double diagonal=6;
    @Override
    public String toString(){
        return getClass().getName()+ " " + name;
    }
    @Override
    public double periMethod(){
        perimeter=adjside[0]*2+adjside[1]*2;
        return perimeter;
    }
    double cos=(adjside[0]*adjside[0]+adjside[1]*adjside[1]-diagonal*diagonal)/(2*adjside[0]*adjside[1]);
    double sin=Math.sqrt(cos);
    public double AreaMethod(){
        area=adjside[0]*adjside[1]*sin;
        return area;
    }
}
class Rhombus extends Square{
    double side=5;
    double diagonal=7;
    @Override
    public String toString(){
        return getClass().getName()+ " " + name;
    }
    @Override
    public double periMethod(){
        perimeter=4*side;
        return perimeter;
    }
    double diagonal2=2*Math.sqrt((side*side)-(diagonal/2*diagonal/2));
    
    public double AreaMethod(){
        area=diagonal*diagonal2/2;
        return area;
    }
}

public class TestFigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle a=new Circle();
        Rectangle b=new Rectangle();
        Square c=new Square();
        Parallelogram d=new Parallelogram();
        Rhombus e=new Rhombus();
        System.out.println("<Instant data>");
        System.out.println("Circle radius:"+a.radius);
        System.out.println("Rectangle adjside:"+(b.adjside[0])+" ,"+(b.adjside[1]));
        System.out.println("Square side:"+c.side);
        System.out.println("Parallelogram adjside:"+d.adjside[0]+" ,"+d.adjside[1]+" ,diagonal:"+d.diagonal);
        System.out.println("Rhombus side:"+e.side+" ,diagonal"+e.diagonal);
        System.out.println("<Perimeter>");
        System.out.println("Circle_perimeter:"+a.periMethod());
        System.out.println("Rectangle_perimeter:"+b.periMethod());
        System.out.println("Square_perimeter:"+c.periMethod());
        System.out.println("Parallelogram_perimeter:"+d.periMethod());
        System.out.println("Rhombus_perimeter:"+e.periMethod());
        System.out.println("<Area>");
        System.out.println("Circle_area:"+a.AreaMethod());
        System.out.println("Rectangle_area:"+b.AreaMethod());
          System.out.println("Spuare_area:"+c.AreaMethod());
            System.out.println("Parallelogram_area:"+d.AreaMethod());
              System.out.println("Rhombus_area:"+e.AreaMethod());
              
    }
    
}
