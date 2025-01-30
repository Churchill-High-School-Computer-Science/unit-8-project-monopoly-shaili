import java.awt.Color;
class Board
{
   Property[][] properties= new Property[11][11];
    public Board(){
        Display.properties= properties;
        properties[0][0]= new Property(new Color(0,255,0), "Go" , 0 ,"None",0);
        properties[0][1]= new Property(new Color(125,51,0), "Mediterranian" , 60,"None",0);
        properties[0][2]= new Property(new Color(0,255,0), "Community Chest" , 0,"None",0);
        properties[0][3]= new Property(new Color(102,51,0), "Baltic Avenue" , 50,"None",0);
        properties[0][4]= new Property(new Color(0,255,0), "Income Tax" , 0,"None",0);
        properties[0][5]= new Property(new Color(125,51,0), "Reading railroad" ,200,"None",0);
        properties[0][6]= new Property(new Color(0,153,204), "Oriental Avenue" , 100, "None",0);
        properties[0][7]= new Property(new Color(0,255,0), "Chance" , 0, "None",0);
        properties[0][8]= new Property(new Color(0,153,204), "Vermont Avenue" , 100, "None",0);
        properties[0][9]= new Property(new Color(102,51,0), "Connectiticut Avenue" , 120,"None",0);
        properties[0][10]= new Property(new Color(0,153,204), "Jail" , 0, "None",0);
        properties[1][10]= new Property(new Color(204,68,204), "St. Charles PLace" , 140,"None",0);
        properties[2][10]= new Property(new Color(204,68,204), "Electric Company" , 150,"None",0);
        properties[3][10]= new Property(new Color(204,68,204), "States Avenue" , 140, "None",0);
        properties[4][10]= new Property(new Color(0,153,204), "Virginia Avenue" , 160, "None",0);
        properties[5][10]= new Property(new Color(204,68,204), "Pennsylvania Railroad" , 200, "None",0);
        properties[6][10]= new Property(new Color(204,68,204), "St.James Place" , 180, "None",0);
        properties[7][10]= new Property(new Color(0,153,204), "Community Chest" , 0, "None",0);
        properties[8][10]= new Property(new Color(204,68,204), "Tennessee Avenue" , 180 ,"None",0);
        properties[9][10]= new Property(new Color(0,153,204), "New York Avenue" , 200, "None",0);
        properties[10][10]= new Property(new Color(0,153,204), "Free Parking" , 0,"None",0);
        properties[10][9]= new Property(new Color(0,153,204), "Kentucky Avenue" , 220, "None",0);
        properties[10][8]= new Property(new Color(0,153,204), "Chance" , 0, "None",0);
        properties[10][7]= new Property(new Color(0,153,204), "Indiana Avenue" , 220, "None",0);
        properties[10][6]= new Property(new Color(0,153,204), "Illinois Avenue" , 0,"None",0);
        properties[10][5]= new Property(new Color(0,153,204), "B&O Railroad" , 0, "None",0);
        properties[10][4]= new Property(new Color(0,153,204), "Atlantic Avenue" , 0, "None",0);
        properties[10][3]= new Property(new Color(0,153,204), "Ventnor Avenue" , 0, "None",0);
        properties[10][2]= new Property(new Color(0,153,204), "Water works" , 150, "None",0);
        properties[10][1]= new Property(new Color(0,153,204), "Marvin Gardens" , 280,"None",0);
        properties[10][0]= new Property(new Color(0,153,204), "Go To Jail" , 0, "None",0);
        properties[9][0]= new Property(new Color(0,153,204), "Pacific Avenue" , 300, "None",0);
        properties[8][0]= new Property(new Color(0,153,204), "North Caroline Avenue" , 300, "None",0);
        properties[7][0]= new Property(new Color(0,153,204), "Community Chest" , 0, "None",0);
        properties[6][0]= new Property(new Color(0,153,204), "Pennsylvania Avenue" , 320, "None",0);
        properties[5][0]= new Property(new Color(0,153,204), "Short Line Railroad" , 200, "None",0);
        properties[4][0]= new Property(new Color(0,153,204), "Chance" , 0, "None",0);
        properties[3][0]= new Property(new Color(0,153,204), "Park Place" , 350, "None",0);
        properties[2][0]= new Property(new Color(0,153,204), "Luxury Tax" , 0, "None",0);
        properties[1][0]= new Property(new Color(0,153,204), "Boardwalk" , 400,"None",0);
    }

}