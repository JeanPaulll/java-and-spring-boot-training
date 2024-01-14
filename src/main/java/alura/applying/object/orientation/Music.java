package alura.applying.object.orientation;

public class Music {
    String title;
    String artist;
    int yearLaunch;
    double sumDasEvaluations;
    int numAvaluations;

    void displaysTechnicalSheet() {
        System.out.println("Título da música: " + title);
        System.out.println("Artista: " + artist);
        System.out.println("Ano de lançamento: " + yearLaunch);
    }

    void evaluate(double nota) {
        sumDasEvaluations += nota;
        numAvaluations++;
    }

    double catchMedia() {
        return sumDasEvaluations / numAvaluations;
    }
}