import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startup extends World
{

    /**
     * Constructor for objects of class Startup.
     * 
     */
    public Startup()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Scoreboard sb = new Scoreboard();
        int sbHeight = sb.getHeight();
        Greenfoot.setWorld(new GreenWorld(400+sbHeight,sb));
    }
}
