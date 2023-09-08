import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemDeProduto> armazem = new ArrayList<>();
    
    public Estoque(){
        armazem.add(new ItemDeProduto(1, "Detergente ABC", 1.00, 5));
        armazem.add(new ItemDeProduto(2, "Sabao em po OMO", 6.50, 15));
        armazem.add(new ItemDeProduto(3, "Shampoo Beleza Facial", 12.00, 8));
        armazem.add(new ItemDeProduto(4, "Creme Dental Colgate", 3.50, 12));
        armazem.add(new ItemDeProduto(5, "Sabonete Nivea", 1.80, 24));
        armazem.add(new ItemDeProduto(6, "Biscoito Maizena", 2.00, 4));
        armazem.add(new ItemDeProduto(7, "Leite Desnatado Parmalat", 3.00, 18));
        armazem.add(new ItemDeProduto(8, "Leite Condensado Piracanjuba", 3.60, 36));
    }

    public ItemDeProduto BuscarItemDeProduto(int cod){
        ItemDeProduto item = new ItemDeProduto();
        for (ItemDeProduto itemDeProduto : armazem) {
            if(itemDeProduto.getProd().getCodigo() == cod){
                item = itemDeProduto;
            }
        }
        return item;
    }

    public boolean RemoverItemDeProduto(int cod, int quant_a_remover){
        for (int i = 0; i < armazem.size(); i++) {
            if(armazem.get(i).getProd().getCodigo() == cod){
                int diff = armazem.get(i).getQuantidade();
                if(!(quant_a_remover > diff)){
                    armazem.get(i).setQuantidade(diff - quant_a_remover);
                    return true;
                }else{
                    System.out.println("\nERRO -> A quantidade a ser comprada excede a quantidade existente em estoque! <- ERRO\n");
                    return false;
                }
            }
        }
        return false;
    }
}
