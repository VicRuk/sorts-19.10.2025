import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        testar("VETOR 1 [12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28]", vetor1);
        testar("VETOR 2 [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32]", vetor2);
        testar("VETOR 3 [99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6]", vetor3);
    }

    private static void testar(String nome, int[] vetor) {
        System.out.println("\n" + nome);
        System.out.println("----------------------------------------");

        List<Resultado> resultados = new ArrayList<>();
        resultados.add(BubbleSort.ordenar(vetor));
        resultados.add(SelectionSort.ordenar(vetor));
        resultados.add(CocktailSort.ordenar(vetor));
        resultados.add(CombSort.ordenar(vetor));
        resultados.add(GnomeSort.ordenar(vetor));
        resultados.add(BucketSort.ordenar(vetor));

        for (Resultado r : resultados) {
            System.out.println(r);
//            System.out.println(Arrays.toString(r.getResultado()));
        }

        Resultado menosTrocas = null;
        Resultado menosIteracoes = null;
        Resultado maisRapido = null;

        for (Resultado r : resultados) {
            if (menosTrocas == null || r.getTrocas() < menosTrocas.getTrocas()) {
                menosTrocas = r;
            }
            if (menosIteracoes == null || r.getIteracoes() < menosIteracoes.getIteracoes()) {
                menosIteracoes = r;
            }
            if (maisRapido == null || r.getTempo() < maisRapido.getTempo()) {
                maisRapido = r;
            }
        }

        System.out.println("\nMelhor em cada categoria:");
        System.out.println("Menos Trocas: " + menosTrocas.getAlgoritmo());
        System.out.println("Menos Iterações: " + menosIteracoes.getAlgoritmo());
        System.out.println("Mais Rápido: " + maisRapido.getAlgoritmo());
    }
}