import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        mostrarTitulo();

        System.out.println("Informe o primeiro numero: ");
        double numeroEntrada1 = keyboard.nextDouble();


        System.out.println("Informe o Segundo numero: ");
        double numeroEntrada2 = keyboard.nextDouble();

        int opcao = 1;

        while (opcao != 0) {

            mostrarMenu();

            System.out.println("Escolha uma opção: ");
            opcao = keyboard.nextInt(); 

            double resultado;
            
            switch (opcao) {

                case 1:
                    limparTela();
                    resultado = somar(numeroEntrada1, numeroEntrada2);
                    mostrarResultado(numeroEntrada1, "+", numeroEntrada2, resultado);
                    break;

                case 2:
                    limparTela();
                    resultado = subtrair(numeroEntrada1, numeroEntrada2);
                    mostrarResultado(numeroEntrada1, "-", numeroEntrada2, resultado);
                    break;

                case 3:
                    limparTela();
                    resultado = multiplicar(numeroEntrada1, numeroEntrada2);
                    mostrarResultado(numeroEntrada1, "*", numeroEntrada2, resultado);
                    break;

                case 4:
                    if (numeroEntrada2 == 0) {
                        System.out.println("\n Erro: divisão por zero não é permitida.");
                    } else {
                        limparTela();
                        resultado = divisao(numeroEntrada1, numeroEntrada2);
                        mostrarResultado(numeroEntrada1, "/", numeroEntrada2, resultado);
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando a calculadora...");
                    break;

                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
            }
        }

        keyboard.close();
    }

    // ================== VISUAL ==================
    
    static void mostrarTitulo(){
        System.out.println("====================================");
        System.out.println("        CALCULADORA EM JAVA          ");
        System.out.println("====================================\n");
    }

    static void mostrarMenu(){
        System.out.println("\n------------------------------------");
        System.out.println("MENU");
        System.out.println("------------------------------------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.println("------------------------------------");
    }

    static void mostrarResultado(double a, String operador, double b, double resultado) {
        System.out.println("\n------------------------------------");
        System.out.println("RESULTADO");
        System.out.println("------------------------------------");
        System.out.printf("%.2f %s %.2f = %.2f\n", a, operador, b, resultado);
        System.out.println("Operação realizada com sucesso!");
        System.out.println("------------------------------------");
    }

    static void limparTela() {
    for (int i = 0; i < 8; i++) {
        System.out.println();
    }
}

    // ================== OPERAÇÕES ==================

    static double somar(double numeroA, double numeroB){
        return numeroA + numeroB;
    }

    static double subtrair(double numeroA, double numeroB){
        return numeroA - numeroB;
    }

    static double multiplicar(double numeroA, double numeroB){
        return numeroA * numeroB;
    }

    static double divisao(double numeroA, double numeroB){
        return numeroA / numeroB;
    }

  
    
}