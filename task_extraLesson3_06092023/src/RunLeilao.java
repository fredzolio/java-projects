import java.util.Scanner;

public class RunLeilao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Leilao leilao = new Leilao();

        do{
            System.out.println("Digite um comando e tecle <ENTER>");
            String key = (input.nextLine()).toLowerCase();

            if(!key.equalsIgnoreCase("Sair")){

                switch (key) {
                    case "addlote":
                        leilao.inserirLote(new Lote());
                        System.out.println("\nNovo lote adicionado com sucesso.\n");
                        break;
                    case "addproduto":
                        System.out.println("Digite o ID do lote do qual quer inserir o produto:");
                        int idLote = input.nextInt();
                        input.nextLine();
                        System.out.println("Digite a descricao do produto:");
                        String nameProd = input.nextLine();
                        try {
                            leilao.addProduto(idLote, nameProd);
                            System.out.println("\nProduto adicionado com sucesso\n");
                        } catch (Exception e) {
                            System.out.println("\nO lote nao existe!\n");
                        }
                        break;
                    case "listarprodutos":
                        leilao.listarProdutos();
                        break;
                    case "receberlance":
                        System.out.println("Digite o ID do lote do qual quer leiloar:");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Digite o nome do produto do qual quer receber o lance:");
                        String descProd = input.nextLine();
                        System.out.println("Digite o nome do adquirinte:");
                        Lance lance = new Lance();
                        String nomeP = input.nextLine();
                        System.out.println("Digite o contato do adquirinte:");
                        String contatoP = input.nextLine();
                        System.out.println("Digite o valor do lance:");
                        float vLance = input.nextFloat();
                        input.nextLine();
                        Pessoa p = new Pessoa(nomeP, contatoP);
                        lance.setP(p);
                        lance.setValor(vLance);
                        try {
                            leilao.receberLance(id, descProd, lance);
                            System.out.println("\nO lance foi realizado!\n");
                        } catch (Exception e) {
                            System.out.println("\nO lote de leilao ou o produto ainda nao existe\n");
                        }
                        break;
                    case "encerrarleilao":
                        System.out.println("\tVENDAS FINALIZADAS, ADQUIRINTES VENCEDORES:");
                        leilao.listarProdutos();
                        System.exit(0);
                        break;
                    case "help":
                        System.out.println("\nComandos:\n\taddlote\n\taddproduto\n\tencerrarleilao\n\tlistarprodutos\n\treceberlance\n\thelp\n\tsair");
                        break;
                    default:
                        System.out.println("\nNao foi possivel entender o seu comando,\ndigite \"help\" para mostrar os comandos disponiveis.\n");
                }
            }else{
                break;
            }
        }while(true);
        input.close();
    }
}
