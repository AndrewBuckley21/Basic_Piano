import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Black extends Actor
{
    private boolean isDown = false, isDown2 = false;
    private String key;
    private String sound;
    public Black(String keyName, String soundFile)
    {
        key = keyName;//the file name of the key
        sound = soundFile;//the file name of the sound associated with a key
    }

    public void act()
    {
        if ( !isDown && Greenfoot.isKeyDown( key ) ) //plays if the key is pressed on the keyboard
        {
            setImage( "black-key-down.png" );
            isDown = true;
            play();
        }
        if ( !isDown2 &&Greenfoot.mouseClicked( this ) ) //plays if the key is clicked with the mouse
        {
            setImage( "black-key-down.png" );
            isDown2 = true;
            play();
        }
        
        if ( isDown && !Greenfoot.isKeyDown( key ) )//changes the image to the "pressed" version if the corresponding key is pressed
        {
            setImage( "black-key.png" );
            isDown = false;
        }
        if ( isDown2 && !Greenfoot.mouseClicked( this ) )//changes the image to the "pressed" version if the corresponding key is pressed
        {
            setImage( "black-key.png" );
            isDown2 = false;
        }
    }
    
    public void play()
    {
        Greenfoot.playSound( sound );
    }
    
}