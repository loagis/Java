@Service
public class StringCompressor {
    
    public String compress(String uncompressed) {
        int len = uncompressed.length();
        char ch;
        char lastCh;
        int count = 1;
        String compressed;

        for(int i=0;i<=len;i++){
            ch = uncompressed.charAt(i);
            if(lastCh==uncompressed.charAt(i)){
                ++count;
                if(count>=2){
                    
                    for(;i<=len;++i){
                        if(lastCh==uncompressed.charAt(i)){
                           ++count;
                       }else{
                        compressed += count;
                        --i;
                       }
                    }

                }else{compressed += (String)ch;}
            }else{
                compressed += (String)ch;
                lastCh = uncompressed.charAt(i);
            }
        }

        return compressed;
    }
}