public class Jogador {
    
    private Carta cartas_do_jogador[];

    public Jogador(int numCartas, Baralho bar){
        cartas_do_jogador = new Carta[numCartas];
        for(int i = 0; i < numCartas; i++){
            cartas_do_jogador[i] = bar.getCarta(i);
        }
    }


    public Carta getCarta_do_jogador() {
        Carta carta_maior = new Carta();
        carta_maior = cartas_do_jogador[0];
        for(int i = 1; i < cartas_do_jogador.length; i++){
            if(cartas_do_jogador[i].getValor() > carta_maior.getValor()){
                carta_maior = cartas_do_jogador[i];
            }
        }
        return carta_maior;
    }

}
