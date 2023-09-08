import java.util.Scanner;

public class Card {
    private int value;
    //naipe = suit
    private String suit;

    public Card(){
        value = 0;
        suit = "";
    }

    /*
    TO-DO: 
        [X] Criar nos "sets" uma maneira que o usuario insira os valores
    */   

    Scanner s = new Scanner(System.in);
    
    public void setValue(){
        System.out.println("Insira o valor da carta:");
        this.value = s.nextInt();
        //consumir o ultimo caracter que ficou em nextInt()
        s.nextLine();
    }

    public void setSuit(){
        System.out.println("Insira o naipe da carta:");
        this.suit = s.nextLine();
    }

    public int compareValue(Card card){
        if(this.value == card.value){
            return 0;
        } else if(this.value > card.value){
            return 1;
        } else{
            return -1;
        }
    }
    //Professora, eu sabia do uso da condicao ternaria que eu ja usei no JavaScript, por isso repliquei aqui.
    //Alem disso, vi que usar "==" para comparar strings nao da certo, pesquisei e vi que eh preciso usar equals.
    public void compareSuit(Card card){
        System.out.println((this.suit.equals(card.suit)) ? "Sao do mesmo naipe" : "Nao sao do mesmo naipe");
    }
}
