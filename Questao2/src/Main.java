import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

        System.out.println("Informe o nome do seu cachorro");
        a.setNome();
        Animal animal2 = new Animal("Coca");

    }
}