import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Venda venda = new Venda();
        //lamaf;
        Scanner input = new Scanner(System.in);
        String opt = "";
        int cod = 90909090;
        do{
            System.out.println("Digite um codigo para consultar | Digite 0 para encerrar");
            cod = input.nextInt();
            input.nextLine();
            if(venda.ConsultarProduto(cod).getProd() != null && cod != 0){
                System.out.println("Descricao: " + venda.ConsultarProduto(cod).getProd().getDescricao());
                System.out.println("Preco: R$" + venda.ConsultarProduto(cod).getProd().getPreco());
                System.out.println("Deseja adicionar ao carrinho? (S ou N)");
                opt = input.nextLine();
                if(opt.equals("s") || opt.equals("S")){
                    System.out.println("Qual a quantidade que voce deseja adicionar?");
                    int quant = input.nextInt();
                    input.nextLine();
                    venda.AdicionarAoCarrinho(cod, quant);
                    System.out.println("Produto(s) adicionado(s) | Sub-total: R$" + venda.getSubtotal());
                }
            }    
        }while(cod != 0);
        System.out.println("Carrinho fechado | Total a pagar: R$" + venda.getSubtotal());
        input.close();
    }
}
