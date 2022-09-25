public class Main {
    public static void main(String[] args) {
        System.out.println("***** Start Terminal *****");

        FirePokemon charizard = new FirePokemon("Charizard",22,"Fire","Firecrackers");

        System.out.println(charizard);
        charizard.sound();
        charizard.specialMove("FIREBALLLTO");


        WaterPokemon blastoise = new WaterPokemon("Blastoise",1337,"WaterPokemon","fishsticks");
        System.out.println(blastoise);
        blastoise.sound();
        blastoise.specialMove("WATERSPLASH BLASSTTT!!!!");
        blastoise.pokemonAvoidance("Jump in water");

        GrassPokemon groot = new GrassPokemon("Groot",1,"GrassPokemon","Vegan");
        System.out.println(groot);
        groot.sound();
        groot.specialMove("Calls the Avengers");
        groot.pokemonMove("Moves very slow");
        groot.pokemonAvoidance("Make's tree branches fall");

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu",14,"ElectricPokemon","Pizza");
        System.out.println(pikachu);
        pikachu.sound();
        pikachu.specialMove("kamehameha");
        pikachu.pokemonAvoidance("jumps left and right");
        pikachu.pokemonMove("Can use dash");
        // Waarom kan ik niet in een sout een method aanroepen van een sub-klassse?
//        System.out.println(pikachu.getName()+pikachu.specialMove("Jump?");); off
//        pikachu.getName() + pikachu.specialMove("jump");
    }


}
