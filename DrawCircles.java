//Name: Tushar Shrivastav 
//
//Period 2
//
//DrawHouse.java
//
//Class Description: This program is made using DrawSquare.java as a base, and the APCSLIB to draw 3 circles, with a random radius and a specific color.

import apcslib.*;
import java.awt.Color;


public class DrawCircles{
	
	private DrawingTool pen;
    private SketchPad canvas;
    public static final int CANVAS_WIDTH = 800;
	public static final int CANVAS_HEIGHT = 800;
    
    /**
	 *  Basic constructor for Circle.  
	 *  Instantiates canvas and pen to basic
	 *  values.
	 */
    public DrawCircles()
    {
    	canvas = new SketchPad(CANVAS_WIDTH, CANVAS_HEIGHT);
	    pen = new DrawingTool(canvas);
    }
    
    //method to due circles
    public void drawcirc(int x)
    { 
    	pen.setColor(Color.red);
    	pen.up();
    	pen.move(0,0);
        pen.down();
    	pen.drawCircle(x);
    	pen.setColor(Color.blue);
    	pen.up();
    	pen.move(-75.-75);
    	pen.down();
    	pen.drawCircle(x);
    	pen.setColor(Color.green);
    	pen.up();
        pen.move(100,50);
        pen.down();
        pen.drawCircle(x);}
}