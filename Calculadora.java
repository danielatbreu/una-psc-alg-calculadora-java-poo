import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculos calculadora = new Calculos();

        while (true) {

        System.out.println("\n Olá, bem-vindo a sua calculadora.");

        System.out.print("Digite o primeiro número:");
        calculadora.setNumeroUm(scanner.nextDouble()); 

        System.out.print("Digite o segundo número:");
        calculadora.setNumeroDois(scanner.nextDouble());

        System.out.println("\nDigite a operação que deseja fazer de acordo com a tabela, ou digite 'Q' para sair:");
        System.out.println("\n 1 | Soma\n 2 | Subtração\n 3 | Multiplicação\n 4 | Divisão\n 5 | Potenciação\n 6 | Raiz Quadrada\n");
        String operation = scanner.next();

        if (operation.equals("Q") || operation.equals("q") ) {
            System.out.println("Você saiu do programa!");
            break;
        }
  
        switch (operation) {
            case "1":
            double resultadoSoma = calculadora.somar();
            System.out.printf("O resultado da adição é %.2f", resultadoSoma);
            break;

            case "2":
            double resultadoSubtração = calculadora.subtrair();
            System.out.printf("O resultado da subtração é %.2f", resultadoSubtração);
            break;

            case "3":
            double resultadoMultiplicao = calculadora.multiplicar();
            System.out.printf("O resultado da multiplicação é %.2f", resultadoMultiplicao);
            break;

            case "4":
            double resultadoDivisao = calculadora.dividir();
            if (calculadora.getNumeroDois() == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            break;
            } else
            System.out.printf("O resultado dessa divisão é  %.2f", resultadoDivisao);
            break;

            case "5":
            if (calculadora.getNumeroDois() == 0) {
                double resultadoPotencia = 1;
                System.out.println("O resultado dessa potência é " +  resultadoPotencia);
                break;
            } else {
                double resultadoPotencia = calculadora.potenciar();
                System.out.printf("O resultado dessa potência é %.2f", resultadoPotencia);
                break;
            }

            case "6":
            if (calculadora.getNumeroUm() < 0) {
                double resultadoRaizDois = calculadora.raizNumeroDois();
                System.out.printf("Os resultados são: \n Primeira raiz: Não existe raiz de número negativo. \n Segunda raiz: %.2f", resultadoRaizDois);
                break;
            } 
            
            else if (calculadora.getNumeroDois() < 0) {
                double resultadoRaizUm = calculadora.raizNumeroUm();
                System.out.printf("Os resultados são: \n Primeira raiz: %.2f \n Segunda raiz: Não existe raiz de número negativo.", resultadoRaizUm);
                break;
            }
            
            else if (calculadora.getNumeroUm() < 0 && calculadora.getNumeroDois() < 0) { 
                System.out.println("Não existe raiz de número negativo.");
                break;  
            }
             else {
                double resultadoRaizUm = calculadora.raizNumeroUm();
                double resultadoRaizDois = calculadora.raizNumeroDois();
                System.out.printf("Os resultados são: \nPrimeira raiz: %.2f \nSegunda raiz: %.2f", resultadoRaizUm, resultadoRaizDois);
                break;
            }
            default:
            System.out.println("Operação inválida, digite um dos ícones na tabela.");

        }
    }

        scanner.close();
    }
}
