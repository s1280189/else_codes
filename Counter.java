/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author tanagishunsuke
 */
abstract class Animal { 
   private static int count1; 
   public static void increment1() { count1++; } 
   public static int getCount1() { return count1; } 
   private static int count2; 
   public static void increment2() { count2++; } 
   public static int getCount2() { return count2; } 
   abstract void noise(); 
} 
class Dog extends Animal { 
   public Dog() {};
   public void noise() { 
      System.out.println("Woof"); 
      increment1(); 
   } 
} 
class Cat extends Animal { 
   public Cat() {}; 
   public void noise() { 
      System.out.println("Meow"); 
      increment2(); 
   } 
} 
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Animal[] a = {new Dog(), new Cat(), new Cat(), new Dog(), new Dog()}; 
      for (int i = 0; i < a.length; i++) 
         a[i].noise(); 
     System.out.println(Dog.getCount1() + " woofs and " + Cat.getCount2() + " meow"); 
    }
    
}
