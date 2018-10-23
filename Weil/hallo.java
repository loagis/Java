public class hallo{
    static int i = 0;
    static void hallo(){
        ++i;
        System.out.println("Hallo zum "+i+"-ten.");
    }

    public static void main(String[] args){
        hallo();
        hallo();
        hallo();
    }
}