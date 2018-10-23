public class Wesen{
    String name;
    int alter;
    int lebenserwartung;
    int stLebenserwartung;

    public Wesen(String name,int alter){
        this.name = name;
        this.alter = alter;
    }
    public Wesen(String name, int alter, int lebenserwartung){
        this.name = name;
        this.alter = alter;
        this.lebenserwartung = lebenserwartung;
        this.stLebenserwartung=lebenserwartung;
    }


    public void setLebenserwartung(int i){
        this.lebenserwartung=i;
    }
    public boolean lebendig(){
        return alter<lebenserwartung;
    }
    public void wirdVerwundet(int i){
        lebenserwartung = lebenserwartung - i;
        
        if(lebendig()){
            System.out.println(name+" wurde verwundet, seine Lebenserwartung sinkt auf "+lebenserwartung+".\n");
        }else{
            System.out.println(name+" ist tötlich verletzt.\n");
        }
    }
    public String toString(){
        if(lebendig()){
            return name+" ist "+alter+" Jahre alt und hat eine Lebenserwartung von "+lebenserwartung+" Jahren.";
        }else{
            return name+" ist bereits verstorben.";
        }
    }
    
}