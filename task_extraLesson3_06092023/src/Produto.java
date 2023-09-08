public class Produto {
    
    private String descricaoProduto;
    private Lance maiorLance;

    public Produto(){
        descricaoProduto = "";
        maiorLance = new Lance();
    }

    public Produto(String descProduto){
        this.descricaoProduto = descProduto;
        maiorLance = new Lance();
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Lance getMaiorLance() {
        return this.maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    public void verificarMaiorLance(Lance lance){
        if (lance.getValor() > maiorLance.getValor()){
            maiorLance = lance;
        }
    }
    
}
