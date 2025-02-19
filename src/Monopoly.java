import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
        
        Board b= new Board();
        Player p= new Player("1.silly", 1000);
        Player o= new Player("2.Bob", 1000);
        Player r= new Player("3.Sky", 1000);
        Player s= new Player("4.Sam", 1000);
        Display.players.add(p);
        Display.players.add(o);
        Display.players.add(r);
        Display.players.add(s);
        
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
        
        while(true)
        {
            if(p.j==true)
            {
                String[] opt= {"Pay", "Dont"};
                int choice=Display.choice("choice","Do you wanna pay to get out? " , opt);
                if(choice==0)
                {
                    p.j=true;
                    p.money-=50;
                }
            }
           if(p.j==false){
            p.roll();
            p.buy();}
            System.out.println("Next turn");
            if(o.j==true)
            {
                String[] opt= {"Pay", "Dont"};
                int choice=Display.choice("choice","Do you wanna pay to get out? " , opt);
                if(choice==0)
                {
                    o.j=true;
                    o.money-=50;
                }
            }
            if(o.j==false)
            {
            o.roll();
            o.buy();
            }
            System.out.println("Next turn");
            if(r.j==true)
            {
                String[] opt= {"Pay", "Dont"};
                int choice=Display.choice("choice","Do you wanna pay to get out? " , opt);
                if(choice==0)
                {
                    r.j=true;
                    r.money-=50;
                }
            }
           if(r.j==false)
            {
            r.roll();
            r.buy();
            }
            System.out.println("Next turn");
            if(s.j==true)
            {
                String[] opt= {"Pay", "Dont"};
                int choice=Display.choice("choice","Do you wanna pay to get out? " , opt);
                if(choice==0)
                {
                    s.j=true;
                    s.money-=50;
                }
            }
            if(s.j==false)
            {
            s.roll();
            s.buy();
            }
            
        }
       
    }
}
