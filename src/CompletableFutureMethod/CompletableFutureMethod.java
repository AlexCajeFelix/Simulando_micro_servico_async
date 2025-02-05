package CompletableFutureMethod;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import Cidade.CidadeDoPokemon;
import Pokemon.Pokemon;
import Rquest.RequestCidade;
import Rquest.RequestPokemon;

public class CompletableFutureMethod {
    

    private String cep;
    

    public void run() throws IOException {
       

        // Tarefa assíncrona para obter a cidade
        CompletableFuture<CidadeDoPokemon> compfut1 = CompletableFuture.supplyAsync(() -> {
            try {
                RequestCidade cidade = new RequestCidade();
                return cidade.requestCidade("01001000");   

            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;  
            }
        });
   

        CompletableFuture<Pokemon> compfut2 = CompletableFuture.supplyAsync(() -> {
           RequestPokemon requestPokemon = new RequestPokemon();
          try {
            return requestPokemon.createRequestPokemon("pikachu");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


        });

        compfut1.join();
        compfut2.join();

        CompletableFuture<Void> comp = CompletableFuture.allOf(compfut1, compfut2);
        comp.thenRun(() -> {
         
            CidadeDoPokemon cidadeDoPokemon = compfut1.join();  
            Pokemon poke = compfut2.join();
          
            System.out.println("Cidade do Pokémon: " + cidadeDoPokemon); 
            System.out.println("Nome do Pokémon: " + poke); 
            
                
        });
        

     
       
       
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
