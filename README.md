# TDE 3 - Ordenação
Atividade realizada por Victor Ryuki Tamezava
-----
Neste trabalho, foi realizada a análise de desempenho de 6 tipos de algoritmos de ordenação: BubbleSort, BucketSort, CocktailSort, CombSort, GnomeSort, SelectionSort. O objetivo principal é comparar, na prática, a eficiência de cada algoritmo, medindo métricas como tempo de ordenação, número de trocas, comparações e iterações. <br>
Dessa forma, o sistema irá mostrar qual foi melhor em cada categoria:
 - Menos Trocas
 - Menos Iterações
 - Mais Rápido

## 1. Vetor Aleatório:
[12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28]

| Método | Trocas | Comparações | Iterações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 78 | 190 | 19 | 0,0037ms |
| **Selection Sort** | 18 | 190 | 19 | 0,0031ms |
| **Cocktail Sort** | 78 | 154 | 6 | 0,0038ms |
| **Comb Sort** | 22 | 129 | 9 | 0,0030ms |
| **Gnome Sort** | 78 | 78 | 176 | 0,0028ms |
| **Bucket Sort** | 20 | 18 | 20 | 0,1708ms |

Melhor em cada categoria:
- Menos Trocas: Selection Sort
- Menos Iterações: Cocktail Sort
- Mais Rápido: Gnome Sort

## 2. Vetor Ordenado:
[5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32]

| Método | Trocas | Comparações | Iterações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 0 | 190 | 19 | 0,0024ms |
| **Selection Sort** | 0 | 190 | 19 | 0,0021ms |
| **Cocktail Sort** | 0 | 19 | 1 | 0,0005ms |
| **Comb Sort** | 0 | 110 | 8 | 0,0020ms |
| **Gnome Sort** | 0 | 0 | 20 | 0,0020ms |
| **Bucket Sort** | 20 | 18 | 20 | 0,0435ms |

Melhor em cada categoria:
- Menos Trocas: Bubble Sort
- Menos Iterações: Cocktail Sort
- Mais Rápido: Cocktail Sort

## 3. Vetor Decrescente:
[99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6]

| Método | Trocas | Comparações | Iterações | Tempo (ms) |
| :--- | :---: | :---: | :---: | ---: |
| **Bubble Sort** | 190 | 190 | 19 | 0,0123ms |
| **Selection Sort** | 10 | 190 | 19 | 0,0025ms |
| **Cocktail Sort** | 190 | 190 | 10 | 0,0035ms |
| **Comb Sort** | 18 | 129 | 9 | 0,0025ms |
| **Gnome Sort** | 190 | 190 | 400 | 0,0051ms |
| **Bucket Sort** | 20 | 34 | 20 | 0,0399ms |

Melhor em cada categoria:
- Menos Trocas: Selection Sort
- Menos Iterações: Comb Sort
- Mais Rápido: Selection Sort


## Conclusão:
Ao realizar as diferentes formas de ordenação e seu desempenho, podemos concluir:
- Quando a lista já está quase em ordem ou ordenada, **Cocktail Sort** é a melhor opção, pois percebe rápido que está tudo certo e termina logo.
- Para fazer o mínimo de trocas possível, **Selection Sort** procura o menor e troca só quando precisa, ótimo para evitar muitas escritas.
- Quando a lista está bem bagunçada ou decrescente, **Comb Sort** costuma dar menos voltas (menos laços) e o **Selection** continua sendo bom para poucas trocas.
- Para listas pequenas e variadas, o **Gnome Sort** pode ser o mais rápido, simples e direto.
- **Bubble Sort** vale a pena se você sabe que os dados já estão quase ordenados.
- **Bucket Sort** compensa quando os números têm uma distribuição variada e em trabalho de tamanho grande.
