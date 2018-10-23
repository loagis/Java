public class Student{
  String vorname;
  String nachname;
  int matrikelnr;

  public Student(String vorname, String nachname, int matrikelnr){
    this.vorname = vorname;
    this.nachname = nachname;
    this.matrikelnr = matrikelnr;

  }

  public String toString(){
    String text = vorname+" "+nachname+" ("+matrikelnr+")";
    return text;
  }
  public static void main(String[] args){
    Student willi = new Student("Willi" , "Wichtig" , 900);
    Student helga = new Student("Helga" , "Eifrig" , 901);
    willi.toString();
    helga.toString();
    System.out.println(willi);
    System.out.println(helga);
  }
}
