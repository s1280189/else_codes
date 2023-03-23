/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingworkinghours;
import java.util.Random;
/**
 *
 * @author tanagishunsuke
 */

class Regular extends Employee{
    int h=0;
    int w;

    public Regular(int w) {
        super(w);
    }
    @Override
    public int getH(){ generateNumberHours(); return h;};
    @Override
    public int getW(){ return w;};
    @Override
    public int getDayPayment(){
          w=getW();
          h=getH();
        return w * h;
    }
    @Override
    public void generateNumberHours(){
        Random rand =new Random();
        h=rand.nextInt(2)+8;
    }
}

class PartTime extends Employee{
 int h=0;
 int w;

    public PartTime(int w) {
        super(w);
    }
    
    @Override
    public int getH(){generateNumberHours();return h;};
    @Override
    public int getW(){w=1000; return w;};
    @Override
    public int getDayPayment(){
          w=getW();
        h=getH();
        return w * h;
    }
    public void generateNumberHours(){
        Random rand =new Random();
        h=rand.nextInt(5);
    }
}

class Engineer extends Employee{
    int h=0;
    int w;

    public Engineer(int w) {
        super(w);
    }
    @Override
    public int getH(){ 
        generateNumberHours();
        return h;
    }
    @Override
    public int getW(){w=2500; return w;};
    @Override
    public int getDayPayment(){
        w=getW();
        h=getH();
        return w * h;
    }
    @Override
     public void generateNumberHours(){
        Random rand =new Random();
        h=rand.nextInt(3)+8;
    }
   

}

class Manager extends Employee{
    int h=0;
    int w;

    public Manager(int w) {
        super(w);
    }
    @Override
    public int getH(){generateNumberHours(); return h;};
    @Override
    public int getW(){w=2900; return w;};
    @Override
    public int getDayPayment(){
         w=getW();
         h=getH();
        return w * h;};
    @Override
     public void generateNumberHours(){
        Random rand =new Random();
        h=rand.nextInt(6)+6;
    }
}



public class CalculatingWorkingHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Employee[] e; 
      Random rand = new Random(); 
      e = new Employee[rand.nextInt(500)]; 
      for(int i = 0; i< e.length; i++) { 
         switch (rand.nextInt(4)) {
           case 0: 
               e[i]=new Regular(2000);
                System.out.println("Regular e["+i+"]'s payment:"+e[i].getDayPayment());
            break; 
           case 1:
               e[i]=new PartTime(1000);
                System.out.println("PartTime e["+i+"]'s payment:"+e[i].getDayPayment());
               break; 
           case 2: 
               e[i]=new Engineer(2500);
                System.out.println("Engineer e["+i+"]'s payment:"+e[i].getDayPayment());
            break; 
           case 3:
               e[i]=new Manager(2900);
               System.out.println("Manager e["+i+"]'s payment:"+e[i].getDayPayment());
            break; 
         } 
      } 
/* your code */
    }
    
}
