import java.util.*;
public class Palindromzahl{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int invZahl = 0;
    int zahl = sc.nextInt();

    System.out.println(spiegeln(zahl));
    System.out.println(spiegelAddieren(zahl));
    invZahl = zahl;
    while(palindromTest(invZahl) != false){
      invZahl = spiegelAddieren(invZahl);
      //System.out.println(zahl);
    }
    System.out.println(invZahl);
  }
  public static int spiegeln(int zahl){
    int invZahl;
    
    invZahl = (zahl/100);
    invZahl += ((zahl%100)/10)*10;
    invZahl += (zahl%10)*10*10;
    return invZahl;
  }
  public static int spiegelAddieren(int zahl){
    int invZahl = spiegeln(zahl);

    int addZahl = invZahl + zahl;
    return addZahl;
  }
  public static boolean palindromTest(int zahl){
    int invZahl = spiegeln(zahl);
    if(invZahl == zahl){
      return true;
    }else{return false;}
  }
}
