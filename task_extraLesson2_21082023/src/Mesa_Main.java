import java.util.Scanner;

public class Mesa_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero de cartas da rodada:");
        int numCartas_Rodada = input.nextInt();
        input.nextLine();

        Baralho bar = new Baralho();
        bar.CriaBaralho();
        bar.Embaralhar();

        Jogador a = new Jogador(numCartas_Rodada, bar);
        Jogador b = new Jogador(numCartas_Rodada, bar);

        System.out.println("\nA mesa distribui as " + numCartas_Rodada + " cartas para jogador A e para o jogador B.\n");

        

        Carta carta_a = a.getCarta_do_jogador();
        Carta carta_b = b.getCarta_do_jogador();

        System.out.println("O jogador A joga a carta de naipe " + carta_a.getNaipe() + " e de valor " + carta_a.getValor());
        System.out.println("O jogador B joga a carta de naipe " + carta_b.getNaipe() + " e de valor " + carta_b.getValor());
        
        if(carta_a.getValor() > carta_b.getValor()){
            System.out.println("O jogador A venceu o jogo.\r");
        }else if(carta_a.getValor() < carta_b.getValor()){
            System.out.println("O jogador B venceu o jogo.\r");
        }else{
            if(carta_a.getNaipe().equals("Ouros") && !carta_b.getNaipe().equals("Ouros")){
                System.out.println("Houve um empate e o jogador A venceu o jogo por ter uma carta com o naipe Ouros.\r");
            }else if(carta_b.getNaipe().equals("Ouros") && !carta_a.getNaipe().equals("Ouros")){
                System.out.println("Houve um empate e o jogador B venceu o jogo por ter uma carta com o naipe Ouros.\r");
            }else if(carta_b.getNaipe().equals("Ouros") && carta_a.getNaipe().equals("Ouros")){
                System.out.println("Houve um empate total.\r");
            }
        }
    }
}
