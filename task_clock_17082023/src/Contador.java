public class Contador {
    private int valor;
    private int limite;

    public Contador(){
        this.valor = 0;
        this.limite = 999;
    }

    public Contador(int valor, int limite){
        this.valor = valor;
        this.limite = limite;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLimite() {
        return this.limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void contar(){
        this.valor++;
        if(valor == limite){
            valor = 0;
        }
    }
}
