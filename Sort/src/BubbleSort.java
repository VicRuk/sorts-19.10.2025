public class BubbleSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        boolean trocou = true;

        for (int i = 0; i < array.length - 1 && trocou; i++) {
            iteracoes++;
            trocou = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                comparacoes++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    trocas++;
                    trocou = true;
                }
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Bubble Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}