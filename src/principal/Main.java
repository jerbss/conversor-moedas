package principal;
import modelos.Conversao;
import modelos.Conversor;
import modelos.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner leitura = new Scanner(System.in);
        Conversor conversor = new Conversor();

        // Loop principal para exibir o menu e processar a escolha do usuário
        while (escolha != 7) {
            Menu.exibirMenu();
            escolha = leitura.nextInt();

            if (escolha == 1) {
                Conversao.processarConversao(leitura, conversor, "USD", "BRL");
            } else if (escolha == 2) {
                Conversao.processarConversao(leitura, conversor, "BRL", "USD");
            } else if (escolha == 3) {
                Conversao.processarConversao(leitura, conversor, "JPY", "BRL");
            } else if (escolha == 4) {
                Conversao.processarConversao(leitura, conversor, "BRL", "JPY");
            } else if (escolha == 5) {
                Conversao.processarConversao(leitura, conversor, "EUR", "BRL");
            } else if (escolha == 6) {
                Conversao.processarConversao(leitura, conversor, "BRL", "EUR");
            } else if (escolha == 7) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção Inválida, tente novamente.");
            }
        }
        leitura.close();
    }
}
