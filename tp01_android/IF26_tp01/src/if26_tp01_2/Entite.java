/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if26_tp01_2;

/**
 *
 * @author sabri
 */
public abstract class Entite {
    private String sigle;
    private String categorie;
    private int credit;

    public Entite() {
        this.sigle = "sigle";
        this.categorie = "cat";
        this.credit = 6;
    }
    
    public Entite(String sigle, String categorie, int credit) {
        this.sigle = sigle;
        this.categorie = categorie;
        this.credit = credit;
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

    @Override
    public String toString() {
        return "Entite{" + "sigle=" + sigle + ", categorie=" + categorie + ", credit=" + credit + '}';
    }
    
    public void affiche() {
        System.out.println(this.toString());
    }
}
