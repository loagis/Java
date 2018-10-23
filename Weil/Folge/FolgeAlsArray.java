public class FolgeAlsArray implements Folge {
    int folge[];



    public FolgeAlsArray(){
        this.folge = new int[0];
    }

    public FolgeAlsArray(int a[]){
        this.folge = a;
    }

    public boolean isEmpty(){
        return a.length()==0;
    }

    public boolean equals(Folge f){
        if(f==null || this.length()!=f.length()) return false;
        this.clone();
        f.clone();
        for(int i=0; i<this.length();++i){
            if(aclone.firstValue()!=fclone.firstValue())return false;
            aclone.removeFirst();
            fclone.removeFirst();
        }
        return true;
    }

    public int length(){
        return this.length;
    }
    public int firstValue(){
        return a[0];
    }

    public append(int x);
    removeFirst();
    show();
    Folge clone()
}