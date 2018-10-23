public class Punkt {
	
	// Instanzattribute
	
	private double x; 
	private double y; 
	
	// Konstruktoren
	
	public Punkt() {
	}
	
	public Punkt(double x, double y) {
	    this.x = x;
	    this.y = y;
	}
	
	public Punkt(Punkt p) {
	    this(p.x, p.y);
	}
	
	// Instanzmethoden
	
	public double x() {
	    return x;
	}
	
	public double y() {
	    return y;
	}
	
	public String toString() {
	    return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Punkt p) {
	    return x == p.x && y == p.y; 
	 }
}
