package marvel;

import marvel.characters.MarvelCharacter;
import marvel.events.MarvelEvent;
import marvel.movies.MarvelMovieFactory;

public class MainMarvel {
    public static void main(String[] args) {
        System.out.println("Marvel Universe:");
        createRandomCharactersAndEvents(new MarvelMovieFactory());
    }

    public static void createRandomCharactersAndEvents(MarvelMovieFactory factory) {
        for (int i = 0; i < 5; i++) {
            MarvelCharacter randomCharacter = factory.getRandomCharacter();
            MarvelEvent randomEvent = factory.getRandomEvent();

            System.out.println(randomCharacter.display() + " en " + randomEvent.display());
        }
    }
}
