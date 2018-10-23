import java.util.Scanner;
public class DatumErweiterung{
  public static void main(String[] args){
    input();
  }

  public static Integer month(int month){
    if (month == 2){
      return 28;
    }else if(month==4||month==6||month==9||month==11){
      return 30;
    }else{return 31;}
  }

  /*Method für die Eingabe */
  public static Integer input(){
    Scanner scanner = new Scanner(System.in);
      //System.out.println("Jahr:");
    int year = scanner.nextInt();
      //System.out.println("Monat:");
    int month = scanner.nextInt();
      //System.out.println("Tag:");
    int day = scanner.nextInt();
      //System.out.println("Stunde:");
    int hour = scanner.nextInt();
      //System.out.println("Minuten:");
    int minute = scanner.nextInt();
      //System.out.println("Minuten zu addieren:");
    int time = scanner.nextInt();

    if(year<=3000&&year>=1600){
      if(month>=1&&month<=12){
        if(day>=1&&day<=month(month)){
          if(hour>=0&&hour<=23){
            if(minute>=0&&minute<=59){
              if(time>=0&&time<=40000){
                scanner.close();
                return Time(year,month,day,hour,minute,time);
              }else{return input();}
            }else{return input();}
          }else{return input();}
        }else{return input();}
      }else{return input();}
    }else{return input();}


  }

  /*Method für die Zeitberechnung*/
  public static Integer Time(int year,int month,int day,int hour,int minute,int time){

    minute += time;       //Zeit wird auf Minuten gerechnet
    hour +=(minute/60);   //überschüssige Minuten werden auf Stunden gerechnet
    minute %= 60;         //überschüssige Minuten werden % auf Minuten gerechnet
    day += (hour/24);     //überschüssige Stunden werden auf Tage gerechnet
    hour %= 24;           //überschüssige Stunden werden % auf Stunden gerechnet
    int nmonth = month + (day/month(month)); //überschüssige Tage werden auf Monat gerechnet
    day %= month(month);                     //überschüssige Tage werden % auf Tag gerechnet
    month = nmonth;
    year +=(month/13);          //überschüssige Monat werden auf Jahr gerechnet
    if(month > 12){
      month = 1;}         //überschüssige Monat werden % auf Monat gerechnet

    System.out.println(year+" "+month+" "+day+" "+hour+" "+minute);
    return 0;
  }
}
