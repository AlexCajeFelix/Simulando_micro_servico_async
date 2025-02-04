import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;
import Cidade.CidadeDoPokemon;
import Pokemon.Pokemon;
import Pokemon.PokemonRecord;

public class App {
    public static void main(String[] args) throws RuntimeException, IOException, InterruptedException {

        String pokemon = "bulbasaur";
        String pokeApi = "https://pokeapi.co/api/v2/pokemon/" + pokemon + "/"; // Corrigi a URL

        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(pokeApi);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String responseBody = response.body();

        Gson gson = new Gson();
        PokemonRecord poke2 = gson.fromJson(responseBody, PokemonRecord.class);
        Pokemon teste = new Pokemon(poke2);
        System.out.println(teste);
        
          String cep = "01001000";
          String apiCep = "https://viacep.com.br/ws/" + cep + "/json/";
          
          HttpClient client2 = HttpClient.newHttpClient();
          URI uri2 = URI.create(apiCep);
          
          HttpRequest request2 = HttpRequest.newBuilder()
          .uri(uri2)
          .build();
          
          HttpResponse<String> response2 = client2.send(request2, BodyHandlers.ofString());
          String responseBody2 = response2.body();

          CidadeDoPokemon cidade = gson.fromJson(responseBody2, CidadeDoPokemon.class);
          System.out.println(cidade);


         if(poke2.name().equalsIgnoreCase("bulbasaur") && cidade.logradouro().equalsIgnoreCase("Praça da Sé")){
            System.out.println("O " + poke2.name() + " mora: " + cidade.localidade());
         }
         

    }
}
