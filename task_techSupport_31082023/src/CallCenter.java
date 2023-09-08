import java.util.HashSet;
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
    
        SuporteTecnico sp = new SuporteTecnico();

        sp.BancoSolucao();
        sp.RespostaPadrao();

        System.out.println("Bem-vindo ao sistema de Suporte Tecnico");
        Scanner input = new Scanner(System.in);
        String opt;
        while(true){
            System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.\r");
            opt = input.nextLine();
            if(!opt.equalsIgnoreCase("sair")){
                Interpretadora interpretadora = new Interpretadora();
                HashSet<String> iT = interpretadora.Interpretar();
                System.out.println(sp.BuscarSolucao(iT));
            }else{
                break;
            }
        }
        System.out.println("Obrigado por utilizar nossos servicos! <3");
        input.close();
    }
}
