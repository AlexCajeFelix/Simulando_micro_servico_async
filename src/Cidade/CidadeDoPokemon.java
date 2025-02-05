package Cidade;

public record CidadeDoPokemon(String logradouro, String localidade) {

    @Override
    public String toString() {
        return "Cidade Do Pokemon é: "+ localidade()+" "+ logradouro();
    }
    
}
