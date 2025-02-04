package Pokemon;
import Pokemon.Type.Type;
import Pokemon.Type.TypeSlot;
import java.util.List;
import java.util.stream.Collectors;

public class Pokemon {
    private String name;
    private List<Type> types;
  
    // Construtor principal
    public Pokemon(String name, List<Type> types) {
        this.name = name;
        this.types = types;
    }

    // Construtor que recebe um PokemonRecord
    public Pokemon(PokemonRecord pokeRecord) {
    this.name = pokeRecord.name();
    this.types = pokeRecord.types().stream()
                            .map(TypeSlot::getType) 
                            .collect(Collectors.toList());
}
    // Construtor vazio para Gson
    public Pokemon() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Pokemon { " +
               "name='" + name + '\'' +
               ", types=" + (types != null ? types : "Nenhum") +
               " }";
    }
}
