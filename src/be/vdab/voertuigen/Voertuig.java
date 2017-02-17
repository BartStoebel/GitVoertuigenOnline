/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

/**
 *
 * @author Vinnie
 */
public abstract class Voertuig implements Privaat, Milieu{
    private String polishouder;
    private String nummerplaat;
    private int pk;
    private float kostprijs;
    private float gemVerbruik;

    
    public Voertuig(){
        this("onbepaald","onbepaald",0,0.0F,0.0F);
    }
    public Voertuig(String polishouder, String nummerplaat, int pk, float kostprijs,
            float gemVerbruik){
        setGemVerbruik(gemVerbruik);
        setKostprijs(kostprijs);
        setNummerplaat(nummerplaat);
        setPk(pk);
        setPolishouder(polishouder);        
    }

    
    /**
     * @return the polishouder
     */
    public String getPolishouder() {
        return polishouder;
    }

    /**
     * @param polishouder the polishouder to set
     */
    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty()){
            this.polishouder = polishouder;
        } else {
            this.polishouder = "onbepaald";
        }
    }

    /**
     * @return the nummerplaat
     */
    public String getNummerplaat() {
        return nummerplaat;
    }

    /**
     * @param nummerplaat the nummerplaat to set
     */
    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty()){
            this.nummerplaat = nummerplaat;
        } else {
            this.nummerplaat = "onbepaald";
        }
    }

    /**
     * @return the pk
     */
    public int getPk() {
        return pk;
    }

    /**
     * @param pk the pk to set
     */
    public final void setPk(int pk) {
        if (pk > 0){
            this.pk = pk;
        } 
    }

    /**
     * @return the kostprijs
     */
    public float getKostprijs() {
        return kostprijs;
    }

    /**
     * @param kostprijs the kostprijs to set
     */
    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F){
            this.kostprijs = kostprijs;
        } 
    }

    /**
     * @return the gemVerbruik
     */
    public float getGemVerbruik() {
        return gemVerbruik;
    }

    /**
     * @param gemVerbruik the gemVerbruik to set
     */
    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F){
            this.gemVerbruik = gemVerbruik;
        } 
    }
    
    public void toon(){
        System.out.println("De eigenaar is: " + getPolishouder());
        System.out.println("De nummerplaat is: " + getNummerplaat());
        System.out.println("De prijs van het voertuig is: " + getKostprijs());
        System.out.println("Het verbruik bedraagt: " + getGemVerbruik());
        System.out.println("De pks bedragen: " + getPk());
    }
     
    public abstract double getKyotoScore();
    
    @Override
    public String toString(){
        return getPolishouder()+ ", "  + getKostprijs() + ", " + getPk() + ", " 
                 + getGemVerbruik() + ", " + getNummerplaat() ;
    }
    @Override
    public boolean equals (Object o){
        if (!(o instanceof Voertuig)){
            return false;
        }
        Voertuig voertuig = (Voertuig)o;
        return getNummerplaat().equals(voertuig.getNummerplaat());
    }
    @Override
    public void geefPrivateData(){
        System.out.println( getPolishouder()+ ", "  + getNummerplaat() );
    }
    @Override
    public void geefMilieuData(){
        System.out.println( getKostprijs() + ", " + getPk() + ", " 
                 + getGemVerbruik()  );
    }
    
    
    
   
}
