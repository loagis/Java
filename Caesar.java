import java.util.*;
public class Caesar{
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int k = s.nextInt();
    String cb = s.next();
    char b = cb.charAt(0);

    char index = (char) (b- 'A');

    char resultatB = (char) (((k + index)%26)+'A');

    System.out.println(resultatB);
    s.close();
  }
}
