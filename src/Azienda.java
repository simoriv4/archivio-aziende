package src;

public class Azienda {
    static final int RESPONSABILE_U1 = 1;
    static final int RESPONSABILE_U2 = 2;  
    static final int RESPONSABILE_U3 = 3;  
    static final int RESPONSABILE_U4 = 4;  
    static final int RESPONSABILE_U5 = 5;  
    static final int RESPONSABILE_U6 = 6;  
    static final int RESPONSABILE_U7 = 7;  

    public static void main(String[] args) throws Exception {

        GestioneDipendenti d = new GestioneDipendenti();
        GestioneUffici u = new GestioneUffici();

        d.deserialize("archivio.txt");
        u.deserialize("archivio.txt");
        System.out.println(d.visualizza());

        Ufficio u1 = new Ufficio(0,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u2 = new Ufficio(1,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u3 = new Ufficio(2,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u4 = new Ufficio(3,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u5 = new Ufficio(4,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u6 = new Ufficio(5,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");
        Ufficio u7 = new Ufficio(6,RESPONSABILE_U1, 4, "A1", "Ufficio contabilità", "Piano terra");

        Dipendente d1 = new Dipendente(05042005, 12032020, 40, "Mario", "Rossi", "A1");             
        Dipendente d2 = new Dipendente(05042005, 12032020, 40, "Luigi", "Rossi", "A1");
        Dipendente d3 = new Dipendente(05042005, 12032020, 40, "Simone", "Gialli", "A1");
        Dipendente d4 = new Dipendente(05042005, 12032020, 40, "Luca", "Rossi", "A1");
        Dipendente d5 = new Dipendente(05042005, 12032020, 40, "Mario", "Verdi", "A1");
        Dipendente d6 = new Dipendente(05042005, 12032020, 40, "Simone", "Rossi", "A1");
        Dipendente d7 = new Dipendente(05042005, 12032020, 40, "Giovanni", "Blu", "A1");
        Dipendente d8 = new Dipendente(05042005, 12032020, 40, "Maria", "Rossi", "A1");
        Dipendente d9 = new Dipendente(05042005, 12032020, 40, "Lucia", "Verde", "A1");

        // aggiungo i dipendenti alla lista
        d.add(d1);
        d.add(d2);
        d.add(d3);
        d.add(d4);
        d.add(d5);
        d.add(d6);
        d.add(d7);
        d.add(d8);
        d.add(d9);

        // salvo sul file i nomi dei dipendenti
        d.salvaSuFile("archivio.txt", d.serialize());


    }
}
