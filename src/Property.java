
import java.awt.Color;

public class Property {

    Color color;
    String name;
    int cost, numhouse;
    Player player;
    int rent;
    //const
    public Property(Color c, String n, int chashing,  String play, int num,int rente)
    {
        color=c;
        name=n;
        cost= chashing;
        player=null;
        numhouse=num;
        rent=rente;
    }
    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return numhouse;
    }

    //TODO fix
    public Player getOwner()
    {
        return player;
    }

    //TODO fix
    public int getCost(){
        return cost;
    }
    //getRent
    public int getRent()
    {
        return rent;
    }
}
