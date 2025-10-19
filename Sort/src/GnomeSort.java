public class GnomeSort {
    public static Resultado ordenar(int[] arr) {
        int[] array = arr.clone();
        int trocas = 0;
        int comparacoes = 0;
        int iteracoes = 0;

        long inicio = System.nanoTime();

        int i = 0;
        while (i < array.length) {
            iteracoes++;
            if (i == 0 || array[i - 1] <= array[i]) {
                i++;
            } else {
                comparacoes++;
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                trocas++;
                i--;
            }
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1000000.0;

        return new Resultado("Gnome Sort", trocas, comparacoes, iteracoes, tempo, array);
    }
}