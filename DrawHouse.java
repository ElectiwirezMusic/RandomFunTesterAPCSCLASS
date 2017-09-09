//Name: Tushar Shrivastav and Raiyah Shah
//
//Period 2
//
//DrawHouse.java
//
//Class Description: This program is made using DrawSquare.java as a base, and the APCSLIB to draw a house.

import apcslib.*;
import java.awt.Color;


public class DrawHouse{
	
	public static final int HOUSE_WIDTH = 400;
	public static final int HOUSE_HEIGHT = 200;
	public static final int CANVAS_WIDTH = 800;
	public static final int CANVAS_HEIGHT = 800;
	public static final int DOOR_HEIGHT = 100;
	public static final int DOOR_WIDTH = 50;
 	private DrawingTool pencil;
    private SketchPad paper;

	/**
	 *  Basic constructor for DrawHouse.  
	 *  Instantiates paper and pencil to basic
	 *  values.
	 */
	public DrawHouse(){
		paper = new SketchPad(CANVAS_WIDTH, CANVAS_HEIGHT);
	    pencil = new DrawingTool(paper);
	}

	public void tree(Integer x, Integer y){
		//code for special feature: TREE
	    pencil.up();
	    pencil.move(x,y);
	    pencil.down();
	    pencil.setWidth(4);
	    pencil.setColor(Color.red);
	    pencil.turnLeft(245);
	    pencil.forward(300);
	    //creating first leaf 
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    pencil.setColor(Color.red);
	    pencil.turnRight(160);
	    pencil.forward(300);
	    pencil.turnRight(100);
	    pencil.forward(100);
	    //second tree leaf
	    pencil.up();
	    pencil.move(-300,150);
	    pencil.down();
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    //third tree leaf
	    pencil.up();
	    pencil.move(-340,130);
	    pencil.down();
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    //fourth tree leaf
	    pencil.up();
	    pencil.move(-260,130);
	    pencil.down();
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    //fifth tree leaf
	    pencil.up();
	    pencil.move(-260,60);
	    pencil.down();
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    //sixth tree leaf
	    pencil.up();
	    pencil.move(-340,60);
	    pencil.down();
	    pencil.setColor(Color.green);
	    pencil.drawCircle(40);
	    //code finished for tree
	}
  	/**
   	 *  The draw method for the DrawHouse class.  
   	 *  This method will run all of the
     *  commands necessary to draw the square.
    
     */
  	
  	public void drawhs(){
    
	    // draws the house rectangle
	    pencil.up();
	    pencil.move(-HOUSE_WIDTH/2,-200);
	    pencil.down();
	    pencil.setWidth(3);
	    pencil.turnLeft(135);
	    pencil.forward(HOUSE_WIDTH);
	    pencil.turnLeft(90);
	    pencil.forward(HOUSE_HEIGHT);
	    pencil.turnLeft(90);
	    pencil.forward(HOUSE_WIDTH);
	    pencil.turnLeft(90);
	    pencil.forward(HOUSE_HEIGHT);
	    //end of rectangle code
	    
	    //drawing roof triangle
	    pencil.up();
	    pencil.move(-200,0);
	    pencil.down();
	    pencil.turnLeft(300);
	    pencil.forward(400/1.732);
	    pencil.turnRight(60);
	    pencil.forward(400/1.732);
	    //end of roof triangle
	    
	    //drawing the door
	    pencil.up();
	    pencil.move(0,-215);
	    pencil.turnLeft(1);
	    pencil.forward(-25);
	    pencil.down();
	    pencil.setColor(Color.blue);
	    pencil.setWidth(8);
	    pencil.turnLeft(222);
	    pencil.forward(DOOR_HEIGHT);
	    pencil.turnLeft(90);
	    pencil.forward(DOOR_WIDTH);
	    pencil.turnLeft(90);
	    pencil.forward(DOOR_HEIGHT);
	    //code for door
	    
	    //code for first window
	    pencil.up();
	    pencil.move(-120,-100);
	    pencil.down();
	    pencil.setWidth(1);
	    pencil.setColor(Color.blue);
	    pencil.drawCircle(25);
	    //code finished for first window
	    
	    //code for second window
	    pencil.up();
	    pencil.move(100,-100);
	    pencil.down();
	    pencil.drawCircle(25);
	    //code finished for second window
	    
	    //calling tree method
	    tree(-350,-200);
	    
	    
	     
	   	}
}

