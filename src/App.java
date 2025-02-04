import java.io.IOException;

import Rquest.RequestCidade;
import Rquest.RequestPokemon;

public class App {
    public static void main(String[] args) throws RuntimeException, IOException, InterruptedException {
        String name = "pikachu";
        String cidade = "01001000";
        RequestPokemon requestPokemon = new RequestPokemon();
        requestPokemon.createRequestPokemon(name);
        RequestCidade requesCidade =new RequestCidade();
        requesCidade.RequestCidade(cidade);
        

    }
}
