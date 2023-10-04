public class Dipendente {
    int dataNascita;
    int dataAssunzione;
    int oreSettimanali;
    String nome;
    String cognome; 
    Ufficio ufficioReparto;

    /**
     * costruttore con parametri disposti in ordine tipo di variabili
     * @param dataNascita
     * @param dataAssunzione
     * @param oreSettimanali
     * @param nome
     * @param cognome
     * @param uffioReparto
     */
    Dipendente(int dataNascita, int dataAssunzione, int oreSettimanali, String nome, String cognome, Ufficio uffioReparto)
    {
        this.dataNascita = dataNascita;
        this.dataAssunzione = dataAssunzione;
        this.oreSettimanali = oreSettimanali;
        this.nome = nome;
        this.cognome = cognome; 
        this.ufficioReparto = ufficioReparto;
    }

}
