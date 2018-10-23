import java.util.*;
public class IbanBerechnen{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String laenderkennung = sc.nextString();
    String blz = sc.nextString();
    String nummer = sc.nextString();
  }
  public static String erzeugeIban(String laenderkennung, String blz, String nummer){
    String Iban = lcUpper(laenderkennung)+
    return Iban;
  }
  public static String lcUpper(String laenderkennung){
    laenderkennung = laenderkennung.toUpperCase();
    return laenderkennung;
  }
  public static knlength(String nummer){
    int laenge = nummer.length();
    while(laenge < 10){
      nummer = "0"+nummer;
    }
    return BBAN(blz,nummer);
  }
  public static String BBAN(String blz, String nummer){
    String BBAN = blz+nummer;
    return lwert(BBAN);
  }
  public static String lwert(String BBAN,String laenderkennung){
    String letter = "";
		for (int i = 0; i <= 1; i++) {
			letter += (laenderkennung.charAt(i) - 'A') + 10;
		}
		letter += "00";
    BBAN = BBAN + letter;

		return BBAN;
  }
}
