import java.util.Random;
public class Würfel{
    public static int würfeln(){
        Random rand = new Random();
        int wert = rand.nextInt(6) + 1;
        return wert;
    }
}