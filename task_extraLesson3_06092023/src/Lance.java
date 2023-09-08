public class Lance {

    private Pessoa p;
    private float valor;

    public Lance(){
        p = new Pessoa();
        valor = 0;
    }

    public Pessoa getP() {
        return p;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
}
