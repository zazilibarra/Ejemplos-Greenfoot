import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Pelota extends Actor
{
    private int incrX;
    private int incrY;
    public Pelota()
    {
        incrX = 10;
        incrY = 10;
    }
    
    @Override
    public void act() 
    {
        //Consulta las coordenadas actuales heredadas del actor
        int posX = this.getX();
        int posY = this.getY();
        //Calculamos nuevas coordenadas
        int nuevoX = posX + incrX;
        int nuevoY = posY + incrY;
        
        World mundo = this.getWorld();
        if(nuevoX > mundo.getWidth()) 
        {
            incrX = -incrX;
        }
        if(nuevoY > mundo.getHeight())
        {
            incrY = -incrY;
        }
        if(nuevoY < 0)
        {
            incrY = -incrY;
        }
        if(nuevoX < 0) 
        {
            incrX = -incrX;
        }
        //cambiamos de posiscion a la pelota
        this.setLocation(nuevoX, nuevoY);
        
    }    
}
