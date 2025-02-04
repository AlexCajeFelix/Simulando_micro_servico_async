package Pokemon.Type;



public class Type {
    private String name;

    public Type() {} // Construtor vazio para Gson

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;  // Retorna o nome do tipo como uma string
    }
}






