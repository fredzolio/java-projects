import java.util.ArrayList;

public class Lote {
    
    private ArrayList<Produto> produtos;

    public Lote(){
        produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
