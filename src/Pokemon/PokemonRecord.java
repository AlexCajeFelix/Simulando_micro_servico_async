package Pokemon;
import java.util.List;
import Pokemon.Type.TypeSlot;

public record PokemonRecord(String name, List<TypeSlot> types) {}
