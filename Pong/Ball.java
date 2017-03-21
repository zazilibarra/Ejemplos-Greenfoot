import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball  extends Actor
{
    private int incrX;
    private int incrY;
    private int puntos1;
    private int puntos2;
    private int ban = 1;
    
    public Ball()
    {
        incrX = 2;
        incrY = 2;
        if(Greenfoot.getRandomNumber(2) > 0){
                 incrX = -incrX;
                 incrY = -incrY;
        }
        else if(Greenfoot.getRandomNumber(2) == 1){
             incrX = incrX;
             incrY = -incrY;
        }
        puntos1 = 0;
        puntos2 = 0;
    }
    
    @Override
    public void act() 
    {
        Greenfoot.delay(1);
        //Consulta las coordenadas actuales heredadas del actor
        int posX = this.getX();
        int posY = this.getY();
        //Calculamos nuevas coordenadas
        int nuevoX = posX + incrX;
        int nuevoY = posY + incrY;
        
        this.setLocation(nuevoX, nuevoY);
        
        World mundo = this.getWorld();
        
        mundo.showText("Jugador 2: " + puntos2, 60, 490);
        mundo.showText("Jugador 1: " + puntos1, 60, 10);
        
        //revota en las paredes
        if(ban == 0) 
        {
            incrX = 0;
            incrY = 0;
        }
        if(nuevoX == mundo.getWidth()) 
        {
            incrX = -incrX;
        }
        if(nuevoX < 0 ) 
        {
             incrX = -incrX;
        }
        //aumenta puntos a jugadores
        if(nuevoY > 480 )
        {
            Greenfoot.delay(1);
            puntos1 ++;
            this.setLocation(350, 250); 
        }
        if(nuevoY < 20)
        {
            Greenfoot.delay(1);
            puntos2 ++;
            this.setLocation(350, 250);
        }
        
         //si toca la barra
        if(this.isTouching(Paddle.class))
        {
            incrY = -incrY;
            if(Greenfoot.getRandomNumber(2) > 0){
                 incrX = -incrX;
                 incrY = -incrY;
            }
            else {
                 incrX = incrX;
                 incrY = -incrY;
            }
        }
        
        if(puntos1 == 5){
            mundo.showText("Ganador Jugador 1" , 350, 300);
            puntos1 = 0;
            puntos2 = 0;
            ban = 0;
        }
        if(puntos2 == 5){
            mundo.showText("Ganador Jugador 2 " , 350, 300);
            puntos1 = 0;
            puntos2 = 0;
            ban = 0;
        }
    }    
}


