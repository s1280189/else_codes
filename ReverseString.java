/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author tanagishunsuke
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream in =null;
        FileOutputStream out=null;
       int ch;
       int count=0;
       int j=0;
       int i;
       int fileOut[]=new int[1200];
     
       try{
           in = new FileInputStream("/Users/tanagishunsuke/NetBeansProjects/ReverseString/build/classes/input.txt");
           out = new FileOutputStream("/Users/tanagishunsuke/NetBeansProjects/ReverseString/build/classes/output_q1.txt");
           System.out.println("input.txt is as follows:");
           while((ch=in.read())!=-1){
              System.out.print((char)ch);
              fileOut[count]=ch;
              count++;
           }
           System.out.println("Output File is as follows:");
           for(i=count;i>=0;i--){
               System.out.print((char)fileOut[i]);
               out.write(fileOut[i]);
           }
           
       }
       finally{
           if(in != null){
               in.close();
           }
           if(out !=null){
               out.close();
           }
       }
       System.out.println();
    }
   
}
