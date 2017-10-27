/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sabri
 */
public class Cursus1 {
    private ArrayList<Entite> profil;
    
    public Cursus1() {
        this.profil = new ArrayList<>();
    }
    
    public void ajoute(Entite m) {
        this.profil.add(m);
    }
    
    public void affiche1() {
        Iterator<Entite> i = this.profil.iterator();
        System.out.println("Ma liste : ");
        while (i.hasNext()) {
            Entite m = i.next();
            m.affiche();
        }
    }
}

