public class Vaca {
    private String nome;
    private String corPelo;
    private double consumo;

    public Vaca(){
        nome = "";
        corPelo = "";
        consumo = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void produzLeite(){
        System.out.println("Produzindo leite...");
    }
    
}
