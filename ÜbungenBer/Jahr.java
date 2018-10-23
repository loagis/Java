public class Jahr {
  
  private int jahreszahl;
  private Tag[] tage;
  
  public Jahr(int j){
    jahreszahl = j;
    tage = new Tag[365];
    
    for(int x = 0; x<tage.length; x++){
      tage[x] = new Tag();
    }
  }
  
  public int getBelegt(){
    int x = 0;
    for(Tag t: tage){
      if(t.getVerabredung()!=null){
        x = x+1;
      }
    }
    return x;
  }
  
  public Tag getTagAt(int tag){
    return tage[tag-1];
  }
  
  public void eintragen(int tag, String was , int prioritaet){
    
    if(getTagAt(tag).getVerabredung()==null){
      
        getTagAt(tag).setTermin(was);
        getTagAt(tag).setPriority(prioritaet);
      
    }else{
      
      System.out.println("Fehler: Praktomat");
      
    }
  }
  
  public String getTermin(int tag){
    if(getTagAt(tag).getVerabredung() != null){
       return  getTagAt(tag).getVerabredung();
    }else{
      return null;
    }
  }
  
  public int getPrioritaet(int tag){
    return  getTagAt(tag).getPrioritaet();
  }
  


  
}
