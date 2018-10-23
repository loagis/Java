public class Tag {
  
  private int id;
  

  private String termin =null;
  private int terminpriority = 0;
  
  public Tag(){
    //id = id_;
  }
  
  public void eintragen(String was, int prioritaet){
    this.termin = was;
    this.terminpriority = prioritaet;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getVerabredung() {
    return termin;
  }

  public void setTermin(String termin) {
    this.termin = termin;
  }

  public int getPrioritaet() {
    return terminpriority;
  }

  public void setPriority(int terminpriority) {
    this.terminpriority = terminpriority;
  }
  

}
