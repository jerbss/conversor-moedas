package modelos;

import java.util.Map;

public class Moedas {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public double converter(double valor, String moedaOrigem, String moedaDestino) {
        Double taxaOrigem = conversion_rates.get(moedaOrigem);
        Double taxaDestino = conversion_rates.get(moedaDestino);

        if (taxaOrigem == null || taxaDestino == null) {
            throw new RuntimeException("Taxas de câmbio não disponíveis para as moedas especificadas.");
        }

        return valor * taxaDestino / taxaOrigem;
    }
}
