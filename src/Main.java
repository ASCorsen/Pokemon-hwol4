public class Main {
    public static void main(String[] args) {
        System.out.println("***** Start Terminal *****");

        FirePokemon charizard = new FirePokemon("Charizard",22,"Fire","Firecrackers");

        System.out.println(charizard);
        charizard.sound();
        charizard.specialMove("FIREBALLLTO");
    }


}
