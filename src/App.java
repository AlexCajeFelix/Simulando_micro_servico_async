import java.io.IOException;
import java.util.Scanner;
import com.google.gson.JsonSyntaxException;

import CompletableFutureMethod.CompletableFutureMethod;
import Threads.ThreadsCidade;
import Threads.ThreadsPokemon;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            Scanner sc = new Scanner(System.in);

        

            CompletableFutureMethod metodTest = new CompletableFutureMethod();
            metodTest.run();

    
            System.out.println("CONDICIONAL AQUI DPS QUE TODAS API DEVOLVEREM O VALOR ");

            sc.close();
        } catch (JsonSyntaxException e) {
            System.out.println("Erro: CEP ou nome de pokemon inválido");
            System.out.println("Digite um CEP ou Pokémon válido");
        } catch (IllegalArgumentException j) {
            System.out.println("Deu erro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Erro: DEU RUNTIMEEXCEPTION");
        }
    }
}
