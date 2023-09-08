public class App {
    public static void main(String[] args) throws Exception {
        Card card1 = new Card();
        card1.setValue();
        card1.setSuit();

        Card card2 = new Card();
        card2.setValue();
        card2.setSuit();

        System.out.println("Comparando VALOR carta 1 com carta 2:");
        System.out.println(card1.compareValue(card2));

        System.out.println("Comparando VALOR carta 2 com carta 1:");
        System.out.println(card2.compareValue(card1));

        System.out.println("Comparando NAIPE carta 1 com carta 2:");
        card1.compareSuit(card2);

        System.out.println("Comparando NAIPE carta 2 com carta 1:");
        card2.compareSuit(card1);
    }
}
