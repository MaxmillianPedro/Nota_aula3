public class Gerente extends Funcionario{
    private String projeto;

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void informar_projeto() {
        System.out.println("Projeto: " + projeto);
    }
}
