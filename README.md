# 🎯 Design Patterns Lab & Training

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Test Coverage](https://img.shields.io/badge/coverage-98%25-blue)
![Java Version](https://img.shields.io/badge/Java-17%2B-purple)
![License](https://img.shields.io/badge/license-MIT-orange)

Um guia prático e repositório de treinamento focado na implementação de **Padrões de Projeto (Design Patterns - GoF)**. O objetivo deste projeto é demonstrar a transição entre códigos acoplados/legados e arquiteturas desacopladas, limpas e escaláveis.

---

## 📌 Sobre o Repositório

Este repositório funciona como um **laboratório prático hands-on**. Cada módulo de padrão de projeto contém:
1. **Problema do Mundo Real:** Um cenário prático do dia a dia de desenvolvimento.
2. **Implementação Limpa:** Solução aplicando o padrão ideal.


---

## 🏗️ Padrões Implementados

### 🧠 Comportamentais (Behavioral)

#### 1. Strategy
* **Ideia chave:** Troca de algoritmos em tempo de execução.
* **Problema que resolve:** Elimina estruturas extensas de `if/else` ou `switch` ao isolar cada regra de negócio em sua própria classe. Permite adicionar novas regras sem alterar o código existente (**Princípio Aberto/Fechado**).



---

### 📐 Estruturais (Structural)

#### 2. Composite
* **Ideia chave:** Árvore onde item único e grupo usam a mesma interface.
* **Problema que resolve:** Permite tratar objetos individuais e coleções de objetos de maneira uniforme em estruturas hierárquicas (tipo pastas e arquivos).



#### 3. Decorator
* **Ideia chave:** Envelopa o objeto para adicionar recursos sem herança.
* **Problema que resolve:** Adiciona novas responsabilidades a um objeto de forma dinâmica sem alterar a classe original, evitando explosão de subclasses via herança.


---

### 🏭 Criacionais (Creational)

#### 4. Factory Method
* **Ideia chave:** Delega a instanciação (`new`) para as subclasses.
* **Problema que resolve:** Desacopla o código principal da criação de objetos concretos, fazendo com que ele dependa apenas de interfaces ou abstrações.


---

## 💡 Guia Rápido de Memorização

| Padrão | Categoria | Função em uma frase |
| :--- | :--- | :--- |
| **Strategy** | Comportamental | Alterna regras de negócio dinamicamente sem usar `if/else`. |
| **Composite** | Estrutural | Trata um item individual ou um grupo deles com o mesmo comando. |
| **Decorator** | Estrutural | Adiciona "camadas" de funcionalidade ao redor de um objeto existente. |
| **Factory Method** | Criacional | Passa a responsabilidade do `new` para subclasses especializadas. |

