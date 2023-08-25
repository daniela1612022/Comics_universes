package dc;

import dc.events.DCEvent;
import dc.characters.DCCharacter;
import dc.movies.DCMovieFactory;

public class MainDC {
    public static void main(String[] args) {
        System.out.println("DC Universe:");
        createRandomCharactersAndEvents(new DCMovieFactory());
    }

    public static void createRandomCharactersAndEvents(DCMovieFactory factory) {
        for (int i = 0; i < 5; i++) {
            DCCharacter randomCharacter = factory.getRandomCharacter();
            DCEvent randomEvent = factory.getRandomEvent();

            System.out.println(randomCharacter.display() + " en " + randomEvent.display());
        }
    }
}
