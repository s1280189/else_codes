/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallyclause;

/**
 *
 * @author tanagishunsuke
 */
public class FinallyClause {
static int count = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            try {
                if (++count == 2) throw new Exception();
                if (count == 3) break;
                System.out.println("(" + count + ") No exception");
            } catch (Exception e) {
                System.out.println("(" + count + ") Exception occurred");
            } finally {
                System.out.println("(" + count + ") in finally clause");
            }
        } // end while
    System.out.println("Main program ends");
    }
    
}
