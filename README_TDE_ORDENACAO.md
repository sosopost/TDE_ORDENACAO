#  TDE – Ordenação

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

Foram realizadas medições de:
 Número de trocas entre elementos;
 Número de iterações (passagens de laço);
 Tempo de execução (em nanossegundos).
A implementação foi feita sem o uso de funções prontas de ordenação, seguindo as restrições do trabalho.

A implementação foi feita **sem uso de funções prontas de ordenação**, seguindo as restrições do trabalho.

---

##  Estrutura do Projeto

```
src/
src/
├── Main.java
└── Sorts.java

```

---
## Funcionamento
A classe Main contém três vetores de teste, cada um representando uma situação diferente:

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
```


Cada vetor é testado chamando o método:
```java
Sorts.Testar(vetor, temp, tam);
```
que executa todos os algoritmos de ordenação e exibe os resultados obtidos no console.


---

## Resultados Obtidos (Exemplo com Vetor 1)

# Comb Sort
Trocas: 22
Iterações: 129
Tempo: 220.291 ns

# Gnome Sort
Trocas: 78
Iterações: 174
Tempo: 339.916 ns

# Bucket Sort
Trocas: 22
Iterações: 91
Tempo: 504.958 ns

# Bubble Sort (flag)
Trocas: 78
Iterações: 180
Tempo: 8.042 ns

# Selection Sort
Trocas: 18
Iterações: 190
Tempo: 241.042 ns

# Cocktail Sort
Trocas: 78
Iterações: 154
Tempo: 251.875 ns

---

## Comparativo de Desempenho

| Algoritmo          | Trocas | Iterações | Tempo (ns) | Destaque          |
| ------------------ | ------ | --------- | ---------- | ----------------- |
| Selection Sort     | 18     | 190       | 241.042    | Menos trocas      |
| Bucket Sort        | 22     | 91        | 504.958    | Menos iterações   |
| Bubble Sort (flag) | 78     | 180       | 8.042      | Tempo mais rápido |
| Comb Sort          | 22     | 129       | 220.291    | -                 |
| Gnome Sort         | 78     | 174       | 339.916    | -                 |
| Cocktail Sort      | 78     | 154       | 251.875    | -                 |

---

##  Conclusão

Após a execução dos testes com os três vetores, foi possível observar diferenças significativas entre os algoritmos.  

- **Comb Sort** apresentou bom equilíbrio entre tempo e número de trocas.
- **Bucket Sort** teve ótimo desempenho em vetores maiores e mais desordenados.  
- **Bubble Sort com flag** foi o mais rápido quando o vetor já estava ordenado.
- **Gnome Sort** teve desempenho inferior devido ao alto número de trocas. 
- **Selection Sort** manteve comportamento estável, porém com mais comparações.
- **Cocktail Sort** apresentou leve melhora em relação ao Bubble Sort tradicional.

Em resumo:
- Melhor desempenho em vetor já ordenado: **Bubble Sort (flag)**
- Melhor desempenho em vetor aleatório: **Comb Sort**
- Melhor desempenho em vetor decrescente: **Bucket Sort**

---

##  Link do Projeto

🔗 **GitHub:** [https://github.com/sosopost/TDE_ORDENACAO](https://github.com/sosopost/TDE_ORDENACAO)
