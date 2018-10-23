public class Konto{
    int anzahl=0;
    private double kontoStand = 100000;
    final int knr;
    String name;

    private Konto(int knr, String name){
        this.knr=knr;
        this.name=name;
    }
    //set-er
    private double setKontostand(double neuKontostand){
        kontoStand = neuKontostand;
        return kontoStand;
    }
    //get-er
    public double getKontostand(){
        return kontoStand;
    }
    

    public double abheben(double menge){
        double kontoAlt;
        
        kontoAlt = getKontostand();
        setKontostand(kontoStand - menge);
        
        ++anzahl;
        return kontoAlt;
    }

    //für einzahlungen
    public double einzahlen(double menge){
        double kontoAlt;

        kontoAlt = getKontostand();
        setKontostand(kontoStand + menge);

        ++anzahl;
        return kontoAlt;
    }
    
    //toString Methode
    public String toString(){
        String text = "Kontoinhaber:"+name+"\n KontoNr.:"+knr+"\n Kontostand:"+getKontostand();
        return text;
    }
    
    //main
    public static void main(String[] args){
        Konto max = new Konto(123456789,"Max Musterfrau");

        max.abheben(100);
        max.einzahlen(50);
        max.abheben(75);
        
        System.out.println("Der Kontostand beträgt "+max.getKontostand()+"€");
        System.out.println("Es wurden "+max.anzahl+" Buchungen getätigt");
        System.out.println(max.toString());
    }
}