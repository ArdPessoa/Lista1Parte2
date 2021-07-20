import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a qauntidade de horas trabalhadas no mês");
        double horas = scan.nextDouble();

        double salarioBrunto = valorHora * horas;
        double inss = (salarioBrunto / 100) * 8;
        double sindicato = (salarioBrunto / 100) * 5;
        double ir = (salarioBrunto / 100) * 11;
        double toralDesconto =  inss + sindicato + ir;
        double salarioLiquido = salarioBrunto - toralDesconto;

        System.out.println("Salário bruto:" + salarioBrunto);
        System.out.println("INSS:" + inss);
        System.out.println("Sindicato:" + sindicato);
        System.out.println("IR:" + ir);
        System.out.println("Total desconto:" + toralDesconto);
        System.out.println("Salário líquido:" + salarioLiquido);
    }
}
