public class Fahrzeug{
    String kennzeichen;
    double tagesPreis;
    double kmPreis;
    static double versGebuehr = 20;
    static double einnahme = 0;
    
    //Konstrucktoren
    public Fahrzeug(String kennzeichen, double tagesPreis, double kmPreis){
        this.kennzeichen = kennzeichen;
        this.tagesPreis = tagesPreis;
        this.kmPreis = kmPreis;
    }
    public Fahrzeug(String kennzeichen){
        this.tagesPreis = 25.50;
        this.kmPreis = 0.1;
    }
    
    //get-er
    public String getKennzeichen(){
        return kennzeichen;
    }
    public double getTagesPreis(){
        return tagesPreis;
    }
    public double getKmPreis(){
        return kmPreis;
    }
    public static double getVersGebuehr(){
        return versGebuehr;
    }
    public static double getEinnahme(){
        return einnahme;
    }

    //set-er
    public void setTagesPreis(double preis){
        tagesPreis = preis;
    }
    public void setKmPreis(double preis){
        kmPreis = preis;
    }
    public static void setVersGebuehr(double gebuehr){
        versGebuehr = gebuehr;
    }

    public double mietpreisBer(int dauer, double strecke){
        einnahme += dauer*tagesPreis+strecke*kmPreis+versGebuehr;

        return dauer*tagesPreis+strecke*kmPreis+versGebuehr;
    }

    public void ausgabe(){
        System.out.println(kennzeichen+" "+tagesPreis+" "+kmPreis+" "+versGebuehr);
    }

    public void rechnung(int dauer, double strecke){
        System.out.println("Mietdauer: "+dauer+" Tage Gefahrene Km: "+strecke+" Mietpreis: "+mietpreisBer(dauer,strecke));
    }
    //ohne void, getter
    public static double einnahme(){
        return getEinnahme();
    }
}