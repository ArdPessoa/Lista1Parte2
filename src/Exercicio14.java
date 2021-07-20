import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos kg de peixe?");
        int peso = scan.nextInt();
        if(peso>50){
            System.out.println("A multa a ser paga:" + (peso-50)*4 + "reais");
        }else {
            System.out.println("O senhor não pagara multa!");
        }
    }
}
