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
public class Module {
    private String sigle;
    private String categorie;
    private String parcours;
    private int credit;
    
    public Module() {
        this.sigle = "IF26";
        this.categorie = "TM";
        this.parcours = "FCBR";
        this.credit = 6;
    }

    public Module(String sigle, String categorie, String parcours, int credit) {
        this.sigle = sigle;
        this.categorie = categorie;
        this.parcours = parcours;
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

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Module{" + "sigle=" + sigle + ", categorie=" + categorie + ", parcours=" + parcours + ", credit=" + credit + '}';
    }
    
    public void affiche() {
        System.out.println(this.toString());
    }
}
