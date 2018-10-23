public class Zinsen{

  public static void main(String[] args){
    double K0 = Double.parseDouble(args[0]);
    double p = Double.parseDouble(args[1]);
    double n = Double.parseDouble(args[2]);
    double m = Double.parseDouble(args[3]);

    double EV = K0 * (1+(p/100)*n);
    double ZZ = K0*Math.pow(1+(p/100),n);
    double EuV = K0*Math.pow(1+((p/100)/m),m*n);

    System.out.println(EV);
    System.out.println(ZZ);
    System.out.println(EuV);

  }
}
