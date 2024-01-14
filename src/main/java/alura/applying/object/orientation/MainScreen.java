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
    }
}
