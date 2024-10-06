import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* -----Mereço 5 pontos por esse programa :) -----*/
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Corrente c = new Corrente();
        Poupanca p = new Poupanca();
        int tipoConta = 100;

        do {
        System.out.println("Selecione o tipo de conta: ");
        System.out.println("Para conta corrente, digite: 1\nPara conta poupança, digite: 2\nPara sair, digite: 0");
        tipoConta = sc.nextInt();


        switch(tipoConta) {
            case(1):
                int x = 100;
                do {
                    System.out.println("Para efetuar um depósito, digite: 1\nPara efetuar um saque, digite: 2\nPara usar cheque especial, digite: 3\nPara exibir dados da conta, digite: 4\nPara voltar ao menu anterior, digite: 0");
                    x = sc.nextInt();
                    switch (x) {
                        case (1):
                            System.out.println("Qual valor deseja depositar: ");
                            c.setSaldo(c.getSaldo() + sc.nextDouble());
                            break;
                        case (2):
                            System.out.println("Qual valor deseja sacar: ");
                            c.setSaldo(c.getSaldo() - sc.nextDouble());
                            break;
                        case (3):
                            System.out.println("Qual valor você deseja usar do cheque especial(R$1000,0):");
                            double resultado = c.getSaldo() - sc.nextDouble();
                            if (resultado >= -1000) {
                                c.setSaldo(resultado);
                            } else {
                                System.out.println("Cheque especial negado, limite excedido.");
                            }
                            break;
                        case (4):
                            System.out.println("Dados da conta: ");
                            c.exibirDados();
                            break;
                    }
                } while (x!=0);
                break;
            case(2):
                int y = 100;
                do {
                    System.out.println("Para efetuar um depósito, digite: 1\nPara efetuar um saque, digite: 2\nPara calcular rendimento, digite: 3\nPara exibir dados da conta, digite: 4\nPara voltar ao menu anterior, digite: 0");
                    y = sc.nextInt();
                    switch (y) {
                        case (1):
                            System.out.println("Qual valor deseja depositar: ");
                            p.setSaldo(p.getSaldo() + sc.nextDouble());
                            break;
                        case (2):
                            System.out.println("Qual valor deseja sacar: ");
                            p.setSaldo(p.getSaldo() - sc.nextDouble());
                            break;
                        case (3):
                            System.out.println("Informe a taxa Selic: ");
                            double selic = sc.nextDouble();
                            p.setSelic(selic);
                            double rendimento =  p.calcularRendimento();
                            System.out.println("Rendimento: R$" + rendimento);
                            break;
                        case (4):
                            System.out.println("Dados da conta: ");
                            p.exibirDados();
                            break;
                    }
                } while (y!=0);
                break;
            }
        } while (tipoConta!=0);
    }
}