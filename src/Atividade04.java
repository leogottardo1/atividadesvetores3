import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        double mediaFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numeros[2] = sc.nextInt();

        mediaFinal = (numeros[0] + numeros[1] + (double)numeros[2]) / 3;

        System.out.println("Os valores defidos são : " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + mediaFinal);


    }
}
