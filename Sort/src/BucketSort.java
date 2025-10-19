import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        if (array.length == 0) {
            return new Resultado("Bucket Sort", 0, 0, 0, 0, array);
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        int bucketCount = 10;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        double range = (max - min + 1.0) / bucketCount;

        for (int i = 0; i < array.length; i++) {
            iteracoes++;
            int bucketIndex = (int)((array[i] - min) / range);
            if (bucketIndex >= bucketCount) bucketIndex = bucketCount - 1;
            buckets.get(bucketIndex).add(array[i]);
        }

        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            ArrayList<Integer> bucket = buckets.get(i);
            if (!bucket.isEmpty()) {
                Collections.sort(bucket);
                comparacoes += bucket.size() * (int)(Math.log(bucket.size()) / Math.log(2));
                for (int value : bucket) {
                    array[index++] = value;
                    trocas++;
                }
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Bucket Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}