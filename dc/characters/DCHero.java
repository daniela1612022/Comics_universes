package dc.characters;

public class DCHero implements DCCharacter {
    private String name;

    public DCHero(String name) {
        this.name = name;
    }

    public String display() {
        return "DC Hero: " + name;
    }
}
