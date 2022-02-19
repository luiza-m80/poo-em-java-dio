package exercicios;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Fusca Vintage");
        carro1.setCapacidadeDoTanque(72);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.valorTotalTanque(5.89));

        System.out.println("\n");

        Carro carro2 = new Carro();

        carro2.setCor("Rosa");
        carro2.setModelo("Kwid");
        carro2.setCapacidadeDoTanque(50);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeDoTanque());
        System.out.println(carro2.valorTotalTanque(6.70));
    }
}
