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
        int i=1;//change to true later and remove i
        while(i<=15)
        {
            if(p.j==false)
            {
            p.roll();
            p.buy();
            }
           
            System.out.println("Next turn");
            if(o.j==false)
            {
            o.roll();
            o.buy();
            }
            System.out.println("Next turn");
           if(r.j==false)
            {
            r.roll();
            r.buy();
            }
            System.out.println("Next turn");
            if(s.j==false)
            {
            s.roll();
            s.buy();
            }
            i++;
        }
       
    }
}
