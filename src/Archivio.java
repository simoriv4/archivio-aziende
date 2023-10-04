package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    /**
     * salvo sulla lista i dipendenti contenuti nel file
     * @param nomeFile
     * @throws IOException
     */
    public void caricaDaFile(String nomeFile) throws IOException {
        File f = new File(nomeFile);
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = "";
        while((line = reader.readLine())!= null)
        {
            String array[] = line.split("\\\\\\\\\\;"); // trovo i dipendenti
            for(int i = 0; i<array.length; i++)
            {
                String[] dipendente = array[i].split("\\\\;");
                String[] ufficio = dipendente[dipendente.length-1].split("\\\\,");
                Ufficio u = new Ufficio(Integer.parseInt(ufficio[0]), Integer.parseInt(ufficio[1]), ufficio[2], ufficio[3]);
                Dipendente d = new Dipendente(Integer.parseInt(dipendente[0]), Integer.parseInt(dipendente[1]), Integer.parseInt(dipendente[2]), dipendente[3], dipendente[4], u);
                this.add(d);
            }
        }
    }

    public String visualizza()
    {
        String tmp = "";
        for(int i = 0; i < this.archivio.size(); i++)
        {
            tmp+=this.archivio.get(i).formatForFile()+ "\n";
        }
        return tmp;
    }
}
