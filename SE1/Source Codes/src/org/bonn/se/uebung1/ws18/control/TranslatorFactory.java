package  org.bonn.de.uebung1.ws18.control;

public class TranslatorFactory{
    public static Translator createGermanTranslator(){
        return new GermanTranslator();
    }
}