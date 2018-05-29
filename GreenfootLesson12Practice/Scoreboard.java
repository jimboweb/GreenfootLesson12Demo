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
    int height = 60;
    GreenWorld myWorld;
    public Scoreboard(){
        
    }
    
    public void addedToWorld(World w){
        myWorld = (GreenWorld)w;
        width = myWorld.getWidth();
        boardImage = new GreenfootImage(width, height);
        boardImage.setColor(Color.BLACK);
        boardImage.fillRect(0,0,width,height);
        setImage(boardImage);
    }
    
    public int getHeight(){
        return height;
    }
    
    public void addScore(int amount){
        score+=amount;
    }
    
    public void drawScore(){
        boardImage.setColor(Color.BLACK);
        boardImage.fillRect(0,0,width/2,height);
        boardImage.setColor(Color.RED);
        boardImage.setFont(new Font("Arial", 24));
        boardImage.drawString("Score: " + score, 20, 40);
    }
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        drawScore();
    }    
}
