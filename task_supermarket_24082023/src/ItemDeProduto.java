public class ItemDeProduto {
    private Produto prod;
    private int quantidade;

    public ItemDeProduto(){
        this.prod = new Produto();
        this.quantidade = 0;
    }

    public ItemDeProduto(int codigo, String descricao, double preco, int quant){
        this.prod = new Produto(codigo, descricao, preco);
        this.quantidade = quant;
    }


    public Produto getProd() {
        return this.prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
