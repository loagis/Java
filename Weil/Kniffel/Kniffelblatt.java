//TODO WürfelProgramm einarbeiten
public class Kniffelblatt{
    int einer;
    int zweier;
    int dreier;
    int vierer;
    int fünfer;
    int sechser;
    int dreierpasch;
    int viererpasch;
    int fullHouse;
    int kleineStraße;
    int großeStraße;
    int kniffel;
    int chance;
    int summeOben;
    int summeUnten;
    int bonus;
    int gesammtSumme;
    String name;

    public Kniffelblatt(String name){
        this.name = name;

        this.einer=null;
        this.zweier=null;
        this.dreier=null;
        this.vierer=null;
        this.fünfer=null;
        this.sechser=null;
        this.dreierpasch=null;
        this.viererpasch=null;
        this.fullHouse=null;
        this.kleineStraße=null;
        this.großeStraße=null;
        this.kniffel=null;
        this.chance=null;
        this.summeOben=null;
        this.summeUnten=null;
        this.bonus=null;
        this.gesammtSumme=null;
    }
    public bool eintragenEiner(int wert){
        if (einer>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.einer = wert;
            return true;
        }
    }
    public bool eintragenZweier(int wert){
        if (zweier>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.zweier = wert;
            return true;
        }
    }
    public bool eintragenDreier(int wert){
        if (this.dreier>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.dreier = wert;
            return true;
        }
    }
    public bool eintragenVierer(int wert){
        if (this.vierer>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.vierer = wert;
            return true;
        }
    }
    public bool eintragenFünfer(int wert){
        if (this.fünfer>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.fünfer = wert;
            return true;
        }
    }
    public bool eintragenSechser(int wert){
        if (this.sechser>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.sechser = wert;
            return true;
        }
    }
    public bool eintragenDreierpasch(int wert){
        if (this.dreierpasch>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.dreierpasch = wert;
            return true;
        }
    }
    public bool eintragenViererpasch(int wert){
        if (this.viererpasch>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.viererpasch = wert;
            return true;
        }
    }
    public bool eintragenFullHouse(int wert){
        if (this.fullHouse>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.fullHouse = wert;
            return true;
        }
    }
    public bool eintragenKleineStraße(int wert){
        if (this.kleineStraße>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.kleineStraße = wert;
            return true;
        }
    }
    public bool eintragenGroßeStraße(int wert){
        if (this.großeStraße>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.großeStraße = wert;
            return true;
        }
    }
    public bool eintragenKniffel(int wert){
        if (this.kniffel>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.kniffel = wert;
            return true;
        }
    }
    public bool eintragenChance(int wert){
        if (this.chance>=0){
            System.out.println("Es ist bereits ein Wert vorhanden");
            return false;
        }else{
            this.chance = wert;
            return true;
        }
    }

    public bool gefüllt(){
        if(einer!=null && zweier!=null && dreier!=null && vierer!=null && fünfer!=null && sechser!=null && dreierpasch!=null viererpasch 
        int fullHouse;
        int kleineStraße;
        int großeStraße;
        int kniffel;
        int chance;
        int summeOben;
        int summeUnten;
        int bonus;
        int gesammtSumme;
        String name;)
    }

    public abrechnen(){
        if(gefüllt()){

        }
    }

}