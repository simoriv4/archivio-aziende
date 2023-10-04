package src;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

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
    public Dipendente(int dataNascita, int dataAssunzione, int oreSettimanali, String nome, String cognome, Ufficio ufficioReparto)
    {
        this.dataNascita = dataNascita;
        this.dataAssunzione = dataAssunzione;
        this.oreSettimanali = oreSettimanali;
        this.nome = nome;
        this.cognome = cognome; 
        this.ufficioReparto = ufficioReparto;
    }

    /**
     * salvo sul file il nuovo record contenente le informazioni del dipendete
     * @param nomeFile
     * @return true se corretto
     * @return false se c'è un erroe con il file
     */
    public boolean salvaSuFile(String nomeFile)
    {
        try {
            File f = new File(nomeFile);
            FileWriter fw = new FileWriter(f, true); // apro in append
            fw.write(formatForFile());
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return true;
    }

    public String formatForFile()
    {
        return this.dataNascita + "\\;" + this.dataAssunzione + "\\;" + this.oreSettimanali + "\\;" + this.nome + "\\;" + this.cognome + "\\;" + this.ufficioReparto.formatForFile() + "\\\\;";
    }

}
