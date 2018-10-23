public class Time{
  static int time(int day, int hour, int minute, int sec){

    hour += day * 24;
      minute += hour * 60;
        sec += minute *60;

    return sec;
  }

  public static void main(String[] args){
    int day = 27;
    int hour = 3;
    int minute = 7;
    int sec = 0;

    System.out.println(day+" Tage, "+hour+" Stunden, "+minute+" Minuten und "+sec+" Sekunden entsprechen "+time(day,hour,minute,sec)+" Sekunden");
  }
}
