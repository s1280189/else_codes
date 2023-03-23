/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onefile;

/**
 *
 * @author tanagishunsuke
 */

/**
     * @param args the command line arguments
     */
public class OneFile {
	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle(10, 20);
		MyRectangle r2 = new MyRectangle(40, 50);
		switch (r1.isLargerThan(r2)) {
			case 1:
				System.out.println("r1 is greater than r2");
				break;
			case 0:
				System.out.println("r1 is equal to r2");
				break;
			default:
				System.out.println("r1 is less than r2");
				break;

		}

	}
}
    
    
