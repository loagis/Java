import java.util.*;
public class Oberflaechenentfernung{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double laengeGrad1 = sc.nextDouble();
    double laengeMinute1 = sc.nextDouble();
    double laengeSekunde1 = sc.nextDouble();
    char laengeRichtung1 = 'O';

    double breiteGrad1 = sc.nextDouble();
    double breiteMinute1 = sc.nextDouble();
    double breiteSekunde1 = sc.nextDouble();
    char breiteRichtung1 = 'N';

    double laengeGrad2 = sc.nextDouble();
    double laengeMinute2 = sc.nextDouble();
    double laengeSekunde2 = sc.nextDouble();
    char laengeRichtung2 = 'O';

    double breiteGrad2 = sc.nextDouble();
    double breiteMinute2 = sc.nextDouble();
    double breiteSekunde2 = sc.nextDouble();
    char breiteRichtung2 = 'N';

    System.out.println(entfernung(laengeGrad1,laengeMinute1,laengeSekunde1,laengeRichtung1,
                                  breiteGrad1,breiteMinute1,breiteSekunde1,breiteRichtung1,
                                  laengeGrad2,laengeMinute2,laengeSekunde2,laengeRichtung2,
                                  breiteGrad2,breiteMinute2,breiteSekunde2,breiteRichtung2));
  }
  public static double umrechnen(double grad ,double minute ,double sekunde ,char richtung){
    double wert = grad +(minute/60)+(sekunde/3600);
    wert = wert*Math.PI/180;
    if(richtung == 'S'){
      return (wert*(-1));
    }else if(richtung == 'W'){
      return (wert*(-1));
    }else{return wert;}
  }
  public static double entfernung(double laengeGrad1 ,double laengeMinute1 ,double laengeSekunde1 ,char laengeRichtung1 ,
                                double breiteGrad1 ,double breiteMinute1 ,double breiteSekunde1 ,char breiteRichtung1 ,
                                double laengeGrad2 ,double laengeMinute2 ,double laengeSekunde2 ,char laengeRichtung2 ,
                                double breiteGrad2 ,double breiteMinute2 ,double breiteSekunde2 ,char breiteRichtung2){
      double erdradius = 6378.137;
      double laenge1 = umrechnen(laengeGrad1,laengeMinute1,laengeSekunde1,laengeRichtung1);
      double laenge2 = umrechnen(laengeGrad2,laengeMinute2,laengeSekunde2,laengeRichtung2);
      double breite1 = umrechnen(breiteGrad1,breiteMinute1,breiteSekunde1,breiteRichtung1);
      double breite2 = umrechnen(breiteGrad2,breiteMinute2,breiteSekunde2,breiteRichtung2);

      double distanz = distanz(laenge1,laenge2,breite1,breite2);

      if(distanz>=0){
        return erdradius*distanz;
      }else{return erdradius*(distanz+Math.PI);}
  }
  public static double distanz(double laenge1, double laenge2, double breite1, double breite2){
    return (Math.acos(Math.sin(breite1)*Math.sin(breite2)+Math.cos(breite1)*Math.cos(breite2)*Math.cos(laenge2-laenge1)));
  }
}
