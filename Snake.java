import greenfoot.*;

/**
 * Write a description of class Snake here.
 * 
 * @alexanderjsingleton
 * @version 2.0
 */
public class Snake extends Animal
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        randomTurn();
        turnEdge();
        seeAndEat();     
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
        if ( canSee(Turtle.class) ){
            eat(Turtle.class);

        }
    }
}    

