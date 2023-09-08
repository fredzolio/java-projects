/*
 * A classe Baralho deverá ter um grupo de cartas, que
 * serão criadas até que o baralho esteja completo, isto é,
 * até que existam quatro sequências de 13 cartas dos
 * quatro naipes válidos.
 * 
 * A classe Baralho terá a responsabilidade de 
 * embaralhar as cartas e distribuir as cartas.
 * 
 * Dicas: 
    1. Na classe Baralho, crie um array com os nomes dos naipes, 
        conforme:
            String[] naipes={“Copas”,”Ouros”,”Paus”,”Espadas”}
    2. Embaralhar significa que as posições das cartas devem
        ser trocadas de forma aleatória. 
            Utilize a classe SecureRandom para isso.
 */

import java.security.SecureRandom;

public class Baralho {
    
    private String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};
    Carta[] cartas = new Carta[52];
    
    public Baralho(){
        for(int i = 0; i < 52; i++){
            cartas[i] = new Carta();
        }
    }

    SecureRandom rand = new SecureRandom(SecureRandom.getSeed(20));

    public void CriaBaralho(){
        int i = 0;
        for(int n = 0; n < 4; n++){
            for(int v = 1; v <= 13; v++){
                cartas[i].setNaipe(naipes[n]);
                cartas[i].setValor(v);
                i++;
            }
        }
    }

    public void Embaralhar(){
        System.out.println("\n\tMesa embaralhando...\n");
        for(int i = cartas.length - 1; i > 0; i--){
            int indice = rand.nextInt(i + 1);
            Carta temp = cartas[i];
            cartas[i] = cartas[indice];
            cartas[indice] = temp;
        }
    }

    int temp_indice_cartas = 0;

    public Carta getCarta(int numCartas){
        temp_indice_cartas = temp_indice_cartas + numCartas;
        return cartas[temp_indice_cartas];
    }
}
