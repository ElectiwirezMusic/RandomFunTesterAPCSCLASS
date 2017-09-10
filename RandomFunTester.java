//Name: Tushar Shrivastav
//
//RandomFunTester.java
//
//Description: The Goal of this class is to generate a random number, which will decide whether to show a square, house or a circle. The radius of the of the circle is also randomly generated.

import java.util.Random;

public class RandomFunTester {
	    int action;
	    
		//constructor
	    public RandomFunTester (){
	    	action = 0;	
	    }
	    //generates the random radius of the circle between 20 and 50
	    public int randgenradius(int min, int max){	
			Random ran = new Random();
			return (min + ran.nextInt((max - min) +1)+ min);
		}
	    
	    //generates randome number 
	     public void RandGenNum(){
			Random num = new Random();
			int range = 3;
			int j;
			for(j = 1; j <= 10; j++){
				 action = 1 + num.nextInt(range);
				
			}
		}
	    //main method
        public static void main(String[] args){
	        	
		      RandomFunTester myTester = new RandomFunTester();
               
              myTester.RandGenNum(); 	
               
               //switch statement decides whether to show a square, house or circles.
               switch (myTester.action) {
               
               case 1: 
               	      DrawHouse hs = new DrawHouse();
               	      hs.drawhs();
               	      break;
               
               case 2:
               	      DrawSquare sq = new DrawSquare();
               	      sq.drawsq();
               	      break;
               
               case 3:
               		DrawCircles ci = new DrawCircles();
               		ci.drawcirc(myTester.randgenradius(20, 50));
               		break; 
                	
               
               default: 
               	      System.out.println("This is an error fine the error and fix it");
               		  break;
               }
		}
   
}