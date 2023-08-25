package marvel.events;

public class MarvelCanonicalEvent implements MarvelEvent {
    private String name;

    public MarvelCanonicalEvent(String name) {
        this.name = name;
    }

    public String display() {
        return "Marvel Canonical Event: " + name;
    }
}