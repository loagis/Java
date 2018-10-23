public class Klausurnoten{
  public static void main(String[] args){
    int[] punkte= {30,74,81,67,95,65};
    int[] punktGrenzen= {59,69,79,89};

    verarbeiteKlausurPunktzahl(punkte,punktGrenzen);
  }
  public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen){
    int[] noten = new int[punkte.length];

    for(int i=0;i<punkte.length;i++){
      if(punkte[i]<= 59 && punkte[i]>0){
        noten[i]=5;
      }else if(punkte[i]<= 69 && punkte[i]>60){
        noten[i]=4;
      }else if(punkte[i]<= 79 && punkte[i]>70){
        noten[i]=3;
      }else if(punkte[i]<= 89 && punkte[i]>80){
        noten[i]=2;
      }else{
        noten[i]=1;
      }
    }

    System.out.println(punkte.length);
    besterSchlechtester(noten);
    bestanden(noten);
    durchschnitt(punkte);
    histogram(noten);
  }
  public static void besterSchlechtester(int[] noten){
    int bester=noten[0];
    int schlechtester=0;

    for(int i=0;i<noten.length;i++){
      if(noten[i]<bester){
        bester=noten[i];
      }else if(noten[i]>schlechtester){
        schlechtester=noten[i];
      }
    }

    System.out.println(bester+" "+schlechtester);
  }
  public static void bestanden(int[] noten){
    int bestanden=0;
    int nichtBestanden=0;

    for(int i=0;i<noten.length;i++){
      if(noten[i]<5){
        bestanden+=1;
      }else{nichtBestanden+=1;}
    }

    System.out.println(bestanden+" "+nichtBestanden);
  }
  public static void durchschnitt(int[] punkte){
    int eimer=0;
    int menge = punkte.length;

    for(int i=0;i<punkte.length;i++){
      eimer += punkte[i];
    }

    System.out.println((double)eimer/(double)menge);
  }
  public static void histogram(int[] noten){
    int eins=0;
    int zwei=0;
    int drei=0;
    int vier=0;
    int fünf=0;

    for(int i=0;i<noten.length;i++){
      switch(noten[i]){
        case 1:eins++;
              break;
        case 2:zwei++;
              break;
        case 3:drei++;
              break;
        case 4:vier++;
              break;
        case 5:fünf++;
              break;
      }
    }

    System.out.println("1 "+eins);
    System.out.println("2 "+zwei);
    System.out.println("3 "+drei);
    System.out.println("4 "+vier);
    System.out.println("5 "+fünf);
  }
}
