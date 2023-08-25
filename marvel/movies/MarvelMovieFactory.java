package marvel.movies;

import marvel.characters.MarvelCharacter;
import marvel.characters.MarvelHero;
import marvel.characters.MarvelVillain;
import marvel.events.MarvelEvent;
import marvel.events.MarvelCanonicalEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import comic_universes.AbstractFactory;
import dc.characters.DCCharacter;
import dc.events.DCEvent;

public class MarvelMovieFactory implements AbstractFactory{
    private List<MarvelCharacter> characters;
    private List<MarvelEvent> events;
    private Random random;

    public MarvelMovieFactory() {
        characters = new ArrayList<>();
        events = new ArrayList<>();
        random = new Random();

        // Agregar personajes
        characters.add(new MarvelHero("Iron Man"));
        characters.add(new MarvelHero("Spider-Man"));
        characters.add(new MarvelHero("Thor"));
        characters.add(new MarvelHero("Black Widow"));
        characters.add(new MarvelHero("Hulk"));

        // Agregar villanos
        characters.add(new MarvelVillain("Loki"));
        characters.add(new MarvelVillain("Duende Verde"));
        characters.add(new MarvelVillain("Thanos"));
        characters.add(new MarvelVillain("Craneo Rojo"));
        characters.add(new MarvelVillain("Venom"));

        // Agregar eventos
        events.add(new MarvelCanonicalEvent("Avengers Assemble"));
        events.add(new MarvelCanonicalEvent("Infinity War"));
        events.add(new MarvelCanonicalEvent("Secret Invasion"));
        events.add(new MarvelCanonicalEvent("Dark Reign"));
        events.add(new MarvelCanonicalEvent("Age of Ultron"));
    }


    @Override
    public DCCharacter createDCHero(String name) {
        return null;
    }

    @Override
    public DCCharacter createDCVillain(String name) {
        return null;
    }

    @Override
    public DCEvent createDCEvent(String name) {
        return null;
    }

    @Override
    public MarvelCharacter createMarvelHero(String name) {
        return new MarvelHero(name);
    }

    @Override
    public MarvelCharacter createMarvelVillain(String name) {
        return new MarvelVillain(name);
    }

    @Override
    public MarvelEvent createMarvelEvent(String name) {
        return new MarvelCanonicalEvent(name);
    }

    public MarvelCharacter getRandomCharacter() {
        return characters.get(random.nextInt(characters.size()));
    }

    public MarvelEvent getRandomEvent() {
        return events.get(random.nextInt(events.size()));
    }
}
