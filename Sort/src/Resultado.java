public class Resultado {
    private String algoritmo;
    private int trocas;
    private int comparacoes;
    private int iteracoes;
    private double tempo;
    private int[] resultado;

    public Resultado(String algoritmo, int trocas, int comparacoes, int iteracoes, double tempo, int[] resultado) {
        this.algoritmo = algoritmo;
        this.trocas = trocas;
        this.comparacoes = comparacoes;
        this.iteracoes = iteracoes;
        this.tempo = tempo;
        this.resultado = resultado;
    }

    public String getAlgoritmo() { return algoritmo; }
    public int getTrocas() { return trocas; }
    public int getComparacoes() { return comparacoes; }
    public int getIteracoes() { return iteracoes; }
    public double getTempo() { return tempo; }
    public int[] getResultado() { return resultado; }

    @Override
    public String toString() {
        return String.format("%-15s | Trocas: %-5d | Comparações: %-5d | Iterações: %-5d | Tempo: %.4f ms",
                algoritmo, trocas, comparacoes, iteracoes, tempo);
    }
}