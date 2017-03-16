import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Escenario extends World
{
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
    }
    
    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click en el mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + " y = " + raton.getY());
            añadePelota();
        }
    }
    
    public void añadePelota()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        World mundo = getWorld();       
        if(Greenfoot.mouseClicked(null))
        {
            mundo.addObject(new Pelota(), mouse.getX(), mouse.getY());
        }
    }
}
