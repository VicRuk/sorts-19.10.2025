public class CocktailSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        boolean trocou = true;
        int start = 0;
        int end = array.length - 1;

        while (trocou) {
            iteracoes++;
            trocou = false;

            for (int i = start; i < end; i++) {
                comparacoes++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }

            if (!trocou) break;
            end--;
            trocou = false;

            for (int i = end - 1; i >= start; i--) {
                comparacoes++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            start++;
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Cocktail Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}