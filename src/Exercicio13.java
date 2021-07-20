import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Entre com a altura");
            double altura = scan.nextDouble();

            double pesoIdeal = (72.2*altura) - 58;

            System.out.println("O peso ideal é: " + pesoIdeal);

        System.out.println("Digite a incial do seu Sexo 'M' para Homens 'F' para mulheres");
        String sx = scan.next();
        if (sx.equalsIgnoreCase("m")){
            System.out.println((altura * 72.7) - 58);
        }else if(sx.equalsIgnoreCase("f")){
            System.out.println((altura * 62.1) - 44.7);
        }
        }
    }


