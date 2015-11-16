/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayan4858
 */
public class Doctor {
   private int row;
   private int col;
   /**
    * 
    * @param startRow
    * @param startCol 
    */
   public Doctor(int startRow, int startCol){
       row = startRow;
       col = startCol;
   }
   
   /**
    * 
    * @param row 
    * @param col 
    */
   public void move(int row, int col){
       //if the click row and colum  is within 1 row and colum of the doctor move him to the that tile, 
       //otherwise random a spot on the grid
       if ( row > this.row +1 || col > this.col +1 || row < this.row-1 || col < this.col-1) {
            this.row = (int) (Math.random() * 8);   
            this.col = (int) (Math.random() * 8);
       }else {
           this.row = row;
           this.col = col;
       }
       
   }
   
   /**
    * Gets row of doctor
    * @return Returns the row of the Doc
    */
   public int getRow(){
       return this.row;
   }
   
   /**
    * Gets the Colum of the Doc 
    * @return Returns the colum of the Doc
    */
   public int getCol(){
       return this.col;
   }
   
   
   
}
