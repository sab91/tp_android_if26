/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sabri
 */
public class Cursus {
    private ArrayList<Module> profil;
    
    public Cursus() {
        this.profil = new ArrayList<>();
    }
    
    public void ajoute(Module m) {
        this.profil.add(m);
    }
    
    public void affiche1() {
        Iterator<Module> i = this.profil.iterator();
        System.out.println("Ma liste : ");
        while (i.hasNext()) {
            Module m = i.next();
            m.affiche();
        }
    }
}

