package main;

public abstract class Salgado {
    
    protected String nome;
    protected float precoBase;
    protected char tamanho;
    
    
    public Salgado(String nome, float precoBase, char tamanho){ 
        this.nome = nome;
        this.precoBase = precoBase;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public char getTamanho() {
        return tamanho;
    }
    
    public abstract float getPrecoUnitario();
    
    @Override
    public String toString(){
        String ret = "";
        ret = ret.concat(this.nome).concat(", ").concat(Float.toString(this.precoBase)).concat(", ").concat(Integer.toString(this.tamanho));
        return ret;
    }
}
