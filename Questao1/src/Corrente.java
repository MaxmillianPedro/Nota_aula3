public class Corrente extends Conta{

    private double chequeEspecial = 1000;
    public void usarCheque() {

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void exibirDados(){
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cheque especial disponível: R$" + this.chequeEspecial);
    }
}
