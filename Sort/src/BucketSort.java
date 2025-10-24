import java.util.ArrayList;

public class BucketSort {
    private static class Metricas {
        int trocas = 0;
        int comparacoes = 0;
    }

    private static Metricas sortBucket(ArrayList<Integer> bucket) {
        Metricas metrica = new Metricas();

        for (int i = 1; i < bucket.size(); i++) {
            int key = bucket.get(i);
            int j = i - 1;
            
            while (j >= 0) {
                metrica.comparacoes++;
                if (bucket.get(j) > key) {
                    // Desloca o elemento para a direita
                    bucket.set(j + 1, bucket.get(j));
                    metrica.trocas++;
                    j--;
                } else {
                    // Encontrou a posição
                    break;
                }
            }
            // Coloca em sua posição final
            bucket.set(j + 1, key);
        }
        return metrica;
    }

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
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }
        
        double range = (double) (max - min + 1) / bucketCount;
        if (range == 0) range = 1;

        for (int i = 0; i < array.length; i++) {
            iteracoes++;
            int value = array[i];
            int bi = (int) ((value - min) / range);

            if (bi >= bucketCount) bi = bucketCount - 1;
            if (bi < 0) bi = 0;

            buckets.get(bi).add(value);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            if (!bucket.isEmpty()) {

                Metricas metrica = sortBucket(bucket);
                trocas += metrica.trocas;
                comparacoes += metrica.comparacoes;

                // Remonta
                for (int value : bucket) {
                    array[index++] = value;
                }
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Bucket Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}