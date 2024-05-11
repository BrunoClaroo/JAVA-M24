import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe vai representar um placar no jogo BeeWorld.
 * 
 * @author Bruno Claro 
 * @version 11/05/2024
 */
public class Placar extends Actor
{
    //Fields ou campot ou variaveis de instancia 
    private String texto;
    private int tamanhoTexto;
    private Color corFonte; 
    //Contructor
    public Placar (){
        texto= "Score: 0";
        tamanhoTexto = 20;
        corFonte = Color.BLUE;
    }
    //Getters (acessadores de campos) e Setter (modificadores de campos)
    public String getTexto(){
        return texto;
    }
    public void setTexto(String value){
        texto = value;
    }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
