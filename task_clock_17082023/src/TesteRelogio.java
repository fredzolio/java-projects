import java.util.Scanner;
public class TesteRelogio {
    public static void main(String[] args) {
        //laço de repetição para rodar o relogio;
        Scanner input = new Scanner(System.in);

        System.out.println("Em qual formato voce deseja exibir o relogio (12 ou 24)?");
        String diff = input.nextLine();

        if(diff.equals("12")){
            Relogio rolex = new Relogio(12);
            for(int c = 0; c < 2; c++){
                for(int i = 0; i < 12; i++){
                    for(int m = 0; m < 60; m++){
                        rolex.ticTac();
                        System.out.print(rolex.getHora().getValor());
                        System.out.print(" : ");
                        System.out.print(rolex.getMinuto().getValor());
                        if(c == 0){
                            System.out.println(" AM");
                        } else{
                            System.out.println(" PM");
                        }
                    }
                }
            }
        }else{
            Relogio rolex = new Relogio(24);
            for(int i = 0; i < 24; i++){
                for(int m = 0; m < 60; m++){
                    rolex.ticTac();
                    System.out.print(rolex.getHora().getValor());
                    System.out.print(" : ");
                    System.out.println(rolex.getMinuto().getValor());
                }
            }
        }
    }
}
