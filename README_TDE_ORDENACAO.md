#  TDE – Comparativo de Algoritmos de Ordenação

##  Feito por:
- **Sophia Ploposki**

---

##  Descrição do Projeto

Este trabalho tem como objetivo **implementar e comparar o desempenho** de seis algoritmos de ordenação clássicos e alternativos, sendo eles:

- **Comb Sort**
- **Gnome Sort**
- **Bucket Sort**
- **Bubble Sort (com flag de parada)**
- **Selection Sort**
- **Cocktail Sort**

Foram realizadas medições de **número de trocas entre elementos**, **iterações (passagens de laço)** e **tempo de execução**, utilizando três vetores de tamanhos e ordens diferentes.

A implementação foi feita **sem uso de funções prontas de ordenação**, seguindo as restrições do trabalho.

---

##  Estrutura do Projeto

```
src/
├── Main.java
├── CombSort.java
├── GnomeSort.java
├── BucketSort.java
├── BubbleFlagSort.java
├── SelectionSort.java
├── CocktailSort.java
└── Utils.java
```

---

## Algoritmos Implementados
- Comb Sort
- Gnome Sort
- Bucket Sort
- Bubble Sort (com flag de parada)
- Selection Sort
- Cocktail Sort

---

## Vetores Utilizados

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
```

---

## Resultados Obtidos

### Comb Sort  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 22  
Interações: 129  
Tempo (ns): 220291  

### Gnome Sort  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 78  
Interações: 174  
Tempo (ns): 339916  

### Bucket Sort  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 22  
Interações: 91  
Tempo (ns): 504958  

### Bubble Sort (flag)  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 78  
Interações: 180  
Tempo (ns): 8042  

### Selection Sort  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 18  
Interações: 190  
Tempo (ns): 241042  

### Cocktail Sort  
Vetor ordenado: [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31]  
Trocas: 78  
Interações: 154  
Tempo (ns): 251875  

---

## Comparativo de Desempenho

| Algoritmo         | Trocas | IteraÃ§Ãµes | Tempo (ns) | Melhor em |
|-------------------|---------|------------|-------------|------------|
| Selection Sort    | 18      | 190        | 241042      | Menos trocas |
| Bucket Sort       | 22      | 91         | 504958      | Menos interações |
| Bubble Sort (flag)| 78      | 180        | 8042        | Tempo mais rápido |
| Comb Sort         | 22      | 129        | 220291      |  |
| Gnome Sort        | 78      | 174        | 339916      |  |
| Cocktail Sort     | 78      | 154        | 251875      |  |

---

##  Conclusão

Após a execução dos testes com os três vetores, foi possível observar diferenças significativas entre os algoritmos.  

- **Comb Sort** demonstrou bom desempenho, sendo um dos mais rápidos e com baixo número de trocas.  
- **Bucket Sort** teve resultados variáveis, dependendo da distribuição dos dados.  
- **Bubble Sort com flag** se destacou apenas no vetor já ordenado, parando rapidamente.  
- **Gnome Sort** apresentou desempenho inferior, devido à alta quantidade de trocas.  
- **Selection Sort** teve comportamento estável, mas com muitas comparações.  
- **Cocktail Sort** mostrou leve melhora sobre o Bubble Sort tradicional, mas ainda com alto custo.  

Em resumo:
- Para vetores **quase ordenados**, o **Bubble Sort (flag)** foi mais eficiente.  
- Para vetores **desordenados**, o **Comb Sort** se destacou.  
- Para o **pior caso (inversamente ordenado)**, o **Bucket Sort** obteve os melhores tempos.  

---

## 📁 Link do Projeto

🔗 **GitHub:** [https://github.com/sosopost/TDE_ORDENACAO](https://github.com/sosopost/TDE_ORDENACAO)
