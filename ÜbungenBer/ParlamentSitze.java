public class ParlamentSitze{
  public static void main(String[] args){
    // Datensatz Landtagswahl Schleswig−Holstein 2005
    int maxSitze  = 69;
    final double sperrKlausel = 0.05;
    String[] parteien = {"SPD","CDU","FDP","GRUENE", "SSW","NPD","FAMILIE"};
    int[] stimmen = { 554879, 576095, 94935, 89387, 51920, 27676, 11802};
    // Aufruf  des  Sitzzuteilungsverfahrens
    int[][] sitze = sitzeVerteilung (stimmen, maxSitze, sperrKlausel);
    // Ausgabe der Ergebnisse
    printArray(parteien);
    printArray (sitze);
  }
  public static int[] Hondt(int[] stimmen, int maxSitze){
    int groester;
    int stelle;
    //double hondt[7];
    int plaetze[] = {1,1,1,1,0,0,0};
    sperrKlausel(stimmen);
    for(int i; i <= 69;++i){

      for(int j; i < stimmen.length;++i){
        if(groester != stimmen[j]){
          groester = stimmen[j];
          stelle = j;
        }
      }
      ++plaetze[i];
      stimmen[i] /= plaetze[i];
    }
    return plaetze;
  }
  public static int[] Niemeier(int[] stimmen, int maxSitze){
    int[] plaetze;
    double[] rest;
    int gesamtStimmen;
    int gesamtSitze;
    double groesterRest;
    int stelle;
    sperrKlausel(stimmen);
    for(int i: stimmen){
      gesamtStimmen += i;
    }

    for(int i; i <= stimmen.length;++i){
      plaetze[i] = (int)((stimmen[i]/gesamtStimmen)*maxSitze);
      rest[i] = ((stimmen[i]/gesamtStimmen)*maxSitze)%1;
    }
    for(int i: plaetze){
      gesamtSitze += i;
    }
    int restSitze = 69 - gesamtSitze;
    for(int i;i<=restSitze;++i){
      for(int j; j< rest.length; ++j){
        if(groesterRest != rest[j]){
          groesterRest = rest[j];
          stelle = j;
        }
      }
      ++plaetze[stelle];
      rest[stelle] = 0;
    }
    return plaetze;
  }
  public static int[] SainteLague(int[] stimmen, int maxSitze){
    int gesamtStimmen;
    int stelle;
    double kleinste;
    double[] divisor = {0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
    int[] sitze;
    sperrKlausel(stimmen);
    for(int i: stimmen){
      gesamtStimmen += i;
    }

    for(int i; i < stimmen.length; ++i){
      stimmen[i] = Math.Pow((stimmen[i]/divisor),-1)*gesamtStimmen;
    }
    for(int i; i <= 69; ++i){
      for(int j; j < stimmen.length; ++j){
        if(kleinste>stimmen[j]){
          kleinste=stimmen[j];
          stelle = j;
        }
      }
      sitze[stelle] += 1;
      divisor[stelle] += 1.0;
      stimmen[i] = Math.Pow((stimmen[i]/divisor),-1)*gesamtStimmen;
    }
  }

    /**Sitzverteilung berechnen
    *@param gesamtStimmen Feld mit der Anzahl der Stimmen der einzelnen Parteien
    *Die Feldlaenge entspricht der Anzahl an Parteien.
    *@param maxSitze Anzahl der zu verteilenden Sitze
    *@param sperrKlausel  Sperrklausel (z.B. 0.05 bedeutet 5%)
    *@return Feld, in dem fuer jede Partei die Anzahl an  Sitzen steht
    *(Reihenfolge entsprechend dem Eingabefeld mit Stimmen)
    */
  public static int[][] sitzeVerteilung (int[] stimmen ,int maxSitze ,double sperrKlausel){
    int[][] sitze = new int[7][3];
    int[] hondt;
    int[] niemeier;
    int[] sainteLague;

    hondt = Hondt(stimmen,maxSitze);
    niemeier = Niemeier(stimmen,maxSitze);
    sainteLague = SainteLague(stimmen,maxSitze);

    for(int i;i<hondt.length;++i){
      sitze[0][i] = hondt[i];
    }
    for(int i;i<niemeier.length;++i){
      sitze[1][i] = niemeier[i];
    }
    for(int i;i<sainteLague.length;++i){
      sitze[2][i] = sainteLague[i];
    }
    return sitze;

  }
  public static String printArray(String[] parteien){
    for(String i: parteien){
      System.out.print(i+" ");
    }
  }
  public static String printArray(int[][] sitze){
    for(int i; i < 7; ++i){
      System.out.print(sitze[0][i]);
    }
    for(int i; i < 7; ++i){
      System.out.print(sitze[1][i]);
    }
    for(int i; i < 7; ++i){
      System.out.print(sitze[2][i]);
    }
  }
  public static int[] sperrKlausel(int[] stimmen){
    int gesamtStimmen;
    double sperrKlausel = 0.05;
    for(int i: stimmen){
      gesamtStimmen += i;
    }
    for(int i;i < stimmen.length;++i){
      if(stimmen[i] < sperrKlausel){
        stimmen[i]=0;
      }
    }
    return stimmen;
  }
}
