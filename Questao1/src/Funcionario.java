public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void informar_salario(){
        System.out.println("Salário: " +salario);
    }
    public void calcular_idade(){
        nasc = 2024-nasc;
        System.out.println("Idade: " + nasc);
    }
}
