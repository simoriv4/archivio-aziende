package src;

import java.io.File;
import java.io.FileWriter;

public class Dipendente {
    int ID;
    int dataNascita;
    int dataAssunzione;
    int oreSettimanali;
    String nome;
    String cognome; 
    String codiceufficioReparto;

    /**
     * costruttore con parametri disposti in ordine tipo di variabili
     * @param dataNascita
     * @param dataAssunzione
     * @param oreSettimanali
     * @param nome
     * @param cognome
     * @param uffioReparto
     */
    public Dipendente(int dataNascita, int dataAssunzione, int oreSettimanali, String nome, String cognome, String codiceufficioReparto)
    {
        this.dataNascita = dataNascita;
        this.dataAssunzione = dataAssunzione;
        this.oreSettimanali = oreSettimanali;
        this.nome = nome;
        this.cognome = cognome; 
        this.codiceufficioReparto = codiceufficioReparto;
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
            fw.write(serialize());
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return true;
    }

    public String visualizza()
    {
        return this.ID +";" + this.dataNascita + ";" + this.dataAssunzione + ";" + this.nome + ";"+ this.cognome;
    }

    /**
     * serializza in formato serialize php il dipendente
     * @return
     */
    public String serialize()
    {
        return "i:" + this.ID +";i:" + this.dataNascita + ";i:" + this.dataAssunzione + ";s:"+ this.codiceufficioReparto.length()  + ";s:" + this.nome.length() + ":"+ this.nome + ";s:" + this.cognome.length() + ":"+ this.cognome + ";";
    }

}
