public class Matrix{
    public static void main(String[] args){

    }
    public static int[] generator(int laenge){
        int [][] matrix = new int[laenge][laenge];

        for(int y =0; y < laenge;y++){      //für die y-Achse
            for(int zaehler = laenge;laenge>0;zaehler--){       //Zahlengenerator
                for(int x=0; x<laenge;x++){     //X-Achse
                    matrix[y][x] = zaehler;
                }
            }
        }
        return matrix;
    }
}