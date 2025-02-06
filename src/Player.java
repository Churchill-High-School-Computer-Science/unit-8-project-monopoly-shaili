
import java.util.ArrayList;
import java.util.Properties;

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
        if(locate>=40)
        {

            locate%=40;
        }
        Display.boardPanel.repaint();
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
    public Integer buy()
    {
        String[] option ={"Buy"," No"};
        int choice  = Display.choice(name, " Do you wanna buy" +Board.propertiesMap.get(locate).getName()+"for $" +Board.propertiesMap.get(locate).getCost()+"?", option);
        if(choice==0)
        {
            int pmon= Board.propertiesMap.get(locate).getCost();
            //give money, get card move.
           if( money>=pmon)
           {
            money= 
           
        }
        
    }
    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return locate;
    }
}
