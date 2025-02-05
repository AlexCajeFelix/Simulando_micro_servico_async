package Threads;

import com.google.gson.JsonSyntaxException;

import Rquest.RequestCidade;

public class ThreadsCidade implements Runnable {
    RequestCidade requestCidade = new RequestCidade();
    private String cep;

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public void run() {

        try {
            requestCidade.requestCidade(cep);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            System.out.println("Erro: CEP inválido");
          
        } catch (IllegalArgumentException j) {
            System.out.println("Deu erro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Erro: DEU RUNTIMEEXCEPTION");
        }
     /*    System.out.println(Thread.currentThread().getName() + "tdrCidade"); */
    }

}
