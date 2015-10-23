
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamonta
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameBoard board = new GameBoard();

        int startdocrow = (int) (Math.random() * 8);
        int startdoccol = (int) (Math.random() * 8);
        Doctor doc = new Doctor(startdocrow, startdoccol);
        

        int d1row = (int) (Math.random() * 8);
        int d1col = (int) (Math.random() * 8);
        Dalek d1 = new Dalek(d1row, d1col);

        int d2row = (int) (Math.random() * 8);
        int d2col = (int) (Math.random() * 8);
        Dalek d2 = new Dalek(d2row, d2row);

        int d3row = (int) (Math.random() * 8);
        int d3col = (int) (Math.random() * 8);
        Dalek d3 = new Dalek(d3row, d3col);



        
        board.putPiece(d1.getRow(), d1.getCol(), Color.yellow);
        board.putPiece(d2.getRow(), d2.getCol(), Color.yellow);
        board.putPiece(d3.getRow(), d3.getCol(), Color.yellow);
        board.printBoard();

        while (true) {
            
            //look for a click
            Coordinate c = board.getClick();
            //store the x and y coordinates of the click into variable
            int docrow = c.getRow();
            int doccol = c.getCol();
            //remove the postion the doctor was at 
            board.removePiece(doc.getRow(), doc.getCol());
            //send the row and colum of the click into the doctor move method 
            doc.move(docrow, doccol);
            
            //used the variabls with the click coordinates to palce doctor there  
            board.putPiece(doc.getRow(), doc.getCol(), Color.green);
        }
    }
}
