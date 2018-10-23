public class ParlamentSitze{
  public static void main(String[] args){
    int maxSitze = 69;
    final double SperrKlausel = 0.05;
    String[] parteien = {"SPD","CDU","FDP","Gruene","SSW","NPD","FAMILIE"};
    int[] stimmen = {554879, 576095,94935,89387,51920,27676,11802};

    int[] sitze = sitzeVerteilung(stimmen, maxSitze, SperrKlausel);

    printArray(parteien);
    printArray(sitze);
  }
  public static int[] sitzeVerteilung(int[] stimmen, int maxSitze, double SperrKlausel){
    int gesamtStimmen=0;
    int stelle=0;
    double kleinste=0;
    double[] divisor = new double[stimmen.length];    //damit es gleich viele Divisor gibt wie Parteien
    int[] sitze = new int[stimmen.length];                    //zum zwischenspeichern und der ausgebe der Sitzplätze

    stimmen = sperrKlausel(stimmen,SperrKlausel);

    for(double i: stimmen){          //für die anzahl aller Gültigen Stimmen
      gesamtStimmen += i;
    }
    double[] rangZahlen = new double[stimmen.length];
    for(int i=0; i < stimmen.length; i++)
      rangZahlen[i] = stimmen[i];
    for(int i=0; i < rangZahlen.length; i++){
      rangZahlen[i] = Math.pow((rangZahlen[i]/divisor[i]),-1)*gesamtStimmen;
    }
    for(int i=0; i <= maxSitze; i++){
      for(int j=0; j < rangZahlen.length; j++){
        if(kleinste>rangZahlen[j] && 0 != rangZahlen[j]){
          kleinste=rangZahlen[j];
          stelle = j;
        }
      }
      sitze[stelle] += 1;
      divisor[stelle] += 1.0;
      rangZahlen[i] = Math.pow((rangZahlen[i]/divisor[i]),-1)*gesamtStimmen;
    }
    return sitze;
  }
  public static int[] sperrKlausel(int[] stimmen, double SperrKlausel){
    int gesamtStimmen = 0;

    for(int i: stimmen)         //für die anzahl aller Gültigen Stimmen
      gesamtStimmen += i;

    for(int i: stimmen){
      if((i/gesamtStimmen)< SperrKlausel){
        i = 0;
      }
    }
    return stimmen;
  }

  public static void printArray(String[] parteien){
    for(String i: parteien){
      System.out.print(i+" ");
    }
    //System.out.print();
  }
  public static void printArray(int[] sitze){
    for(int i: sitze){
      System.out.print(i+" ");
    }
  }
}
