package Rquest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import Exeption.ExeptionPokemon;
import Pokemon.Pokemon;
import Pokemon.PokemonRecord;

public class RequestPokemon {


public Pokemon createRequestPokemon (String nomePokemon) throws IOException{
       try {
        String pokemon = nomePokemon;
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

        return teste;
       } catch (IOException e) {
            throw new ExeptionPokemon("Deu ruim IOException");
       }catch(InterruptedException e){
        throw new ExeptionPokemon("Deu ruim InterruptedException");
       }
    }

   
    
    
}
