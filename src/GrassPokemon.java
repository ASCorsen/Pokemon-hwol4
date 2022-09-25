public class GrassPokemon extends Pokemon{

    String pokemonType;
    String food;

    public GrassPokemon(String name, int level, String pokemonType, String food) {
        super(name, level);
        this.pokemonType = pokemonType;
        this.food = food;
    }

    @Override
    void sound() {
        System.out.println("I am groot tree sounds");
    }

    void specialMove(String specialMove){
        System.out.println("This pokemons special move is: " +specialMove);
    }

    void pokemonAvoidance(String avoidance){
        System.out.println("This pokemon attempts to "+ avoidance);
    }

    @Override
    public String toString() {
        return "Type GrassPokemon{" +
                "name: '" + name + '\'' +
                ", Likes to eat: '" + food + '\'' +
                ", level : " + level +
                '}';
    }
}
