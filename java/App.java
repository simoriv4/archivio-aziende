package java;

public class App {
    static final String RESPONSABILE_U1 = "Mario Rossi";
    static final String RESPONSABILE_U2 = "Mario Rossi";  
    static final String RESPONSABILE_U3 = "Luigi Rossi";  
    static final String RESPONSABILE_U4 = "Mario Verdi";  
    static final String RESPONSABILE_U5 = "Simone Gialli";  
    static final String RESPONSABILE_U6 = "Luca Rossi";  
    static final String RESPONSABILE_U7 = "Luca Rossi";  

    public static void main(String[] args) throws Exception {
        Ufficio u1 = new Ufficio(0, 4, RESPONSABILE_U1, "L0");
        Ufficio u2 = new Ufficio(0, 3, RESPONSABILE_U2, "L1");
        Ufficio u3 = new Ufficio(0, 5, RESPONSABILE_U3, "L2");
        Ufficio u4 = new Ufficio(0, 5, RESPONSABILE_U4, "L3");
        Ufficio u5 = new Ufficio(0, 6, RESPONSABILE_U5, "L4");
        Ufficio u6 = new Ufficio(0, 4, RESPONSABILE_U6, "L5");
        Ufficio u7 = new Ufficio(0, 4, RESPONSABILE_U7, "L6");

        Dipendente d1 = new Dipendente(05042005, 12032020, 40, "Mario", "Rossi", u1);             
        Dipendente d2 = new Dipendente(05042005, 12032020, 40, "Luigi", "Rossi", u3);
        Dipendente d3 = new Dipendente(05042005, 12032020, 40, "Simone", "Gialli", u6);
        Dipendente d4 = new Dipendente(05042005, 12032020, 40, "Luca", "Rossi", u7);
        Dipendente d5 = new Dipendente(05042005, 12032020, 40, "Mario", "Verdi", u5);
        Dipendente d6 = new Dipendente(05042005, 12032020, 40, "Simone", "Rossi", u7);
        Dipendente d7 = new Dipendente(05042005, 12032020, 40, "Giovanni", "Blu", u7);
        Dipendente d8 = new Dipendente(05042005, 12032020, 40, "Maria", "Rossi", u7);
        Dipendente d9 = new Dipendente(05042005, 12032020, 40, "Lucia", "Verde", u2);


        

    }
}
