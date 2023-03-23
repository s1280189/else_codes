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
class Point {
    private int x = 0;
    private int y = 0;
	// a constructor!
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }
    // a method for moving the point
    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }
}

