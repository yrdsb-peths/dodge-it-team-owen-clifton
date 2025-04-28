import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
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
    
    public void checkBananaCollision() {
    if (isTouching(Banana.class)){
        getWorld().addObject(new Skull(), getX(), getY()); // add Skull
        getWorld().removeObject(this); // remove Hero
        Greenfoot.stop(); // stop the game
    }
}

}
