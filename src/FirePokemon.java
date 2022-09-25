public class FirePokemon extends Pokemon {

    String pokemonType;
    String food;


    public FirePokemon(String name, int level, String pokemonType, String food) {
        super(name, level);
        this.pokemonType = pokemonType;
        this.food = food;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    void sound() {
        System.out.println("SHHHHHhhaaaa firesounds SSShhhhh");
    }

   void specialMove(String specialMove){
       System.out.println("This pokemons special move is: " +specialMove);
   }

    @Override
    public String toString() {
        return "Type FirePokemon{" +
                "name: '" + name + '\'' +
                ", Likes to eat: '" + food + '\'' +
                ", level : " + level +
                '}';
    }
}
