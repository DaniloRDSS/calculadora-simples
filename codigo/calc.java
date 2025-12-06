package codigo;
import java.util.Scanner;
class calculadora {
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
    public static void exibir(String texto) {
        System.out.print(texto);
    }

    public static void main(String[] args) {
        String menu1 ="""
                -----CALCULADORA-----
                Digite o primeiro valor para realizar a operação:...""";
        String menu2 = "Digite agora o segundo valor para realizar a operação:...";
        String menu3 = """
                -----------------------------------------
                Informe a operação desejada que deseja fazer: 
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - dividir
                ------------------------------------------
                :...""";
        Scanner sc = new Scanner(System.in);
        calculadora op = new calculadora();
        exibir(menu1);        
        double valor1 = sc.nextDouble();
        exibir(menu2);
        double valor2 = sc.nextDouble();
        exibir(menu3);
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