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
public class Vrachtwagen extends Voertuig {
    private float maxLading  = 10000F;
    
    public Vrachtwagen(){
        super();
    }
    public Vrachtwagen(float maxLading){
        super();
        setMaxLading(maxLading);
    }
    public Vrachtwagen(String polishouder, String nummerplaat, int pk, float kostprijs,
            float gemVerbruik, float maxLading){
        super(polishouder, nummerplaat, pk,kostprijs,gemVerbruik);
        setMaxLading(maxLading);        
    }

    /**
     * @return the maxLading
     */
    public float getMaxLading() {
        return maxLading;
    }

    /**
     * @param maxLading the maxLading to set
     */
    public final void setMaxLading(float maxLading) {
        if (maxLading > 0.0F){
            this.maxLading = maxLading;
        } 
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + getMaxLading();
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("De maximum lading van de vrachtwagen is: " + getMaxLading());
    }
    @Override 
    public boolean equals (Object o){
        if (!(o instanceof Vrachtwagen)){
            return false;
        }
        Vrachtwagen vrachtwagen = (Vrachtwagen)o;
        return getNummerplaat().equals(vrachtwagen.getNummerplaat());
    }

    @Override
    public double getKyotoScore() {
        return (double)(getGemVerbruik()*getPk()/getMaxLading());
    }
}
