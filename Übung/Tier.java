public class Tier{

  private static int neueNummer = 0; //Zaehler füe alle Tieres

  private int nummer;   //Nummer des Tieres
  private String name;  //Name des Tieres
  private Gehege gehege;//Gehege des Tieres

  public Tier(){
    nummer = ++neueNummer;
    name = "unbekannt";
  }
  public Tier(String tierName){
    nummer = 0;
    name = tierName;
  }
  public Tier(String tierName, int tierNummer){
    nummer = tierNummer;
    name = tierName;
  }

  public static int anzahlTiere(){
    return neueNummer;
  }
  public int getNummer(){
    return nummer;
  }

  public String getName(){    //gibt den Namen aus
    return name;
  }

  public String setName(String neuerName){   //setzt einen neuen Namen
    name = neuerName;
    return name;
  }
}
