package src;
public class Ufficio {
    int ID;
    int idResponsabile;
    int numeroPostazioni;
    String codiceUfficio;
    String nomeUfficio;
    String piano;

    /**
     * costruttore con parametri disposti in ordine tipo di variabili
     * @param iD
     * @param idResponsabile
     * @param numeroPostazioni
     * @param codiceUfficio
     * @param nomeUfficio
     */
    public Ufficio(int iD, int idResponsabile, int numeroPostazioni, String codiceUfficio, String nomeUfficio, String piano) {
        this.ID = iD;
        this.idResponsabile = idResponsabile;
        this.numeroPostazioni = numeroPostazioni;
        this.codiceUfficio = codiceUfficio;
        this.nomeUfficio = nomeUfficio;
        this.piano = piano;
    }

    public String visualizza() {
        return this.ID + ";" + this.codiceUfficio + ";" + this.numeroPostazioni + ";" + this.idResponsabile + ";" + this.nomeUfficio + ";" + this.piano;
    }
     /**
     * serializza in formato serialize php l'ufficio
     * @return
     */
    public String serialize()
    {
        return "i:" + this.ID + ";s:" + this.codiceUfficio.length() + ":" + this.codiceUfficio + ";i:" + this.numeroPostazioni + ";i:" + this.idResponsabile + ";s:" + this.nomeUfficio.length() + ":"+ this.nomeUfficio + ";s:"+ this.piano.length() + ":" + this.piano + ";";
    }
}
