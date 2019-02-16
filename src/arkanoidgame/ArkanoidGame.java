/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arkanoidgame;


/**
 *Arkanoid game
 * @author Jozef
 */
public class ArkanoidGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializes playing area
        Area area=new Area();
        
        // fill playing area with blocks
        area.fillBlocks();
        //sets speed of ball from 250 to 3000 (lower is faster)
        area.setSpeed(260);        

        //main loop - Game will continue until all of the blocks will be destroyed
        while (!(area.blockPosition.size()==area.getNumberOfremovedBlocks()))
        {
             area.GameRun();
             
        }
       

       

        
        













    }

}
