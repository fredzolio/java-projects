import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Interpretadora {

    private HashSet<String> palavraChave;

    public Interpretadora(){
        palavraChave = new HashSet<>();
    }

    Scanner input = new Scanner(System.in);

    public HashSet<String> Interpretar(){

        System.out.println("Descreva o seu problema:");
        String str = input.nextLine();
        str = str.toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        while (tokenizer.hasMoreTokens()){
            palavraChave.add(tokenizer.nextToken());
        }
        return palavraChave;
    }
}
