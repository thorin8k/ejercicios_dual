import java.util.Arrays;

public class Main {
    public static int count(int[] array, int lesserThan) {
        int count=0;
        for (int i=0;i<array.length-1;i++){
            if (array[i]==array[i+1]){
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                array=Arrays.copyOf(array,array.length-1);
                i=0;
            }
        }
        Arrays.sort(array);
        for (int elem:array) {
            if (elem<lesserThan){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Main.count(new int[] { 1, 3, 5, 8 }, 10));
    }
}
