import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    int score = 0;
    GreenfootImage boardImage;
    int width;
    int height;
    GreenWorld myWorld;
    
    public void addedToWorld(World w){
        myWorld = (GreenWorld)w;
        width = myWorld.getWidth();
        height = 60;
        boardImage = new GreenfootImage(width, height);
        boardImage.setColor(Color.BLACK);
        boardImage.fillRect(0,0,width,height);
        setImage(boardImage);
    }
    
    public int getHeight(){
        return height;
    }
    
    public void addScore(int amount){
        score += amount;
    }
}
