import java.util.ArrayList;

public class Venda {
    private double subtotal = 0;
    private ArrayList<ItemDeProduto> carrinho = new ArrayList<>();
    Estoque estoque = new Estoque();

    public void AdicionarAoCarrinho(int cod, int quant){
        if(estoque.RemoverItemDeProduto(cod, quant)){
            carrinho.add(estoque.BuscarItemDeProduto(cod));
            subtotal = subtotal + (estoque.BuscarItemDeProduto(cod).getProd().getPreco() * quant);
        }
    }

    public ItemDeProduto ConsultarProduto(int cod){
        return estoque.BuscarItemDeProduto(cod);
    }


    public double getSubtotal() {
        return this.subtotal;
    }
}
