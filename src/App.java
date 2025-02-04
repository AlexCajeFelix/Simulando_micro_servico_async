import java.io.IOException;
import java.util.Scanner;
import com.google.gson.JsonSyntaxException;
import Threads.ThreadsCidade;
import Threads.ThreadsPokemon;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do pokemon");
            String name = sc.nextLine();
            System.out.println("Digite o cep da cidade");
            String cep = sc.nextLine();

            ThreadsPokemon trh = new ThreadsPokemon();
            trh.setName(name);
            Thread thread = new Thread(trh);
            thread.start();
            thread.join();

            ThreadsCidade trhCidade = new ThreadsCidade();
            trhCidade.setCep(cep);
            Thread thread2 = new Thread(trhCidade);
            thread2.start();
            thread2.join();

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
