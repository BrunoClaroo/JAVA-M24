import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Bruno Claro 
 * @version 20/04/24
 */
public class Bee extends Actor
{
    /**
     * Método que será executado quando apertado o botão act ou run. 
     * 
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // se teclar para direita vira 10º
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        // se tclar para direita vira 10º
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
    }
    /**
     * Método que verifica se está na direita do mundo 
     */
    public boolean isNaDireita(){
        if(getX() > getWorld(). getWidth()-10) {
            return true;
        }
        return false;
    }
    
    
}
