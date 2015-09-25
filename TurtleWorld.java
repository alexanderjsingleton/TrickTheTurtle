import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(600, 480, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle, 143, 187);
        Turtle turtle2 = new Turtle();
        addObject(turtle2, 253, 267);
        Turtle turtle3 = new Turtle();
        addObject(turtle3, 390, 134);
        lettuce lettuce = new lettuce();
        addObject(lettuce, 437, 377);
        lettuce lettuce2 = new lettuce();
        addObject(lettuce2, 158, 385);
        lettuce lettuce3 = new lettuce();
        addObject(lettuce3, 73, 273);
        removeObject(lettuce2);
        removeObject(turtle2);
        removeObject(lettuce3);
        removeObject(turtle);
        removeObject(turtle3);
        removeObject(lettuce);
        Turtle turtle4 = new Turtle();
        addObject(turtle4, 160, 255);
        lettuce lettuce4 = new lettuce();
        addObject(lettuce4, 378, 379);
        lettuce lettuce5 = new lettuce();
        addObject(lettuce5, 375, 225);
        lettuce lettuce6 = new lettuce();
        addObject(lettuce6, 301, 147);
        lettuce lettuce7 = new lettuce();
        addObject(lettuce7, 148, 167);
        lettuce lettuce8 = new lettuce();
        addObject(lettuce8, 135, 244);
        lettuce lettuce9 = new lettuce();
        addObject(lettuce9, 158, 370);
        lettuce lettuce10 = new lettuce();
        addObject(lettuce10, 383, 319);
        lettuce lettuce11 = new lettuce();
        addObject(lettuce11, 476, 264);
        lettuce lettuce12 = new lettuce();
        addObject(lettuce12, 474, 137);
        lettuce lettuce13 = new lettuce();
        addObject(lettuce13, 271, 100);
        Snake snake = new Snake();
        addObject(snake, 308, 216);
        Snake snake2 = new Snake();
        addObject(snake2, 283, 305);
        Snake snake3 = new Snake();
        addObject(snake3, 251, 378);
    }
}