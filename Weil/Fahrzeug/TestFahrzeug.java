public class TestFahrzeug{
    public static void main(String[] args){
        Fahrzeug auto1 = new Fahrzeug("12345678");
        Fahrzeug auto2 = new Fahrzeug("87654321",30.0,0.15);

        auto1.mietpreisBer(2, 100);
        auto1.rechnung(2, 100);

        Fahrzeug.setVersGebuehr(24.00);

        auto2.mietpreisBer(1, 60);
        auto2.rechnung(1, 60);

        auto1.mietpreisBer(3, 120);
        auto1.rechnung(3, 120);

        System.out.println(Fahrzeug.getEinnahme());
    }
}