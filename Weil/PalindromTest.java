import java.util.*;
public class PalindromTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Wort ein.");
        String wort = sc.nextLine();
        sc.close();
        
        System.out.println(Palindrom.palindromTest(wort.toLowerCase()));
      }
}
