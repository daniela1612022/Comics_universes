package marvel.characters;

public class MarvelHero implements MarvelCharacter {
    private String name;

    public MarvelHero(String name) {
        this.name = name;
    }

    public String display() {
        return "Marvel Hero: " + name;
    }
}
