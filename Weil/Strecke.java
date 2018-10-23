public class Strecke{
    Punkt startpunkt;
    punkt endpunkt;
    
    public double startpunkt(){
        return startpunkt;
    }
    public double endpunkt(){
        return endpunkt;
    }
    
    public double setStart(Punkt p){
        this.startpunkt = p;
    }
    public double setEnde(Punkt p){
        this.endpunkt = p;
    }
    
    public double mittelpunkt(){
        double xm = (startpunkt.x+endpunkt.x)/2;
        double ym = (startpunkt.y+startpunkt.x)/2;
        Punkt mittelPunkt = new Punkt(xm,ym);
    }
    public String toString(){
        return "["+startpunkt.toString()+","+endpunkt.toString()+"]";
    }
    public boolean equals(Strecke s){
        return 
    }
    public static void main(String[] args){
        
    }
}