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
        return super.toString() + ", " + this.CONorm;
    }
   
    public void toon(){
        System.out.println("De CONorm voor deze stookketel is: " + this.CONorm);       
    }
    
    @Override 
    public boolean equals (Object o){
        if (!(o instanceof StookKetel)){
            return false;
        }
        StookKetel stookKetel = (StookKetel)o;
        return CONorm == stookKetel.CONorm;
    }

    @Override
    public double berekenVervuiling() {
        return (double) (CONorm * 100);
    }
    
}
