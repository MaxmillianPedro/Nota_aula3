public class Poupanca extends Conta{

    private double rendimento;
    private double selic = 8.5;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double calcularRendimento() {
        if (selic > 8.5) {
            rendimento = 0.005 * this.getSaldo();
        }
        else {
            rendimento = 0.007 * selic * this.getSaldo();
        }
        return rendimento;
    }

    @Override
    public void exibirDados(){
        if (rendimento == 0 && this.getSaldo() !=0){
            this.calcularRendimento();
        }
        System.out.println("Saldo: " + this.getSaldo());

        System.out.println("Rendimento da conta poupança: R$" + this.rendimento);
    }

}
