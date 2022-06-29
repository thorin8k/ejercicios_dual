import java.util.Arrays;

public class Search {
    public static int count(int[] array, int lesserThan) {

        int a = lesserThan;
        int b = 0;
        int contador=0;
        int [] rep = new int[]{};
        int [] arrayCopia = new int[]{};
        Arrays.sort(array);

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    contador++;
                }
            }
        }

        for(int i=0; i<array.length-contador; i++){
            arrayCopia[i]=1;
        }

        System.out.println("contador: "+contador);
        for (int i:array) {
            if(i<a){
                b++;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(Search.count(new int[] { 3, 1, 1, 8, 5 }, 4));
    }
}