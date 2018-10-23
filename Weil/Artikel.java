public class Artikel{
    String artikelName;
    double einkaufsPreis;
    double verkaufsPreis; 
    public static double einnahmen;
    public static double ausgaben;
    int anzahl;
    public static int gAnzahl;
    //Konstrucktor
    public Artikel(){
        this.anzahl = 0;
    }
    //Konstrucktor
    public Artikel(String artikelName, double einkaufsPreis, double verkaufsPreis){
        this.artikelName = artikelName;
        this.einkaufsPreis = einkaufsPreis;
        this.verkaufsPreis = verkaufsPreis;
    }
    //get-er für den Einkaufspreis der Instanzvariable
    public double getEinkaufspreis(){
        return einkaufsPreis;
    }
    //get-er für Verkaufspreis der Instanzvariable
    public double getVerkaufspreis(){
        return verkaufsPreis;
    }
    //get-er für denArtikelnamen
    public String getArtikelname(){
        return artikelName;
    }
    //get-er für die Stückzahl des Artikels
    public int getAnzahl(){
        return anzahl;
    }
    //set-er für einkaufspreis der Instanzvariable
    public double setEinkaufspreis(double preis){
        einkaufsPreis = preis;
        return einkaufsPreis;
    }
    //set-er für Verkaufspreis der Instanzvariable
    public double setVerkaufspreis(double preis){
        verkaufsPreis = preis;
        return verkaufsPreis;
    }
    //für die addierung der Stückzahlen und anrechnung derAusgaben
    public int einkauf(int stück){
        anzahl += stück;
        ausgaben += stück * einkaufsPreis;
        gAnzahl += stück; 
        return anzahl;
    }
    //für die verringerung der Stückzahl und anrechnung dereinnahmen
    public int verkauf(int stück){
        anzahl -= stück;
        einnahmen += stück * verkaufsPreis;
        gAnzahl -= stück;
        return anzahl;
    }
    //für die Ausgabe des Gewinns
    public static double gewinn(){
        double gewinn;
        gewinn = einnahmen-ausgaben;
        return gewinn;
    }

    public static void main(String[] args){
        Artikel holz = new Artikel("holz", 5, 8);
        Artikel stein = new Artikel("stein", 10, 20);
        
        holz.einkauf(5);
        stein.einkauf(5);

        holz.verkauf(1);
        stein.verkauf(1);

        System.out.println(holz.getAnzahl()+" Holz");
        System.out.println(gAnzahl+" Artikel insgesammt");
        System.out.println(einnahmen+"€ an Einnahmen");
        System.out.println(ausgaben+"€ an Ausgaben");
        System.out.println(gewinn()+"€ Gewinn");
    }
    
}