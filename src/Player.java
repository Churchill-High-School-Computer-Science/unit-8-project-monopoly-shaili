
import java.util.ArrayList;

public class Player {
    String name;
    int money, locate;
    ArrayList<Property> pp= new ArrayList<Property>();
    int dice;

    public Player(String n, int mon)
    {
        name=n;
        money=mon;
        locate=0;
    }
    public void roll()
    {
        dice= (int)(Math.random()*6+1)+(int)(Math.random()*6+1);
        locate+=dice;
    }
    //TODO FIX
    public String getName(){
        return name;
    }

    ///TODO FIX
    public int getMoney(){
        return money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return pp;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return locate;
    }
}
