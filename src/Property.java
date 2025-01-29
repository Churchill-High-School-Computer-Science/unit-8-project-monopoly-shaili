
import java.awt.Color;

public class Property {

    Color color;
    String name;
    int cost;

    //const
    public Property(Color c, String n, int chashing)
    {
        color=c;
        name=n;
        cost= chashing;
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
        return 5;
    }

    //TODO fix
    public String getOwner(){
        return "no one";
    }

    //TODO fix
    public int getRent(){
        return 20;
    }
}
