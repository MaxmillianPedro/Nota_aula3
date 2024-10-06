import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Gerente g = new Gerente();
        Programador p = new Programador();

        System.out.println("Para gerente, digite: '1' \nPara programador, digite: '2'");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Informe o nome: ");
                g.setNome(sc2.nextLine());
                System.out.println("Informe o ano de nascimento: ");
                g.setNasc(sc.nextInt());
                System.out.println("Informe o salário: ");
                g.setSalario(sc.nextDouble());
                System.out.println("Qual seu projeto: ");
                g.setProjeto(sc2.nextLine());
                g.calcular_idade();
                g.informar_salario();
                g.informar_projeto();
                break;
            case 2:
                System.out.println("Informe o nome: ");
                p.setNome(sc2.nextLine());
                System.out.println("Informe o ano de nascimento: ");
                p.setNasc(sc.nextInt());
                System.out.println("Informe o salário: ");
                p.setSalario(sc.nextDouble());
                System.out.println("Qual sua linguagem: ");
                p.setLinguagem(sc2.nextLine());
                p.calcular_idade();
                p.informar_salario();
                p.informar_linguagem();
                break;
            default:
                System.out.println("Invalido");
        }
    }
}