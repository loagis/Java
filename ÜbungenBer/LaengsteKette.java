import java.util.*;
public class LaengsteKette{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int reihe = 0;
    int akZ = 0;
    int aR = 0;

    while(sc.hasNextInt()){       //liest so lange int kommt
      int i = sc.nextInt();
      if(akZ != i){               //prüft ob eine Reihe vorliegt
        akZ = i;                  //wenn neue Zahl dann wird sie zu akZ
        aR = 1;                   //aR wird auf 1 gesetzt
          if(aR > reihe){         //damit der Fall "Reihenlänge1" aufgefangen wird
            reihe = aR;}
          }else{
            ++aR;                 //falls akZ == i wird die Reihe inkrementiert
          if(aR > reihe){         //zum auffangen der längsten Reihe
            reihe = aR;}}}

    System.out.println(reihe);
    sc.close();
  }
}
