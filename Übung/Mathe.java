public class Mathe{
  public Static void main(String[] args){

    int zähler = 0;
    int summe = 0;
    int add = 10;

    while (summe < 17000){
      summe = summe + add;
      add ++;
      zähler ++;
    }
    System.out.println(zähler);
  }
}
