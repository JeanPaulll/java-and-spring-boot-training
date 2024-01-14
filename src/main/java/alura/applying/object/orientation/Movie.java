package alura.applying.object.orientation;

public class Movie {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumDasEvaluations;
    private int totalOfReviews;

    public void displaysTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    public void evaluate(double nota) {
        sumDasEvaluations += nota;
        totalOfReviews++;
    }

    public double catchMedia() {
        return sumDasEvaluations / totalOfReviews;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getIncludedInThePlan() {
        return this.includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalOfReviews() {
        return this.totalOfReviews;
    }

}