import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenWorld extends World
{
    String[] textMap = {
        "****.******.***",
        "...............",
        "*.**.*.********",
        "*.*...........*",
        "*.*.*.*.*.*.*.*",
        "*.*.*P*.*.*.*.*",
        "*.*...........*",
        "*.*.**.*.****.*",
        ".......*.......",
        "****.******.***"
    };
    Scoreboard sb;
    /**
     * Constructor for objects of class GreenWorld.
     * 
     */
    public GreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.sb = new Scoreboard();
        prepare();
    }
    
    public GreenWorld(int height, Scoreboard sb){
        super(600, height, 1);
        this.sb = sb;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage bgImage = new GreenfootImage(1,1);
        bgImage.setColor(Color.GREEN);
        bgImage.drawRect(0, 0, 1, 1);
        setBackground(bgImage);
        int sbHeight = sb.getHeight();
        int sbY = 400 + sbHeight/2;
        addObject(sb, getWidth()/2,sbY);
        drawMap();
        
    }
    
    public void addScore(int amount){
        sb.addScore(amount);
    }
    
    private void drawMap(){
        for(int i = 0; i < textMap.length;i++){
            String mapLine = textMap[i];
            for(int j = 0; j < mapLine.length(); j++){
                char mapChar = mapLine.charAt(j);
                int y = i * 40 + 20;
                int x = j * 40 + 20;
                switch(mapChar){
                    case '*':
                        addObject(new Obstacle(), x, y);
                        break;
                    case '.':
                        addObject(new Target(), x, y);
                        break;
                    case 'P':
                        addObject(new Player(), x, y);
                    default:
                        break;
                }
            }
        }
    }
}
