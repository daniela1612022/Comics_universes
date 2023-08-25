package dc.movies;

import dc.characters.DCCharacter;
import dc.characters.DCHero;
import dc.characters.DCVillain;
import dc.events.DCEvent;
import marvel.characters.MarvelCharacter;
import marvel.events.MarvelEvent;
import dc.events.DCCanonicalEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import comic_universes.AbstractFactory;

public class DCMovieFactory implements AbstractFactory{
    private List<DCCharacter> characters;
    private List<DCEvent> events;
    private Random random;

    public DCMovieFactory() {
        characters = new ArrayList<>();
        events = new ArrayList<>();
        random = new Random();

        // Agregar héroes
        characters.add(new DCHero("Superman"));
        characters.add(new DCHero("Batman"));
        characters.add(new DCHero("Wonder Woman"));
        characters.add(new DCHero("Flash"));
        characters.add(new DCHero("Aquaman"));

        // Agregar villanos
        characters.add(new DCVillain("Lex Luthor"));
        characters.add(new DCVillain("Joker"));
        characters.add(new DCVillain("Cheetah"));
        characters.add(new DCVillain("Reverse Flash"));
        characters.add(new DCVillain("Black Manta"));

        // Agregar eventos
        events.add(new DCCanonicalEvent("Metropolis Mayhem"));
        events.add(new DCCanonicalEvent("Gotham Chaos"));
        events.add(new DCCanonicalEvent("Justice League Unite"));
        events.add(new DCCanonicalEvent("Villainous Confrontation"));
        events.add(new DCCanonicalEvent("Crisis on Earth"));
    }


    @Override
    public DCCharacter createDCHero(String name) {
        return new DCHero(name);
    }

    @Override
    public DCCharacter createDCVillain(String name) {
        return new DCVillain(name);
    }

    @Override
    public DCEvent createDCEvent(String name) {
        return new DCCanonicalEvent(name);
    }

    @Override
    public MarvelCharacter createMarvelHero(String name) {
        return null;
    }

    @Override
    public MarvelCharacter createMarvelVillain(String name) {
        return null;
    }

    @Override
    public MarvelEvent createMarvelEvent(String name) {
        return null;
    }

    public DCCharacter getRandomCharacter() {
        return characters.get(random.nextInt(characters.size()));
    }

    public DCEvent getRandomEvent() {
        return events.get(random.nextInt(events.size()));
    }
}
