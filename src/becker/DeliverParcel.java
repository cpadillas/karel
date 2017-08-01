package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing t1 = new Thing(prague, 1, 2);
      Thing t2 = new Thing(prague, 2, 2);
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,20);
      Wall p1 = new Wall(prague, 1, 2, Direction.WEST);
    
      // Direct the robot to the final situation
      karel.move();
      
      karel.putThing();
      karel.move();
      	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
      
      
      
      /*karel.canPickThing();
      karel.pickThing();
      karel.putThing();
      karel.move();
      karel.turnLeft();
      karel.frontIsClear();*/
   }
}
