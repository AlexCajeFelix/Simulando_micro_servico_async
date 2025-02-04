package Rquest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import Cidade.CidadeDoPokemon;
import Exeption.ExeptionCidade;

public class RequestCidade {

    public void requestCidade(String cidade) throws InterruptedException{
        try {
            Gson gson = new Gson();
            String cep = cidade;
            String apiCep = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            URI uri2 = URI.create(apiCep);

            HttpRequest request2 = HttpRequest.newBuilder()
                    .uri(uri2)
                    .build();

            HttpResponse<String> response = client.send(request2, BodyHandlers.ofString());
            String responseBody2 = response.body();

            CidadeDoPokemon cidadeObjeto = gson.fromJson(responseBody2, CidadeDoPokemon.class);
            System.out.println(cidadeObjeto);

        } catch (InterruptedException e) {
            throw new ExeptionCidade("Deu ruim InterruptedException");
        }catch(IOException e){
            throw new ExeptionCidade("Deu ruim IOException");
        }
    }
}
