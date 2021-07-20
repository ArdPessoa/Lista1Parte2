import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho de metros quadrado da área a ser pintada:");
        double metros = scan.nextDouble();

        double litros = metros/6;
        double latasL = 18;
        double latasG = 3.6;
        double resultado1 = litros/latasL;
        double resultado2 = litros/latasG;
        double valorL = 80;
        double valorG = 25;
        double resultado3 = resultado1 + resultado2;
        double ValorLG = 105;

        System.out.println("Valor apenas das latas de 18L:" + Math.round(resultado1 ));
        System.out.println(" latas de 18L vai custar:" + Math.round(resultado1*80)+"R$");
        System.out.println("Valor apenas das Galões de 3.6L:"+ Math.round(resultado2));
        System.out.println("Galões de 3.6L vai custar:" + Math.round(resultado2*25)+"R$");
        System.out.println("Junção do galão 3.6L com a lata 18L:" + Math.round(resultado3));
        System.out.println();
    }
}
