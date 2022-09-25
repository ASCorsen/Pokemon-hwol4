public class Pokemon {
    //- Een Super klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;

    String name;
    int level;


    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;

    }

    void sound(){
        System.out.println("attempts to make sounds: ");
    }
    void pokemonMove(String move){
        System.out.println(name+ "Special move is: "+move );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
