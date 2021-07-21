import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempoS = tamArquivo/(velInternet/8);

        System.out.println("Tempo de downloand em S:" + tempoS);
    }
}
