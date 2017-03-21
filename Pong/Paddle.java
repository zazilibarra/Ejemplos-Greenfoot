import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle  extends Actor
{
    @Override
    public void act() 
    {
        if(this.getY() < 200) {
           if(Greenfoot.isKeyDown("a")){
               this.setLocation(this.getX() - 3, this.getY());
           }
           if(Greenfoot.isKeyDown("s")){
               this.setLocation(this.getX() + 3, this.getY());
           }
        }
        else{
            if(Greenfoot.isKeyDown("left")){
               this.setLocation(this.getX() - 3, this.getY());
           }
           if(Greenfoot.isKeyDown("right")){
               this.setLocation(this.getX() + 3, this.getY());
           }
        }
    }    
}
