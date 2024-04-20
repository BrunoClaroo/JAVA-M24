import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author Bruno Claro   
 * @version 20/04/24
 */
public class BeeWorld extends World
{

    /**
     * Constructor da classe BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,58,54);
        Spider spider = new Spider();
        addObject(spider,512,97);
        Fly fly = new Fly();
        addObject(fly,32,210);
        spider.setLocation(506,83);
        spider.setLocation(569,326);
        fly.setLocation(92,323);
    }
}
