public class Gleichung{
    public static String prüfer(double a, double b, double c){
        double d = 0;
        if (a==0){
            if (b==0){
                if (c==0){
                    return "allgemeingültig";
                }else{return "keine Lösung";}
            }else{return "eine Lösung";}
        }else{
            d = b*2-4*a*c;
            if (d<0){
                return "keine Lösung";
            }else{
                if (d==0){
                    return "eine Lösung";
                }else{return "zwei Lösungen";}
            }
        }
    }
}