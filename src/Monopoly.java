import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
        
        Board b= new Board();
        Player p= new Player("silly", 1000);
        Player o= new Player("Bob", 1000);
        Player r= new Player("Sky", 1000);
        Player s= new Player("Sam", 1000);
        Display.players.add(p);
        Display.players.add(o);
        Display.players.add(r);
        Display.players.add(s);
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
