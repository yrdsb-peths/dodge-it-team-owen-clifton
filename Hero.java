import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    public Hero(){
        setImage("images/man.png");
    }
    
    public void act()
    {
        moveWithKeys();
        checkBananaCollision();
    }
    
    public void moveWithKeys() {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4); // move up
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4); // move down
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 4, getY()); // move left
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 4, getY()); // move right
        }
    }
    boolean atTop = true;
    
    public void checkBananaCollision() {
        if (isTouching(Banana.class)){
            getWorld().addObject(new Skull(), getX(), getY()); // add Skull
            getWorld().removeObject(this); // remove Hero
            Greenfoot.stop(); // stop the game
            if(Greenfoot.mouseClicked(null))
            {
                atTop = !atTop;
            }
            if(atTop)
            {
                setLocation(100, 100);
            }
            else
            {
                setLocation(100,300);
            }
        }
    }

}
