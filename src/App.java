import javax.swing.JFrame;



public class App {
    public static void main(String[] args) throws Exception {
       
        int rowCount =21;
        int columnCount = 19;
        int tileSize= 32;
        int boardWidth= columnCount *tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");

        //frame.setVisible(true); // sets the frame to visible
        frame.setSize(boardWidth, boardHeight); // sets the size
        frame.setLocationRelativeTo(null); // sets the location
        frame.setResizable(false); // not resizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes on "X" button

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);


    }
}
