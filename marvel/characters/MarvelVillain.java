package marvel.characters;

public class MarvelVillain implements MarvelCharacter {
    private String name;

    public MarvelVillain(String name) {
        this.name = name;
    }

    public String display() {
        return "Marvel Villain: " + name;
    }
}
