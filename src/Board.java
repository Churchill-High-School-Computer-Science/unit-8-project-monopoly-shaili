import java.awt.Color;
class Board
{
   Property[][] properties= new Property[10][10];
    public Board(){
        Display.properties= properties;
        properties[0][0]= new Property(new Color(0,255,0), "Go" , 0);
        properties[0][1]= new Property(new Color(125,51,0), "Mediterranian" , 60);
        properties[0][2]= new Property(new Color(0,255,0), n:"Community Chest" , chashing:0);
        properties[0][3]= new Property(new Color(102,51,0), n:"Baltic Avenue" , chashing:50);
        properties[0][1]= new Property(new Color(0,255,0), n:"Mediterranian" , chashing:60);
        properties[0][1]= new Property(new Color(0,255,0), n:"Mediterranian" , chashing:60);
        properties[0][1]= new Property(new Color(0,255,0), n:"Mediterranian" , chashing:60);

    }

}