public class Corrida {

    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;
    private double valorFinal;

    public double getValorFinal() {
        return valorFinal;
    }
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public int getTempoEspera() {
        return tempoEspera;
    }
    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }
    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public double getFatorDemanda() {
        return fatorDemanda;
    }
    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        valorFinal = (distancia*2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
        return valorFinal;
    }

    public void exibirDetalhesDaCorrida(){
        System.out.println("Distância percorrida: " + distancia + "km");
        System.out.println("Tempo de espera: " + tempoEspera + " minuto(s)");
        System.out.println("Tarifa base do serviço: R$" + tarifaBase);
        System.out.println("Demanda: " + fatorDemanda);
        System.out.println("Valor final da corrida: R$" + valorFinal);
    }
}
