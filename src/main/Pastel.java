package main;

import java.util.Arrays;

public class Pastel extends Salgado {

    private static final String[] pasteis = new String[]{"Carne", "Pizza", "Queijo"};
    private final String saborPastel;
    private int posPastel;

    public Pastel(String saborPastel, int posPastel, String nome, float precoBase, char tamanho) {
        super("pastel", 4.0f, tamanho);
        this.saborPastel = pasteis[posPastel];
        //this.posPastel = posPastel;
    }

    Pastel(char tamanho, int sabor) {
         super("pastel", 4.0f, tamanho);
        this.saborPastel = pasteis[posPastel];
    }

    @Override
    public float getPrecoUnitario() {
        switch (tamanho){
            case 'P':
                return precoBase;
            case 'M':
                return precoBase += 2.0f;
            case 'G':
                return precoBase += 4.0f;
            default:
                break;
        }
        return precoBase;
    }
    
    @Override
    public String toString(){
        String ret = "";
        ret = ret.concat(this.nome).concat(", ").concat(Float.toString(this.precoBase)).concat(", ").concat(Integer.toString(this.tamanho).concat(", ").concat(saborPastel));
        return ret;
    }
    
}  
