import java.io.IOException;
import java.util.Scanner;
import com.google.gson.JsonSyntaxException;
import Rquest.RequestCidade;
import Rquest.RequestPokemon;
public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do pokemon");
            String name = sc.nextLine();
            System.out.println("Digite o cep da cidade");
            String cidade = sc.nextLine();
            RequestPokemon requestPokemon = new RequestPokemon();
            requestPokemon.createRequestPokemon(name);
            RequestCidade requesCidade = new RequestCidade();
            requesCidade.RequestCidade(cidade);
            sc.close();
        } catch (IOException e) {
            System.out.println("Deu erro IOException");
        } catch (JsonSyntaxException e) {
            System.out.println("Erro cep ou nome de pokemon inválido");
            System.out.println("Digite um cep ou pokemon válido");
        } catch (IllegalArgumentException e) {
            System.out.println("Deu erro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Deu erro RuntimeException");
        } catch (InterruptedException e) {
            System.out.println("Deu erro InterruptedException");
        }
    }
}
