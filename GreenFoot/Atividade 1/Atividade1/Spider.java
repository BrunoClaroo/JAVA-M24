import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // verifica se o numero aleatorio de 1 a 100 está menor ou igual a 20 
        if (Greenfoot.getRandomNumber(100)+1 <= 20){
            //gira aleatoriamente de -45 a 45º para rotacionar
          turn(Greenfoot.getRandomNumber(91)-45);
        }
    }
}
