package comic_universes;

import dc.characters.DCCharacter;
import marvel.characters.MarvelCharacter;
import dc.events.DCEvent;
import marvel.events.MarvelEvent;

public interface AbstractFactory {
    DCCharacter createDCHero(String name);
    DCCharacter createDCVillain(String name);
    DCEvent createDCEvent(String name);
    MarvelCharacter createMarvelHero(String name);
    MarvelCharacter createMarvelVillain(String name);
    MarvelEvent createMarvelEvent(String name);
}
