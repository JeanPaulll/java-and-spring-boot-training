package alura.applying.object.orientation;

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
        System.out.println("--------------");
        Car mycar = new Car();
        mycar.model = "Gol";
        mycar.year = 2023;
        mycar.color = "Preto";
        mycar.displaysTechnicalSheet();
        System.out.println("Idade do carro: " + mycar.calculateAge() + " anos");
        System.out.println("--------------");
        Film favorite = new Film();
        favorite.setName("The Matrix");
        favorite.setReleaseYear(1999);
        favorite.setDurationInMinutes(135);
        favorite.setIncludedInThePlan(true);
        favorite.displaysTechnicalSheet();
        favorite.evaluate(9);
        favorite.evaluate(8);
        favorite.evaluate(9);
        System.out.println("dia de avaliações do filme:" + favorite.catchMedia());
    }
}
