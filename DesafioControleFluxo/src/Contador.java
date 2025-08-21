import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try (terminal) {
            System.out.println("Digite o primeiro parâmetro (número inteiro):");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro (número inteiro):");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeDeInteracoes = parametroDois - parametroUm;

        for (int i = 1; i <= quantidadeDeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}