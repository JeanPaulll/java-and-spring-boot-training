package alura.applying.object.orientation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainScreen {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.title = "Nome da Música";
        myMusic.artist = "Nome do Artista";
        myMusic.yearLaunch = 2023;
        myMusic.displaysTechnicalSheet();
        myMusic.evaluate(4.5);
        myMusic.evaluate(3.8);
        myMusic.evaluate(5.0);
        double mediaReviews = myMusic.catchMedia();
        System.out.println("Média das avaliações: " + mediaReviews);

        Car mycar = new Car();
        mycar.model = "Gol";
        mycar.year = 2023;
        mycar.color = "Preto";
        mycar.displaysTechnicalSheet();
        System.out.println("Idade do carro: " + mycar.calculateAge() + " anos");

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Movie theMatrix = new Movie();
        theMatrix.setName("The Matrix");
        theMatrix.setReleaseYear(1999);
        theMatrix.setDurationInMinutes(135);
        theMatrix.setIncludedInThePlan(true);
        theMatrix.displaysTechnicalSheet();
        theMatrix.evaluate(9);
        theMatrix.evaluate(8);
        theMatrix.evaluate(9);
        System.out.println("Avaliações do filme:" + theMatrix.catchMedia());

        Movie dogVille = new Movie();
        dogVille.setName("Dog Ville");
        dogVille.setReleaseYear(2003);
        dogVille.setDurationInMinutes(200);
        dogVille.setIncludedInThePlan(false);
        dogVille.displaysTechnicalSheet();
        dogVille.evaluate(4);
        dogVille.evaluate(7);
        dogVille.evaluate(7);
        System.out.println("Avaliações do filme:" + dogVille.catchMedia());

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(theMatrix);
        movies.add(dogVille);
        System.out.println("-------------");

        // ForEach
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
        System.out.println("Quantidade Filmes: " + movies.stream().count());

        // For
        for (int i = 0; i <= movies.size() - 1; i++) {
            System.out.println(movies.get(i).getName());
        }

        movies.stream().forEach((Movie movie) -> System.out.println(movie.getName()));
    }
}
