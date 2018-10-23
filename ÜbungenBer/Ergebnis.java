public class Ergebnis{
  Student student;
  float note;
  int punkte;

  public Ergebnis(Student student,float note, int punkte){
    this.student = student;
    this.note = note;
    this.punkte = punkte;
  }
  public String toString(){
    return student+" Note="+note+" Punkte="+punkte;
  }

  public static void main(String[] args){
    Student willi = new Student("Willi" , "Wichtig" , 900);
    Student helga = new Student("Helga" , "Eifrig" , 901);

    Ergebnis e1 = new Ergebnis(willi, 4.0f , 60);
    Ergebnis e2 = new Ergebnis(helga, 1.0f , 118);

    System.out.println(e1);
    System.out.println(e2);
  }
}
