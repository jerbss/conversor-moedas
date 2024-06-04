package modelos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public Moedas obterTaxa(String moedaOrigem, String moedaDestino) {
        String apiKey = "02cec1ee6c50ce723e329404";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            Moedas taxas = gson.fromJson(response.body(), Moedas.class);
            return taxas;
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter a taxa de câmbio.");
        }
    }
}
