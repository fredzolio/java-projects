public class Teste {
    public static void main(String[] args) {
        Produto flor = new Produto();
        flor.setDescricao("Lírio");

        Produto vaso = new Produto();
        vaso.setDescricao("Vaso de Plástico");

        System.out.println("Produto: " + flor.getDescricao());
        System.out.println("Produto: " + vaso.getDescricao());
    }
}