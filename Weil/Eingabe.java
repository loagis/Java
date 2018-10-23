import java.util.scanner;

public class Eingabe{
    static int klZahl=0;
    
    public static int rückgabe(int zahl){
        Scanner sc = new Scanner(System.in);
        int nummer = 0;
        while(sc.hasNextInt()){
            nummer = sc.nextInt();
            klZahl(nummer);
            
        }
    }
    public static int klZahl(int nummer){
        if(nummer<=0){
            return klZahl;
        }else if(nummer<klZahl){
            klZahl=nummer;
        }
    }
}