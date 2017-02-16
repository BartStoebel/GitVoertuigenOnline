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
public class StookKetel implements Vervuiler{
    private float CONorm;
    
    public StookKetel(float CONorm){
        this.CONorm = CONorm;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + this.getCONorm();
    }
   
    public void toon(){
        System.out.println("De CONorm voor deze stookketel is: " + this.getCONorm());       
    }
    
    @Override 
    public boolean equals (Object o){
        if (!(o instanceof StookKetel)){
            return false;
        }
        StookKetel stookKetel = (StookKetel)o;
        return getCONorm() == stookKetel.getCONorm();
    }

    @Override
    public double berekenVervuiling() {
        return (double) (getCONorm() * 100);
    }

    /**
     * @return the CONorm
     */
    public float getCONorm() {
        return CONorm;
    }

    /**
     * @param CONorm the CONorm to set
     */
    public void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }
    
}
