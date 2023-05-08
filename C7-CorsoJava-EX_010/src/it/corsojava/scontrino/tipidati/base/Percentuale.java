package it.corsojava.scontrino.tipidati.base;

public class Percentuale implements ValoreCalcolabile{

    public static final double MAX_VALUE=100.0;
    public static final double MIN_VALUE=-100.0;

    private double value;
    protected boolean valid = false;
        
    public Percentuale(double value){
        setValue(value);
    }
    
    public double getValue(){
        return this.value;
    }
     
    public void setValue(double value){
        if(value>=Percentuale.MIN_VALUE && value<=Percentuale.MAX_VALUE){
            this.value=value;
            this.valid=true;
        }else{
            this.value=0;
            this.valid=false;
        }
    } 
    
    public boolean isValid(){
        return this.valid;
    }

    public double calcolaValore(double valorebase){
        if(this.isValid())
            return valorebase / 100.0 * this.value;
        else return 0.0;
    }

}


