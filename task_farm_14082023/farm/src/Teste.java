public class Teste {
    public static void main(String[] args) throws Exception {
        //2 cavalos
        Cavalo cavalo1 = new Cavalo();
        cavalo1.setNome("Zé Cabreiro");
        cavalo1.setCorPelo("Marrom");
        cavalo1.setConsumo(210);

        Cavalo cavalo2 = new Cavalo();
        cavalo2.setNome("Zé Pilintra");
        cavalo2.setCorPelo("Preto");
        cavalo2.setConsumo(198);

        //5 galinhas
        Galinha galinha1 = new Galinha();
        galinha1.setNome("Clotilde");
        galinha1.setCorPena("Malhada");
        galinha1.setConsumo(21);

        Galinha galinha2 = new Galinha();
        galinha2.setNome("Marfina");
        galinha2.setCorPena("Branca");
        galinha2.setConsumo(19);

        Galinha galinha3 = new Galinha();
        galinha3.setNome("Filó");
        galinha3.setCorPena("Preta");
        galinha3.setConsumo(17);

        Galinha galinha4 = new Galinha();
        galinha4.setNome("Chernobiua");
        galinha4.setCorPena("Verde");
        galinha4.setConsumo(31);

        Galinha galinha5 = new Galinha();
        galinha5.setNome("Skyller");
        galinha5.setCorPena("Azul");
        galinha5.setConsumo(23);

        //3 vacas
        Vaca vaca1 = new Vaca();
        vaca1.setNome("Mumuzinha");
        vaca1.setCorPelo("Branca");
        vaca1.setConsumo(312);

        Vaca vaca2 = new Vaca();
        vaca2.setNome("Dona Leitinpó");
        vaca2.setCorPelo("Pintada");
        vaca2.setConsumo(409);

        Vaca vaca3 = new Vaca();
        vaca3.setNome("Gusmana");
        vaca3.setCorPelo("Pintada");
        vaca3.setConsumo(301);

        double consumoCavalos = cavalo1.getConsumo() + cavalo2.getConsumo();
        double consumoGalinhas = galinha1.getConsumo() + galinha2.getConsumo() + galinha3.getConsumo() + galinha4.getConsumo() + galinha5.getConsumo();
        double consumoVacas = vaca1.getConsumo() + vaca2.getConsumo() + vaca3.getConsumo();

        double consumoTotal = consumoCavalos + consumoGalinhas + consumoVacas;
        double compraMensal = consumoTotal * 30;
        
        System.out.println("Compra mensal: " + compraMensal + " quilos");

    }
}
