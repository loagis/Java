//@Service
public class StringCompressor {
    
    public static String compress(String uncompressed) {
        int len = uncompressed.length();
        char ch = 0;
        char lastCh = 0;
        int count = 0;
        String compressed = "";

        for(int i=0;i<len;i++){
            System.out.println(uncompressed.charAt(i));
            ch = uncompressed.charAt(i);
            if(lastCh==ch){
                count++;
                if(count>=2){
                    
                    for(;i<len;++i){
                        System.out.println("for schleife");
                        ch = uncompressed.charAt(i);
                        if(lastCh==ch){
                           count++;
                       }else{
                            System.out.println("else block");
                            compressed = compressed+String.valueOf(count);
                            --i;
                            count = 0;
                            break;
                       }
                    }

                }else{compressed = compressed+String.valueOf(ch);}
            }else{
                count = 0;
                compressed = compressed+String.valueOf(ch);
                lastCh = ch;
            }
        }
        System.out.println(compressed+String.valueOf(count));
        return compressed+String.valueOf(count);
    }
    public static void main(String[] args){
        System.out.println("wort ist "+compress("aabbbbcddddddd"));
    }
}