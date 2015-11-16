/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayan4858
 */
public class Dalek {

    private int row;
    private int col;
    private boolean hasCrashed;

    /**
     *
     * @aparam startRow
     * @param startCol
     */
    public Dalek(int startRow, int startCol) {
        hasCrashed = false;
        row = startRow;
        col = startCol;
    }

    /**
     * Move towards the doctor
     *
     * @param doc
     */
    public void moveTowards(Doctor doc) {
        //gets the row and col of the doc
        int docrow = doc.getRow();
        int doccol = doc.getCol();
        
        //if the dalek hasnt crahed move it depending on where the doc is
        if (hasCrashed == false) {
       
            if (docrow > this.row) {
                this.row++;
            }
            if (docrow < this.row) {
                this.row--;
            }
            
            if (doccol > this.col) {
                this.col++;
            }
            if (doccol < this.col) {
                this.col--;
            }
        }
    }
    
    /**
     * 
     * @return if the has crashed
     */
    public boolean hasCrashed(){
        return hasCrashed;
    }

    
    /**
     *declares hascrashed as true when a crash takes place
     */
    public void crash() {
        hasCrashed = true;
    }

    /**
     * Gets the row of the dalek
     *
     * @return
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Gets colum of the dalek
     *
     * @return
     */
    public int getCol() {
        return this.col;
    }
}
