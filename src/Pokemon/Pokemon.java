package Pokemon;
public class Pokemon {
    private String name;

    
    public Pokemon(String name ) {
        this.name = name;
        
    }

    public Pokemon(PokemonRecord record) {
        this.name = record.name();  // Atribui o nome do PokemonRecord ao atributo nome
    }
    
    public Pokemon() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "O nome do pokemon é " + getName();
    }


}
