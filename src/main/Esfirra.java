package main;

import java.util.Arrays;

public class Esfirra extends Salgado {
    
    private static String[] esfirras = new String[]{"Calabresa", "frango", "Vegetariana"};
    private String saborEsfirra;
    private int posEsfirra;

    public Esfirra(String saborEsfirra, int posEsfirra, String nome, float precoBase, char tamanho) {
        super("Esfirra", 2.0f, tamanho);
        this.saborEsfirra = esfirras[posEsfirra];
        //this.posEsfirra = posEsfirra;
    }

    Esfirra(char tamanho, int sabor) {
        super("Esfirra", 2.0f, tamanho);
        this.saborEsfirra = esfirras[posEsfirra];
    }

    @Override
    public float getPrecoUnitario() {
        if (tamanho == 'P'){
            return precoBase;
        } else
            if (tamanho == 'M') {
                return precoBase += 1.0f;
            } else 
                if (tamanho == 'G'){
                    return precoBase += 2.0f;
                } else {
                    return 0;
                }
    }

     @Override
    public String toString(){
        String ret = "";
        ret = ret.concat(this.nome).concat(", ").concat(Float.toString(this.precoBase)).concat(", ").concat(Integer.toString(this.tamanho).concat(", ").concat(saborEsfirra));
        return ret;
    }
    
}
