import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Disparo extends Actor
{
    @Override
    public void act() 
    {
            this.setLocation(this.getX(), this.getY() - 1);
            if(this.isTouching(Pelota.class))
            {
                this.removeTouching(Pelota.class);
            }
            else if(this.getY() == 0)
            {
                World mundo = this.getWorld();
                mundo.removeObject(this);
            }
            
    }    
    
    public boolean ban()
    {
        return false;
    }
}
