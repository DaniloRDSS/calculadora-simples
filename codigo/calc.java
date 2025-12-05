package codigo;
import java.util.Scanner;
class op {
    public double somar (Double valor1, Double valor2) {
        return valor1 + valor2;
    }
    public double subtrair (double valor1, double valor2) {
        return valor1 - valor2;
    }
    public double multiplicar (double valor1, double valor2) {
        return valor1 * valor2;
    }
    public double dividir (double valor1, double valor2) {
        return valor1 / valor2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        op op = new op();
        System.out.println("-----CALCULADORA-----");
        System.out.print("Digite o primeiro valor para realizar a operação: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite agora o segundo valor para realizar a operação: ");
        double valor2 = sc.nextDouble();
        System.out.println("-----------------------------------------");
        System.out.println("Informe a operação desejada que deseja fazer: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - dividir");
        System.out.println("------------------------------------------");
        int opcao = sc.nextInt();
        sc.close();
        switch (opcao) {
            case 1: 
                System.out.println("A soma entre os valores é: " + op.somar(valor1,valor2));
                break;
            case 2:
                System.out.println("A subtração entre os dois valore è: " + op.subtrair(valor1, valor2));
                break;
            case 3:
                System.out.println("A multiplicação entre os valores é: " + op.multiplicar(valor1, valor2));
                break;
            case 4:
                System.out.println("A divisão entre o primeiro valor e o segundo é: " + op.dividir(valor1, valor2));
                break;
            default:
                System.out.println("Operação Invalida:");
                return;
        } 
    }
}