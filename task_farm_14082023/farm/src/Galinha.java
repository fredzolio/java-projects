public class Galinha {
    private String nome;
    private String corPena;
    private double consumo;

    public Galinha(){
        nome = "";
        corPena = "";
        consumo = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void botarOvo(){
        System.out.println("Botando ovo...");
    }

}
