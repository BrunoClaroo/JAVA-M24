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
        verificarPosicao();
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
   /**
     * Método que verifica se está na Esquerda do mundo 
     */
    public boolean isNaEsquerda(){
        return(getX() < 10 );
    }
    /**
     *  Método que verifica se está na base do mundo 
     */
    public boolean isNaBase(){
        return(getY() > getWorld() . getHeight() -10 );
    }
     /**
     * Método que verifica se está no topo do mundo 
     */
    public boolean isNoTopo(){
        return(getY() < 10 );
    }
    /**
     * método que verifica se a abelha está nos cantos e reposiciona ela 
     */
    public void verificarPosicao(){
        //verificando se está na direita 
        if(isNaDireita() ){
            setLocation(10, getY());
        }
        //verificando se está na esquerda 
         if(isNaEsquerda() ){
            setLocation(790, getY());
        }
        //verificando se está no Topo 
        //verificando se está na Base
    }
}
