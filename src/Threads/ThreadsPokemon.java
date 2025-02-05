package Threads;

import java.io.IOException;

import com.google.gson.JsonSyntaxException;

import Rquest.RequestPokemon;

public class ThreadsPokemon implements Runnable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    RequestPokemon requestPokemon = new RequestPokemon();

    @Override
    public void run() {

        try {
            requestPokemon.createRequestPokemon(name);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            System.out.println("Erro: nome de pokemon inválido");
            
        } catch (IllegalArgumentException j) {
            System.out.println("Deu erro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Erro: DEU RUNTIMEEXCEPTION");
        }

        /* System.out.println(Thread.currentThread().getName() + "tdrPokemon"); */
    }
}
