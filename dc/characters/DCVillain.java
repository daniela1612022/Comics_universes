package dc.characters;

public class DCVillain implements DCCharacter {
    private String name;

    public DCVillain(String name) {
        this.name = name;
    }

    public String display() {
        return "DC Villain: " + name;
    }
}
