import java.util.ArrayList;

public class Leilao {
    
    private ArrayList<Lote> lotes;

    public Leilao(){
        lotes = new ArrayList<>();
    }

    public void inserirLote(Lote lote){
        lotes.add(lote);
    }

    public void receberLance(int numLote, String descricaoProduto, Lance lance){
        Lote lote = lotes.get(numLote);
        ArrayList<Produto> prods = lote.getProdutos();
        for(int i = 0; i < prods.size(); i ++){
            if ((prods.get(i).getDescricaoProduto()).equals(descricaoProduto)){
                prods.get(i).verificarMaiorLance(lance);
            }
        }
    }

    public void addProduto(int idLote, String descProd){
        Lote lote = lotes.get(idLote);
        Produto prod = new Produto(descProd);
        lote.inserirProduto(prod);
    }

    public void encerrarLeilao(){
        // TODO : [] encerraLeilao
    }

    public void listarProdutos(){
        for(int i = 0; i < lotes.size(); i++){
            Lote lote = lotes.get(i);
            ArrayList<Produto> prods = lote.getProdutos();
            for(int j = 0; j < prods.size(); j++){
                System.out.println("----Lote " + i + "----");
                System.out.println("Produto: " + prods.get(j).getDescricaoProduto());
                if(prods.get(j).getMaiorLance().getValor() != 0.0){
                    System.out.println("Maior lance: " + prods.get(j).getMaiorLance().getValor());
                    System.out.println("Nome: " + prods.get(j).getMaiorLance().getP().getNome());
                    System.out.println("Contato: " + prods.get(j).getMaiorLance().getP().getContato() + "\n");
                }else{
                    System.out.println("Sem lance\n");
                }
            }
        }
    }
}
