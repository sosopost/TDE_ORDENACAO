public class Sorts {

    static int comparacoes;
    static int movimentacoes;

    static void copiarVetor(int[] origem, int[] destino, int tam) {
        for (int i = 0; i < tam; i++) {
            destino[i] = origem[i];
        }
    }

    static void imprimirDesempenho(String nome) {
        System.out.println(nome + ": Comparações = " + comparacoes + ", Movimentações = " + movimentacoes);
    }

    static void bubbleFlag(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i < tam - 1; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    movimentacoes += 3;
                    trocou = true;
                }
            }
        }
    }

    static void combSort(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        int gap = tam;
        boolean ordenado = false;

        while (!ordenado) {
            gap = (int)(gap / 1.3);
            if (gap <= 1) {
                gap = 1;
                ordenado = true;
            }
            for (int i = 0; i + gap < tam; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + gap]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    movimentacoes += 3;
                    ordenado = false;
                }
            }
        }
    }

    static void gnomeSort(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        int i = 0;
        while (i < tam) {
            if (i == 0) {
                i++;
            } else {
                comparacoes++;
                if (vetor[i - 1] <= vetor[i]) {
                    i++;
                } else {
                    int temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    movimentacoes += 3;
                    i--;
                }
            }
        }
    }

    static void bucketSort(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        if (tam <= 0) return;

        int max = vetor[0];
        int min = vetor[0];

        for (int i = 1; i < tam; i++) {
            comparacoes += 2;
            if (vetor[i] > max) max = vetor[i];
            if (vetor[i] < min) min = vetor[i];
        }

        int intervalo = max - min + 1;
        int[] contagem = new int[intervalo];

        for (int i = 0; i < tam; i++) {
            contagem[vetor[i] - min]++;
            comparacoes++;
        }

        int k = 0;
        for (int i = 0; i < intervalo; i++) {
            while (contagem[i] > 0) {
                vetor[k++] = i + min;
                contagem[i]--;
                movimentacoes++;
            }
        }
    }

    static void selectionSort(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        for (int i = 0; i < tam - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tam; j++) {
                comparacoes++;
                if (vetor[j] < vetor[menor]) menor = j;
            }
            if (menor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
                movimentacoes += 3;
            }
        }
    }

    static void cocktailSort(int[] vetor, int tam) {
        comparacoes = 0;
        movimentacoes = 0;

        boolean trocou = true;
        int inicio = 0;
        int fim = tam - 1;

        while (trocou) {
            trocou = false;
            for (int i = inicio; i < fim; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    movimentacoes += 3;
                    trocou = true;
                }
            }
            if (!trocou) break;
            trocou = false;
            fim--;
            for (int i = fim - 1; i >= inicio; i--) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    movimentacoes += 3;
                    trocou = true;
                }
            }
            inicio++;
        }
    }

    static void Testar(int[] base, int[] temp, int tam) {
        copiarVetor(base, temp, tam);
        combSort(temp, tam);
        imprimirDesempenho("Comb Sort");

        copiarVetor(base, temp, tam);
        gnomeSort(temp, tam);
        imprimirDesempenho("Gnome Sort");

        copiarVetor(base, temp, tam);
        bucketSort(temp, tam);
        imprimirDesempenho("Bucket Sort");

        copiarVetor(base, temp, tam);
        selectionSort(temp, tam);
        imprimirDesempenho("Selection Sort");

        copiarVetor(base, temp, tam);
        cocktailSort(temp, tam);
        imprimirDesempenho("Cocktail Sort");

        copiarVetor(base, temp, tam);
        bubbleFlag(temp, tam);
        imprimirDesempenho("Bubble Sort (com flag)");
    }
}
