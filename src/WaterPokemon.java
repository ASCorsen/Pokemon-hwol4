public class WaterPokemon extends Pokemon{

    String pokemonType;
    String food;

    public WaterPokemon(String name, int level, String pokemonType, String food) {
        super(name, level);
        this.pokemonType = pokemonType;
        this.food = food;
    }
    @Override
    void sound() {
        System.out.println("blupbluppp watersounds splashplash");
    }

    void specialMove(String specialMove){
        System.out.println("This pokemons special move is: " +specialMove);
    }

    void pokemonAvoidance(String avoidance){
        System.out.println("This pokemon attempts to "+ avoidance);

    }

    @Override
    public String toString() {
        return "Type WaterPokemon{" +
                "name: '" + name + '\'' +
                ", Likes to eat: '" + food + '\'' +
                ", level : " + level +
                '}';
    }
}
