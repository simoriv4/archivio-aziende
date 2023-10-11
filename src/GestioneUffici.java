package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestioneUffici {
    List<Ufficio> archivioUffici;

    public GestioneUffici() {
        this.archivioUffici  = new ArrayList<>();
    }

    /**
     * aggiungo alla lista i dipendenti
     * @param u
     */
    public void add(Ufficio u)
    {
        this.archivioUffici.add(u);
    }

    /**
     * salvo sul file i dipendenti
     * @param nomeFile
     */
    public String serialize()
    {
        String tmp =""; // tmp che conterrà gli uffici serializzati
        for(int i = 0; i< this.archivioUffici.size(); i++)
        {
            tmp += this.archivioUffici.get(i).serialize()+ "\n";
        }
        return tmp;
    }

    // /**
    //  * salvo sulla lista i dipendenti contenuti nel file
    //  * @param nomeFile
    //  * @throws IOException
    //  */
    // public void caricaDaFile(String nomeFile) throws IOException {
    //     File f = new File(nomeFile);
    //     BufferedReader reader = new BufferedReader(new FileReader(f));
    //     String line = "";
    //     while((line = reader.readLine())!= null)
    //     {
    //         String array[] = line.split("\\\\\\\\\\;"); // trovo i dipendenti
    //         for(int i = 0; i<array.length; i++)
    //         {
    //             String[] dipendente = array[i].split("\\\\;");
    //             String[] ufficio = dipendente[dipendente.length-1].split("\\\\,");
    //             Ufficio u = new Ufficio(Integer.parseInt(ufficio[0]), Integer.parseInt(ufficio[1]), ufficio[2], ufficio[3]);
    //             Dipendente d = new Dipendente(Integer.parseInt(dipendente[0]), Integer.parseInt(dipendente[1]), Integer.parseInt(dipendente[2]), dipendente[3], dipendente[4], u);
    //             this.add(d);
    //         }
    //     }
    // }

    /**
     * salvo gli uffici letti dal file deserializzandoli
     * @param nomeFile
     * @throws IOException
     */
    public void deserialize(String nomeFile) throws IOException
    {
        // apro il file in lettura
        File f = new File(nomeFile);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while((line=br.readLine()) != null)
        {
            // deserializzo l'ufficio
            // splitto la linea in modo da ottenere i vari campi
            String[] tmp = line.split(";");
            String str = ""; // stringa parziale per il salvataggio dell'ufficio
            for(int i = 0; i < tmp.length; i++)
            {
                String[] tmp2 = tmp[i].split(":"); // splitto per ":" in modo da ottenere i singoli campi
                switch(tmp2[0])
                {
                    case "i":
                        str+=tmp2[1]+";";
                        break;
                    case "s":
                        str+=tmp2[2] +";"; // salto la lunghezza della stringa
                }
            }
            
            // splitto nuovamente per ";" in modo da ottenere i singoli campi
            tmp = str.split(";");
            // creo l'oggetto ufficio
            Ufficio u = new Ufficio(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]) , Integer.parseInt(tmp[2]), tmp[3], tmp[4], tmp[5]);
            // aggiungo alla lista di uffici l'ufficio
            archivioUffici.add(u);

        }
    }

    /**
     * ritorno la stringa con tutti gli uffici
     * @return
     */
    public String visualizza()
    {
        String tmp = "";
        for(int i = 0; i < this.archivioUffici.size(); i++)
        {
            tmp+=this.archivioUffici.get(i).visualizza()+ "\n";
        }
        return tmp;
    }

    public void salvaSuFile(String nomeFile, String serialized) throws IOException
    {
        // apro il file writer
        File f = new File(nomeFile);
        FileWriter fw = new FileWriter(f);

        // scrivo sul file la stringa di uffici
        fw.write(serialized);

        // chiudo il writer
        fw.close();

    }
}
