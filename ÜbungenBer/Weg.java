public class Weg {

  private Punkt[] punkte;

  public Weg(int x , int y){
    Punkt p1 = new Punkt(x, y);
    punkte = new Punkt[1];
    punkte[0] = p1;
  }

  public void add(Punkt p){
    Punkt[] punkteNew = new Punkt[punkte.length+1];

    for(int x = 0; x<punkte.length;x++){
      punkteNew[x] = punkte[x];

    }
    
    punkteNew[punkte.length] = p;

    punkte = punkteNew;
  }

  public String toString(){

    String s = punkte[0].toString();
    for(int x = 1; x < punkte.length; x++){
      s = s + "-" + punkte[x].toString();
    }
    return s;
  }

  public void verlaengern(Weg w){
    for(int x = 0; x<w.getPunkte().length;x++){
      this.add(w.getPunkte()[x]);
    }
  }



  public int getAnzahl(){
    return punkte.length;
  }

  public Punkt[] getPunkte(){
    return punkte;
  }
}
