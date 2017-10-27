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
public class Module1 extends Entite {
    private String parcours;
    
    
    public Module1() {
        super();
        this.parcours = "FCBR";
  
    }

    public Module1(String parcours, String sigle, String categorie, int credit) {
        super(sigle, categorie, credit);
        this.parcours = parcours;
    }

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }

    @Override
    public String toString() {
        return "Module1{" + super.toString() + "parcours=" + parcours + '}';
    }

    
    
    public void affiche() {
        System.out.println(this.toString());
    }
}
