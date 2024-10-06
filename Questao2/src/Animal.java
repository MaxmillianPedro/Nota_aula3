import java.util.Date;

public class Animal {

    private String nome;
    private String raca;
    private int ano;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public void caminha() {
        System.out.println("caminhando");
    }

    public void calculaIdade() {
        int i = new Date().getYear() - this.ano;
        System.out.println(i);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
