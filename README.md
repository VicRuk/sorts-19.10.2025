# TDE 3 - Ordenação

## Atividade realizada por Victor Ryuki Tamezava

Neste trabalho, foi realizada a análise de desempenho de 6 tipos de algoritmos de ordenação: BubbleSort, BucketSort, CocktailSort, CombSort, GnomeSort, SelectionSort. O objetivo principal é comparar, na prática, a eficiência de cada algoritmo, medindo métricas como tempo de ordenação, número de trocas, comparações e iterações. <br>
Dessa forma, o sistema irá mostrar qual foi melhor em cada categoria:

  - Menos Trocas
  - Menos Interações
  - Mais Rápido

## 1. Vetor Aleatório:

[12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28]

| Método | Trocas | Comparações | Interações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 78 | 180 | 15 | 0,0038ms |
| **Selection Sort** | 18 | 190 | 19 | 0,0035ms |
| **Cocktail Sort** | 78 | 154 | 6 | 0,0040ms |
| **Comb Sort** | 22 | 129 | 9 | 0,0033ms |
| **Gnome Sort** | 78 | 78 | 176 | 0,0029ms |
| **Bucket Sort** | 7 | 12 | 20 | 0,2398ms |

Melhor em cada categoria:

  - Menos Trocas: Bucket Sort
  - Menos Interações: Cocktail Sort
  - Mais Rápido: Gnome Sort

## 2. Vetor Ordenado:

[5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32]

| Método | Trocas | Comparações | Interações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 0 | 19 | 1 | 0,0008ms |
| **Selection Sort** | 0 | 190 | 19 | 0,0021ms |
| **Cocktail Sort** | 0 | 19 | 1 | 0,0005ms |
| **Comb Sort** | 0 | 110 | 8 | 0,0019ms |
| **Gnome Sort** | 0 | 0 | 20 | 0,0003ms |
| **Bucket Sort** | 0 | 10 | 20 | 0,0646ms |

Melhor em cada categoria:

  - Menos Trocas: Bubble Sort
  - Menos Iterações: Bubble Sort
  - Mais Rápido: Gnome Sort

## 3. Vetor Decrescente:

[99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6]

| Método | Trocas | Comparações | Interações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 190 | 190 | 19 | 0,0038ms |
| **Selection Sort** | 10 | 190 | 19 | 0,0025ms |
| **Cocktail Sort** | 190 | 190 | 10 | 0,0033ms |
| **Comb Sort** | 18 | 129 | 9 | 0,0024ms |
| **Gnome Sort** | 190 | 190 | 400 | 0,0051ms |
| **Bucket Sort** | 47 | 47 | 20 | 0,0503ms |

Melhor em cada categoria:

  - Menos Trocas: Selection Sort
  - Menos Interações: Comb Sort
  - Mais Rápido: Comb Sort

## Conclusão:
Ao realizar as diferentes formas de ordenação e seu desempenho, podemos concluir:
 - Quando a lista já está ordenada, Bubble Sort (com flag) e Cocktail Sort são os melhores, pois percebem na primeira volta e param (1 iteração). O Gnome Sort também foi o mais rápido nesse cenário.
 - Para fazer o mínimo de trocas possível, o Bucket Sort foi o campeão na lista aleatória (7) e o Selection Sort na lista decrescente (10).
 - Quando a lista está bem bagunçada, o Cocktail Sort deu menos voltas (6 iterações). Já na lista decrescente (Vetor 3), o Comb Sort foi o melhor, ganhando em menos iterações (9) e em velocidade.
 - O Gnome Sort foi o mais rápido nos cenários aleatório e ordenado, mas foi o mais lento e com mais iterações (400) no vetor decrescente.
 - O Bucket Sort é ótimo para poucas trocas/comparações se os números são bem distribuídos, mas o tempo dele foi o pior.
