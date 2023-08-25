import dc.MainDC;
import dc.movies.DCMovieFactory;
import marvel.MainMarvel;
import marvel.movies.MarvelMovieFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Comic Universes ===");

        System.out.println("\nDC Universe:");
        MainDC.createRandomCharactersAndEvents(new DCMovieFactory());

        System.out.println("\nMarvel Universe:");
        MainMarvel.createRandomCharactersAndEvents(new MarvelMovieFactory());
    }
}
