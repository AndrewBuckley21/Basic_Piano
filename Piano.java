import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Piano extends World
{
    Key key1 = new Key( "g", "3a.wav" );
    Black blackKey = new Black( "q", "3c#.wav" );
    private String whiteKeys[] = { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };//keys that play a key when pressed
    private String whiteNotes[] = { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };//the sound that is played when the associated key is pressed
    private String blackKeys[] = { "q", "w", " ", "e", "r", "t", " ", "u", "i", " ", "o" };//blank elements indicate a spot where a black key should not be placed
    private String blackNotes[] = { "3c#", "3d#", " ", "3f#", "3g#", "3a#", " ", "4c#", "4d#", " ", "4f#" };
    int i = 0;
    
    public Piano() 
    {
        super(800, 340, 1);
        create();
    }
    
    public void create()
    {
        while ( i < whiteKeys.length )//places the white keys
        {   addObject( new Key( whiteKeys[ i ], whiteNotes[ i ] + ".wav" ), i * key1.getImage().getWidth() + 54 , ( key1.getImage().getHeight() / 2 ) );
            i++;
        }
        i = 0;
        int k = 1;
        while ( i < blackKeys.length )//places the black keys
        {
            if ( !(blackKeys[ i ].equals( " " ) ) )//skips a black key spot if the array is blank at that element 
            {
                addObject( new Black( blackKeys[ i ], blackNotes[ i ] + ".wav" ), ( k *key1.getImage().getWidth() ) + 23, ( blackKey.getImage().getHeight() / 2 ) );//places a black key
            }
            i++;
            k++;
        }
    }
}
