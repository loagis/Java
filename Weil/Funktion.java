public class Funktion{

  static int fvonx(int x){
    return 3*x;
  }

  static int gvonx(int x){
    return 5*x-1;
  }

  public static void main(String[] args){
    int x = 1;
    System.out.println("x="+x);
    System.out.println("f°g= "+fvonx(gvonx(x)));
    System.out.println("g°f= "+gvonx(fvonx(x)));
  }
}
