import java.util.Scanner;
import java.io.*;
public class vowels {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String word = scanner.next();
    int length = word.length();
    for(int i= 0; i<length; i++){
      boolean bool = letter(word.charAt(i));
      if (bool == false){
        System.out.print(word.charAt(i));
      }
    }
  }
  static boolean letter(char letter){
    boolean val;
    switch (letter) {
      case 'a': val = true;
      case 'e': val = true;
      case 'i': val = true;
      case 'o': val = true;
      case 'u': val = true;
      break;
      default: val = false;
    }
    return val;
  }
}
