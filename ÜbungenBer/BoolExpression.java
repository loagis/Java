public class BoolExpression{
  public static void main(String[] args){
    boolean wert1 = false;
    boolean wert2 = true;

    System.out.println(!wert1 & (wert1 | wert2));

    wert1 = true;

    System.out.println(!wert1 & (wert1 | wert2));

  }
}
