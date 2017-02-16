/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voertuigen;

/**
 *
 * @author Vinnie
 */
public class VoertuigMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonenWagen voertuig = new PersonenWagen("", "BGN 863", 03, -1.1F,1.2F , 4,5);
        System.out.println(voertuig.toString());
        voertuig.toon();
        Voertuig voertuig2 = new Vrachtwagen(0);
        System.out.println(voertuig.equals(voertuig2));
        voertuig2.toon();
        System.out.println(voertuig2.equals(voertuig));
        System.out.println(voertuig.getKyotoScore());
        System.out.println(voertuig2.getKyotoScore());
        
        
    }
    
}
