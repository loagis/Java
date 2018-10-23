public interface Folge{
    Folge clone();
    boolean isEmpty();
    boolean equals(Folge f);
    int length();
    int firstValue();
    append(int x);
    removeFirst();
    show();
}

