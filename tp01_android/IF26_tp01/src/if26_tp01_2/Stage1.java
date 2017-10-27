/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01_2;


/**
 *
 * @author Sabri
 */
public class Stage1 extends Entite {
    private String entreprise;

    public Stage1() {
        super();
        this.entreprise = "entreprise";
    }


    public Stage1(String entreprise, String sigle, String categorie, int credit) {
        super(sigle, categorie, credit);
        this.entreprise = entreprise;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "Stage1{" + "entreprise=" + entreprise + '}';
    }
    
    
    
    
    public void affiche() {
        System.out.println(this.toString());
    }
    
    
    
}
