public class Kalender {

  public static void main(String[] args) {
    
      Jahr j1 = new Jahr(2015);
      Jahr j2 = new Jahr(2016);
      
      
      j2.eintragen(28, "Klausur", 1);
      j1.eintragen(37, "Treffen", 5);
    
      
      System.out.println(j1.getTermin(28));
      System.out.println(j1.getBelegt() + j2.getBelegt());
  }
  

}
