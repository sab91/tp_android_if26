/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01_2;

import if26_tp01.*;

/**
 *
 * @author Sabri
 */
public class IF26_tp011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Module1 if26 = new Module1();
        Module1 lo07 = new Module1("LO07", "TM", "TCBR", 12);
        if26.affiche();
        lo07.affiche();
        
        Cursus1 cursus = new Cursus1();
        cursus.ajoute(lo07);
        cursus.ajoute(if26);
        cursus.affiche1();
        
        Stage1 tn05 = new Stage1("GMP","TN05","TC",60);
        tn05.affiche();
        cursus.ajoute(tn05);
    }
    
}
