import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Informe a distância percorrida em quilômetros (apenas números): ");
        c.setDistancia(sc.nextDouble());
        System.out.println("Informe o tempo de espera em minutos (apenas números): ");
        c.setTempoEspera(sc.nextInt());
        System.out.println("Informe a tarifa base: ");
        c.setTarifaBase(sc.nextDouble());
        System.out.println("Digite o fator de demanda R$ (1.0 = normal, 1.5 = pico): ");
        c.setFatorDemanda(sc.nextDouble());
        c.calcularValorCorrida();
        c.exibirDetalhesDaCorrida();

    }
}