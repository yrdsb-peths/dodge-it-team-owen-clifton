import greenfoot.*;

public class MyWorld extends World {
    private int frame = 0;
    
    public MyWorld() 
    {
        super(600, 400, 1);
        
        //Set initial background();
        updateBackground();
        
        getBackground().setColor(Color.GREEN);
        getBackground().fill();
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana,600, 100);
        
        Spider spider = new Spider();
        addObject(spider, 600, 300);
    }
    public void act(){
        frame++;
        if(frame% 1 ==0) { //Change color every 60 frames
            updateBackground();
        }
    }
    
    private void updateBackground() {
        //Cycle through colors
        int index = (frame/60) % 4;
        Color bgColor;
        
        if(index == 0) bgColor = Color.RED;
        else if (index == 1) bgColor = Color.GREEN;
        else if(index == 2) bgColor = Color.BLUE;
        else bgColor = Color.ORANGE;
        
        getBackground().setColor(bgColor);
        getBackground().fill();
    }
}
