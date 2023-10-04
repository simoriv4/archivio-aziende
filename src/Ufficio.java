package src;
public class Ufficio {
    int numeroPiano;
    int numeroPostazioni;
    String nomeResponsabile;
    String siglaLocale;

    /**
     * costruttore con parametri disposti in ordine tipo di variabili
     * @param numeroPiano
     * @param numeroPostazioni
     * @param nomeResponsabile
     * @param siglaLocale
     */
    Ufficio(int numeroPiano, int numeroPostazioni, String nomeResponsabile, String siglaLocale) {
        this.numeroPiano = numeroPiano;
        this.numeroPostazioni = numeroPostazioni;
        this.nomeResponsabile = nomeResponsabile;
        this.siglaLocale = siglaLocale;
    }

    public String formatForFile() {
        return this.numeroPiano + "\\,"  + this.numeroPostazioni + "\\," + this.nomeResponsabile + "\\," + this.siglaLocale;
    }
}
