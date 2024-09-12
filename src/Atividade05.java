import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Primeiro nome: ");
        nomes[0] = sc.next();
        System.out.println("Digite o Segundo nome: ");
        nomes[1] = sc.next();
        System.out.println("Digite o Terceiro nome: ");
        nomes[2] = sc.next();

        System.out.println("O primeiro nome: " + nomes[0] + " e " + nomes[1] + " e " + nomes[2]);
    }
}
