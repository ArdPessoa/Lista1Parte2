import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros quadrados a serem pintados:");
        int metros = scan.nextInt();

        int litros = metros/3;
        int latas = 18;
        int resultado = litros/latas;
        int valor = 80;
        System.out.println("A quantidade de latas de tintas vai ser:" + Math.round(resultado));
        System.out.println(" Vai custar:" + resultado*80);

    }
}