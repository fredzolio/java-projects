public class Relogio {
    
    private Contador hora;
    private Contador minuto;
    private boolean formato;

    public Relogio(int lim){
        this.hora = new Contador(0, lim);
        this.minuto = new Contador(0, 59);
        this.formato = false;
    }

    public Contador getHora() {
        return this.hora;
    }

    public void setHora(Contador hora) {
        this.hora = hora;
    }

    public Contador getMinuto() {
        return this.minuto;
    }

    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }

    public boolean getFormato() {
        return this.formato;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public void ticTac(){
        minuto.contar();
        if(this.minuto.getValor() == 0){
            this.hora.contar();
        }
    }
}
