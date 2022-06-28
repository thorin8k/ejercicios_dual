import java.util.Arrays;
import java.util.stream.IntStream;

public class Search {

    //Alternativa con una sola linea
    public static int countAlternative(int[] array, int lesserThan) {
        return (int) Arrays.stream(array).filter(i -> i < lesserThan).count();
    }

    public static int count(int[] array, int lesserThan) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lesserThan) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Simple: ");
        long startTime = System.currentTimeMillis();
        System.out.println(Search.count(new int[]{1, 3, 5, 7}, 8));
        long endTime = System.currentTimeMillis();

        System.out.println("Elapsed: " + (endTime - startTime) + " ms");


        System.out.println("------------");
        int[] generated = generateSorted(1, 9999);

        System.out.println("Medium: ");
        startTime = System.currentTimeMillis();
        System.out.println(Search.count(generated, 99));
        endTime = System.currentTimeMillis();


        System.out.println("Elapsed: " + (endTime - startTime) + " ms");


        System.out.println("------------");
        generated = generateSorted(1, 9999999);

        System.out.println("Large: ");
        startTime = System.currentTimeMillis();
        System.out.println(Search.count(generated, 9999));
        endTime = System.currentTimeMillis();


        System.out.println("Elapsed: " + (endTime - startTime) + " ms");


        System.out.println("------------");
        generated = generateSorted(1, 999999999);

        System.out.println("Huge: ");
        startTime = System.currentTimeMillis();
        System.out.println(Search.count(generated, 99999));
        endTime = System.currentTimeMillis();


        System.out.println("Elapsed: " + (endTime - startTime) + " ms");
    }


    public static int[] generateSorted(final int minVal, final int maxVal) {

        return IntStream.rangeClosed(minVal, maxVal).toArray();
    }

}