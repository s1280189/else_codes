/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingworkinghours;
import java.util.*;
/**
 *
 * @author tanagishunsuke
 */
public abstract class Employee{
     private int h; // number of hours at work today
     private int w; // hourly wage 

   Employee(int w) { this.w = w; h = 0; }
   public int getH() { return h;};
   public int getW() { return w; }; 
   public void setH(int h) { this.h = h; } 
   abstract public void generateNumberHours();
   public int getDayPayment() { return w * h; };

}
