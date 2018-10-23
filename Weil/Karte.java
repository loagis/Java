public class Karte{

    String wert;
    String farbe;
    int punkte;
    public Karte(String wert, String farbe){
        this.wert = wert;
        this.farbe = farbe;
    }
    public String getWert(){
        return wert;
    }
    public String getFarbe(){
        return farbe;
    }
    public String toString(){
        return wert+" "+farbe;
    }
    public void punkte(){
        switch(getWert()){
            case "7":
                punkte = 0;
                break;
            case "8":
                punkte = 0;
                break;
            case "9":
                punkte = 0;
                break;
            case "b":
                punkte = 2;
                break;
            case "d":
                punkte=3;
                break;
            case "k":
                punkte=4;
                break;
            case "a":
                punkte=11;
                break;
            case "10":
                punkte=10;
                break;
        }
    }

}