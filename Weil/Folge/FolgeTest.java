public class FolgeTest{
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        Folge test = null;
        FolgeAlsArray test2 = new FolgeAlsArray(a);

        
        test2.lastValue();
        if(test instanceof FolgeAlsArray) 
            ((FolgeAlsArray) test).lastValue()

        test.equals(test2);
    }
}