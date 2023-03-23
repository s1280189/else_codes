/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsphere;
class Sphere {
    float radius1;
    float radius2;
  
    
    public Sphere(float newradius1,float newradius2){
        radius1=newradius1;
        radius2=newradius2;
    }
    public float Sphereradius1(){
        return radius1;
    }
    public float Sphereradius2(){
        return radius2;
    }
    
    public double SphereVolume(float radius1){
        double i=(4/3)*radius1*radius1*radius1*Math.PI;
        return i;
    }
    /**
     * @param args the command line arguments
     */
    public float heightContactPoint(float radius1,float radius2){
        float x=0;
        float i,j;
        i=radius1-radius2;
        j=radius1+radius2;
        x=i*radius2/j;
        x=radius2+x;
        return x;
    }
}
public class TestSphere{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float radius1=3;
        float radius2=2;
        float radius3=radius2;
        float x=new Sphere(radius1,radius2).heightContactPoint(radius1,radius2);
        float y=new Sphere(radius2,radius2).heightContactPoint(radius2,radius3);
        double v1=new Sphere(radius1,radius2).SphereVolume(radius1);
        double v2=new Sphere(radius2,radius3).SphereVolume(radius2);
            System.out.println("Sphere1 Volume:"+v1);
            System.out.println("Sphere2 Volume:"+v2);
            System.out.println("Sphere3 Volume:"+v2);
            System.out.println("Sphere1 and Sphere2 height:"+x);
            System.out.println("Sphere1 and Sphere3 height:"+x);
            System.out.println("Sphere2 and Sphere3 height:"+y);
    }
    
}
