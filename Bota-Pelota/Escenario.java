import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Escenario extends World
{
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        prepare();
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugado jugado = new Jugado();
        addObject(jugado,295,379);
        Pelota pelota = new Pelota();
        addObject(pelota,44,69);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,297,120);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,526,62);
        jugado.setLocation(273,362);
    }
}
