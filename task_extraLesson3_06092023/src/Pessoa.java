public class Pessoa {
    private String nome;
    private String contato;

    public Pessoa(String nome, String contato){
        this.nome = nome;
        this.contato = contato;
    }

    public Pessoa(){
        this.nome = "";
        this.contato = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }
    
}
