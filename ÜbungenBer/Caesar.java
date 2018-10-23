import java.util.*;
public class Caesar{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  String word = s.next();                    //eingabe Wort
  int shift = s.nextInt();    // eingabe Schlüssel

  System.out.println(krypt(shift, word));   //ausgabe verschlüssektes Wort
  }

  public static String krypt(int shift, String word){
    word = word.toUpperCase();
    char[] letter = word.toCharArray();

    for(int i = 0; i < letter.length; i++) {
      if((letter[i] + shift) > 'Z') {
        letter[i] += shift;
        letter[i] -= 26;
      }
      else if((letter[i]+ shift) < 'A'){
        letter[i] += shift;
        letter[i] += 26;
      }else{
        letter[i] += shift;
      }
    }
    return String.valueOf(letter);
  }
}
