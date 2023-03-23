/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;
import java.util.Random;

/**
 *
 * @author tanagishunsuke
 */

public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dice={1,2,3,4,5,6};
        Random r=new Random();
        int i,j;
        System.out.println("Rolling the dice...");
        i=dice[r.nextInt(6)];
        j=dice[r.nextInt(6)];
        System.out.println("Die 1: "+i);
        System.out.println("Die 2: "+j);
        System.out.println("Total value:" +(i+j));
        
    }
    
}
