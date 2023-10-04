package java;
import java.util.ArrayList;
import java.util.List;

public class Archivio {
    List<Dipendente> archivio;

    public Archivio() {
        this.archivio  = new ArrayList<>();
    }

    /**
     * aggiungo alla lista i dipendenti
     * @param d
     */
    public void add(Dipendente d)
    {
        this.archivio.add(d);
    }

    /**
     * salvo sul file i dipendenti
     * @param nomeFile
     */
    public void salvaSuFile(String nomeFile)
    {
        for(int i = 0; i< this.archivio.size(); i++)
        {
            this.archivio.get(i).salvaSuFile(nomeFile);
        }
    }
}
