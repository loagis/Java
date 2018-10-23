public class Palindrom{
    
    public static String spiegeln(String wort){
        String invWort = "";
        
        for(int i = wort.length() ; i>0 ; i--){
            invWort += wort.substring(i-1,i);
        }

        return invWort;
    }
    public static boolean palindromTest(String wort){
        
        if(spiegeln(wort).equals(wort)){
            return true;
        }else{return false;}

    }
}
