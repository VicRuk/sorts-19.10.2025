public class SelectionSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++) {
            iteracoes++;
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                comparacoes++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
                trocas++;
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Selection Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}