public class Tarif{
  static void tarif1(int minute){
    double bt1 = 12.75;
    double k1;

    k1 = bt1 + minute*0.05;

    System.out.println("Bei "+minute+" Gesprächsminuten bezahlt man beim ersten Tarif "+k1+"€");
  }
  static void tarif2(int minute){
    double bt2 = 22.98;
    double k2;

    k2 = bt2 + minute*0.02;

    System.out.println("Bei "+minute+" Gesprächsminuten bezahlt man beim zweiten Tarif "+k2+"€");
  }
  public static void main(String[] args){
    int minute = 22;

    tarif1(minute);
    tarif2(minute);
  }
}
