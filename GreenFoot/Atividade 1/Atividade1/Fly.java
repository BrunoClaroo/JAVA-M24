import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Bruno Claro 
 * @version 20/04/24
 */
public class Fly extends Actor
{
    /**
     * método act é executado sempre que apertamos o botao act ou
     * ficará em execução quando apertarmos o botão run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (isAtEdge()){
            turn(180);
        }
        
    }
}
