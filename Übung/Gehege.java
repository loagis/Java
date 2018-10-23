public class Gehege {
  int nummer;
  int maxBelegung;
  int akBelegung;
  Tier[] bewohner;

  public Gehege(){
    maxBelegung = 0;
  }
  public Gehege(int zahlBelegung){
    maxBelegung = zahlBelegung;
  }
}
