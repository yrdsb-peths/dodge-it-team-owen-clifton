import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Spider extends Actor
{
    public Spider(){
        setImage("images/spider.png");
    }
    
    public void act()
    {
        move(-5);
        
        if(getX() <= 0){
            resetSpider();   
        }
        
        if(isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetSpider(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 300);
        }else{
            setLocation(600, 100);
        }
    }
}
