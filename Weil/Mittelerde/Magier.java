public class Magier extends Wesen{
    
    public Magier(String name,int alter){
        super(name,alter);
    }


    public String toString(){
        return name+" ist "+alter+" Jahre alt und hat eine unbegrenzte Lebenserwartung.";
    }
    public boolean lebendig(){
        return true;
    }
    public void heilt(Wesen wesen){
        if(wesen.lebendig()){
            wesen.setLebenserwartung(wesen.stLebenserwartung);
            System.out.println(wesen.name+" wurde geheilt.\n");
        }else{
            System.out.println("Bei "+wesen.name+" ist keine Heilung mehr moeglich.\n");
        }
    }

}