public class Carta {
    private String naipe;
    private int valor;

    public Carta(){
        this.naipe = "";
        this.valor = 0;
    }

    public String getNaipe() {
        return this.naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}