import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.2*altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
