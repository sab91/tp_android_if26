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
public class Stage {
    private String sigle;
    private String categorie;
    private int credit;
    private String entreprise;

    public Stage(String sigle, String categorie, int credit, String entreprise) {
        this.sigle = sigle;
        this.categorie = categorie;
        this.credit = credit;
        this.entreprise = entreprise;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    @Override
    public String toString() {
        return "Stage{" + "sigle=" + sigle + ", categorie=" + categorie + ", credit=" + credit + ", entreprise=" + entreprise + '}';
    }
    
    public void affiche() {
        System.out.println(this.toString());
    }
    
    
    
}
