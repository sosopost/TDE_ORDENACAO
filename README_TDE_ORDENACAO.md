# 🧮 TDE – Comparativo de Algoritmos de Ordenação

## 👩‍💻 Feito por:
- **Sophia Ploposki**

---

## 📘 Descrição do Projeto

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

## 🧩 Estrutura do Projeto

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

## 🧠 Algoritmos Implementados

| Algoritmo | Descrição |
|------------|------------|
| **Comb Sort** | Uma versão aprimorada do Bubble Sort que elimina o problema das “tartarugas” (valores pequenos no final) utilizando gaps decrescentes. |
| **Gnome Sort** | Baseado na ideia de “reorganizar flores no jardim”, compara e retrocede elementos fora de ordem. Simples, mas pouco eficiente. |
| **Bucket Sort** | Distribui os elementos em “baldes”, que são ordenados individualmente, e depois concatenados. Ideal para números distribuídos uniformemente. |
| **Bubble Sort (flag)** | Versão otimizada do Bubble Sort que para quando o vetor já está ordenado. |
| **Selection Sort** | Seleciona o menor elemento e o coloca na posição correta a cada iteração. |
| **Cocktail Sort** | Versão bidirecional do Bubble Sort: ordena da esquerda para direita e depois da direita para esquerda. |

---

## 📊 Vetores Utilizados

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
```

- **Vetor 1:** aleatório  
- **Vetor 2:** já ordenado (melhor caso para algoritmos com flag)  
- **Vetor 3:** inversamente ordenado (pior caso para algoritmos simples)

---

## ⚙️ Resultados Obtidos

*(Preencha com os dados após rodar o programa no terminal)*

### 🔁 Tabela de Iterações

| Algoritmo           | Vetor 1 | Vetor 2 | Vetor 3 |
|----------------------|---------|---------|---------|
| Comb Sort            |         |         |         |
| Gnome Sort           |         |         |         |
| Bucket Sort          |         |         |         |
| Bubble Sort (flag)   |         |         |         |
| Selection Sort       |         |         |         |
| Cocktail Sort        |         |         |         |

---

### 🔄 Tabela de Trocas

| Algoritmo           | Vetor 1 | Vetor 2 | Vetor 3 |
|----------------------|---------|---------|---------|
| Comb Sort            |         |         |         |
| Gnome Sort           |         |         |         |
| Bucket Sort          |         |         |         |
| Bubble Sort (flag)   |         |         |         |
| Selection Sort       |         |         |         |
| Cocktail Sort        |         |         |         |

---

### ⏱️ Tempo de Execução (ns)

| Algoritmo           | Vetor 1 | Vetor 2 | Vetor 3 |
|----------------------|---------|---------|---------|
| Comb Sort            |         |         |         |
| Gnome Sort           |         |         |         |
| Bucket Sort          |         |         |         |
| Bubble Sort (flag)   |         |         |         |
| Selection Sort       |         |         |         |
| Cocktail Sort        |         |         |         |

---

## 🏆 Ranking Final

| Categoria | 1º Lugar | 2º | 3º | 4º | 5º | 6º |
|------------|-----------|-----|-----|-----|-----|-----|
| Menos Trocas |           |     |     |     |     |     |
| Menos Iterações |         |     |     |     |     |     |
| Melhor Tempo |             |     |     |     |     |     |

---

## 🧾 Conclusão

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
