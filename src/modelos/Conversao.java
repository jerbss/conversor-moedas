package modelos;

import java.util.Scanner;

public class Conversao {
    public static void processarConversao(Scanner leitura, Conversor conversor, String moedaOrigem, String moedaDestino) {
        System.out.println("Digite o valor que deseja converter: ");
        double valor = leitura.nextDouble();

        try {
            Moedas taxa = conversor.obterTaxa(moedaOrigem, moedaDestino);
            double valorConvertido = taxa.converter(valor, moedaOrigem, moedaDestino);
            System.out.println("\nVALOR CONVERTIDO!");
            System.out.printf("%.2f %s = %.2f %s%n", valor, moedaOrigem, valorConvertido, moedaDestino);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Erro ao obter a taxa de câmbio. Tente novamente mais tarde.");
        }
    }
}
