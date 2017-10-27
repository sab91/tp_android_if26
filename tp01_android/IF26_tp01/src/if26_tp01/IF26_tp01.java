/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01;

/**
 *
 * @author Sabri
 */
public class IF26_tp01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Module if26 = new Module();
        Module lo07 = new Module("LO07", "TM", "TCBR", 6);
        if26.affiche();
        lo07.affiche();
        
        Cursus cursus = new Cursus();
        cursus.ajoute(lo07);
        cursus.ajoute(if26);
        cursus.affiche1();
        
        Stage tn05 = new Stage("TN05","TC",30,"GMP");
        tn05.affiche();
        //cursus.ajoute(tn05);
    }
    
}
