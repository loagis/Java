public class Skatblatt{
    Karte[] stapel = new Karte[32];
    private static String[] wert = {"7","8","9","10","b","d","k","a"};
    private static String[] farbe = {"Kreuz","Pik","Herz","Karo"};

    public Skatblatt(){
        
        for(int i=0;i<wert.length;i++){
            for(int j=0;j<farbe.length;j++){
                for(int k=0;k<stapel.length;k++){
                    stapel[k]= new Karte(wert[i],farbe[j]);
                }
            }
        }
    }
}