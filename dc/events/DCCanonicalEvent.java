package dc.events;

public class DCCanonicalEvent implements DCEvent {
    private String name;

    public DCCanonicalEvent(String name) {
        this.name = name;
    }

    public String display() {
        return "DC Canonical Event: " + name;
    }
}
