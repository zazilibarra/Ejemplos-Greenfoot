import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Jugado extends Actor
{
    private boolean disparando;
    //private Disparo disparo;
    
    public Jugado()
    {
        disparando = false;
        //disparo = new Disparo();
    }
    
    @Override
    public void act() 
    {
        //Si presiona la flecha derecha
        if(Greenfoot.isKeyDown("right"))
        {
            //Mueve a la derecha
            this.setLocation(this.getX() + 7, this.getY());
        }
        //Si presiona la flecha izquierda
        if(Greenfoot.isKeyDown("left"))
        {
            //Mueve a la derecha
            this.setLocation(this.getX() - 7, this.getY());
        }
        //Si presiona barra espaciadora
        if(Greenfoot.isKeyDown("space") && !disparando)
        {
            disparando = true;
            World mundo = this.getWorld();
            mundo.addObject(new Disparo(), this.getX(), this.getY());
        }
        //disparando = disparo.ban();
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty())
        {
            disparando = false;
        }
    }    
}
