import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! Qual seu nome");
        String userName = leitura.nextLine();
        String abertura = """
                     -_- JOGO DE ADIVINHAÇÃO -_-
                          !!! bem vindo !!!
                Prazer em conhece-lo %s eu sou a máquina.
                Tente adivinhar em qual número de 1 a 100 estou pensando.
                """;
        System.out.println(String.format(abertura, userName));

        int numeroSecreto = new Random().nextInt(100);
        //System.out.println(numeroSecreto);

        int tentativas = 0;

        while (true) {
            System.out.println("Qual é o seu chute: ");
            int chute = leitura.nextInt();
            if (chute > numeroSecreto) {
                System.out.println("O número secréto é menor que " + chute);
                System.out.println("-_- Tente novamente -_-");
            } else if (chute < numeroSecreto) {
                System.out.println("O número secréto é maior que " + chute);
                System.out.println("   -_- Tente novamente -_-");
            } else if (chute == numeroSecreto) {
                System.out.println(" :) Parabéns! Você acertou (:\n");
                break;
            }
            tentativas++;
            System.out.println("Tentativa " + tentativas);
        }
        if (tentativas <= 5){
            String texto = """
                      :o !Leu meus pensamentos! o:
                        acertou em %d tentativas
                    """;
            System.out.println(String.format(texto, tentativas));
        }
        else if (tentativas >= 6 && tentativas <= 10 ) {
            String texto = """
                    -_- até que é um bom jogador -_-
                     você acertou em %d tentativas.
                    """;
            System.out.println(String.format(texto, tentativas));
        }
        else if (tentativas >= 11) {
            String demorou = """
                         ): Demorou em! :(
                    você acertou em %d tentativas.
                    """;
            System.out.println(String.format(demorou, tentativas));
        }
        System.out.println("     !!! FIM DE JOGO !!!");
    }
}