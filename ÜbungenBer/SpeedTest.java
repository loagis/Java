import java.util.*;
public class SpeedTest{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double ag = 0;
    double aa = 0;
    double az = 0;
    double gesch = 0;
    double abstand = 0;
    int i = 0;

    while(sc.hasNextDouble()){    //läuft so lange ein double kommt
      double z1 = sc.nextDouble();

      if(z1 == -1){               //sorgt dafür das es bei -1 abbricht
        break;}

      double z2 = sc.nextDouble();//getrennt weil fall nur in 1. variable auftaucht
      i++;                        //zähler für Autos

      if(z1 != 0 && z2 != 0){     //für das ignorieren von ungültigen Werten
        abstand = abstand(az,z2,gesch);//berechnet den abstand
        gesch = kmh(z1,z2);       //berechnet die geschwindigkeit in m/s
        System.out.println(i+" "+(gesch*3.6)+" "+abstand); //printted alles aus un km/h und m
        az = z2;                //übergabe Variable des alten zeitstempels

      if(gesch != 0 && gesch != -1){    //damit nicht werte wie o und -1
        ag = ag+((gesch)*3.6);}           //verarbeitet werden

      if(abstand != 0 && abstand != -1){
        aa = aa+abstand;}}
    }
    double statg = statg(ag,i);       //berechnet die Statistiken
    double stata = stata(aa,i);
    System.out.println(statg+" "+stata);
  }

  public static double kmh(double z1, double z2){
    double gesch = 10/(z2 - z1);
    if(gesch < 1000 && gesch > 0){
    return gesch;
    }else{return 0;}
  }

  public static double abstand(double az, double z2, double gesch){
    if(az == 0){
      return -1;}
    double abstand = (z2 - az) * gesch;
    return abstand;
  }

  public static double statg(double ag,int i){
    return (ag/i);
  }

  public static double stata(double aa, int i){
    return(aa/i);
  }
}
