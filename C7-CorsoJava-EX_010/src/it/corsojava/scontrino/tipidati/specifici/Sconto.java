package it.corsojava.scontrino.tipidati.specifici;

import it.corsojava.scontrino.tipidati.base.Percentuale;

public class Sconto extends Percentuale{

    public static  final double MIN_VALUE=0;

    public Sconto(double percentualeSconto){
        super(percentualeSconto);
    }

    @Override
    public void setValue(double value) {
        super.setValue(value);
        if(this.getValue()<MIN_VALUE){
            this.setValue(0);
            this.valid=false;
        }
    }
}

