public class Zoo{
  public static void main(String[] args){
    Tier t1 = new Tier();
    Tier t2 = new Tier("Gerti");

    Gehege g1 = new Gehege();
    Gehege g2 = new Gehege(10);

    String s1 = t1.getName();
    String s2 = t2.getName();

    int tier1 = t2.getNummer();
    int tier2 = t2.getNummer();

    System.out.print(s2);
    System.out.print(tier1);
    System.out.print(tier2);
  }
}
