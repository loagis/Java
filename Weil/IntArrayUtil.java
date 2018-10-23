public class IntArrayUtil{

  public static String toString(int a[]){
    String lesbar="";
    for( int i: a ){
	     lesbar = lesbar+" "+i;
     }
     return lesbar;
  }

  public static void reset(int a[]){
    for(int i=0;i<a.length;i++){
      a[i]= 0;
    }
  }

  public static int[] createSequence(int laenge){
    if (laenge<=0){
      int[] b = new int[0];
      return b; 
    }else{
      int[] b= new int[laenge];
      
      for(int i=0;i<laenge;++i){
        b[i] = i+1;
      }

      return b;
    }
  }
}
