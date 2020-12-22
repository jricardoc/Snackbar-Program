package main;

import java.util.ArrayList;

public class CompraSalgado {
    public static final float taxaEntrega = 5.0f;
    ArrayList <Salgado> salgados = new ArrayList <Salgado>();

    public CompraSalgado() {
        this.salgados = salgados;
    }
    
    @Override
     public String toString(){
        return salgados.toString();
    }

    void comprarSalgado(Pastel pastel) {
        salgados.add(pastel);
    }

    void comprarSalgado(Esfirra esfirra) {
        salgados.add(esfirra);
    }

    float getPrecoFinal(Boolean delivery) {
        float precoFinal = 0;
        for (int i = 0; i < salgados.size(); i++) {
            precoFinal += salgados.get(i).getPrecoUnitario();
        }
        
        if (delivery == true) {
            precoFinal += taxaEntrega;
        }
        
                    
        //return precoFinal+precoFinal + this.delivery; 
        return precoFinal;
    }

}
