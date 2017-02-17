/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.Vervuiler;

/**
 *
 * @author Vinnie
 */
public class PersonenWagen extends Voertuig implements Vervuiler{
    
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;
    
    public PersonenWagen(){
        super();
    }
    public PersonenWagen(int aantalDeuren, int aantalPassagiers){
        this("", "", 0, 0.0F, 0.0F, aantalDeuren, aantalPassagiers);
    }
    public PersonenWagen(String polishouder, String nummerplaat, int pk, float kostprijs,
            float gemVerbruik, int aantalDeuren, int aantalPassagiers){
        super(polishouder, nummerplaat, pk,kostprijs,gemVerbruik);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    /**
     * @return the aantalDeuren
     */
    public int getAantalDeuren() {
        return aantalDeuren;
    }

    /**
     * @param aantalDeuren the aantalDeuren to set
     */
    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0){
            this.aantalDeuren = aantalDeuren;
        } 
    }

    /**
     * @return the aantalPassagiers
     */
    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    /**
     * @param aantalPassagiers the aantalPassagiers to set
     */
    public final void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0){
            this.aantalPassagiers = aantalPassagiers;
        } 
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + getAantalDeuren() + ", " + getAantalPassagiers();
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("Het aantal deuren van deze personenwagen is: " + getAantalDeuren());
        System.out.println("Het aantal personen dat vervoerd mag worden is: " + getAantalPassagiers());        
    }
    @Override 
    public boolean equals (Object o){
        if (!(o instanceof PersonenWagen)){
            return false;
        }
        PersonenWagen personenWagen = (PersonenWagen)o;
        return getNummerplaat().equals(personenWagen.getNummerplaat());
    }

    @Override
    public double getKyotoScore() {
        return (double) (getGemVerbruik()*getPk()/getAantalPassagiers());
    }

    @Override
    public double berekenVervuiling() {
        return (double)(getKyotoScore() * 5);
    }
}
