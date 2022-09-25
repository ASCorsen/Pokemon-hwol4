public class ElectricPokemon extends Pokemon{

    String pokemonType;
    String food;

    public ElectricPokemon(String name, int level, String pokemonType, String food) {
        super(name, level);
        this.pokemonType = pokemonType;
        this.food = food;
    }

    @Override
    void sound() {
        System.out.println("bZzzZZz electric sounds Bzzzz");
    }

    void specialMove(String specialMove){
        System.out.println("This pokemons special move is: " +specialMove);
    }

    void pokemonAvoidance(String avoidance){
        System.out.println("This pokemon attempts to "+ avoidance);
    }
    @Override
    public String toString() {
        return "Type ElectricPokemon{" +
                "name: '" + name + '\'' +
                ", Likes to eat: '" + food + '\'' +
                ", level : " + level +
                '}';
    }
}
