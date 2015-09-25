import greenfoot.*; 

public class Turtle extends Animal
{
    public void act()
    {
        move(4);
        checkKeys();
        seeAndEat();
    }
    /**
     * *Check whether the control keys are being pressed, and turn if they are.
     */ 
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
         if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    }
    public void randomTurn()
    {
        
        if ( Greenfoot.getRandomNumber(100) <10 ) 
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
        
    }
    /**
     * this will turn it
     */
    public void turnEdge() {
         if( atWorldEdge() ){
            turn(7);
        }

    }
    
    public void seeAndEat(){
        if ( canSee(lettuce.class) ){
            eat(lettuce.class);

        }
    }
}
