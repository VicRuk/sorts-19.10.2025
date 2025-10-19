public class CombSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        int gap = array.length;
        double shrink = 1.3;
        boolean sorted = false;

        while (!sorted) {
            iteracoes++;
            gap = (int)(gap / shrink);
            if (gap <= 1) {
                gap = 1;
                sorted = true;
            }

            for (int i = 0; i + gap < array.length; i++) {
                comparacoes++;
                if (array[i] > array[i + gap]) {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                    trocas++;
                    sorted = false;
                }
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Comb Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}