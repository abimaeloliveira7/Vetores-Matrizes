# Guia Completo — Estrutura de Dados (Vetores e Matrizes)

Este projeto foi preparado para a disciplina de **Estrutura de Dados** com foco em:

- manipulação de **vetores**;
- manipulação de **matrizes**;
- lógica de **conversão entre bases** (binário e decimal);
- organização e leitura de código Java com boas práticas.

Os exercícios implementados correspondem às páginas **26 a 28** da aula de "Alocação de Memória".

---

## 🎯 Objetivos de aprendizagem

Ao final desta atividade, o(a) aluno(a) deve ser capaz de:

1. percorrer vetores usando laços;
2. criar e preencher matrizes bidimensionais;
3. aplicar algoritmos de inversão e intercalação;
4. converter número binário para decimal e decimal para binário;
5. entender e aplicar transposição de matriz.

---

## 🧱 Estrutura do projeto

```text
Vetores/
├── README.md
├── _pdf/
├── lib/
├── bin/
└── src/
	 ├── App.java
	 ├── Exercicio1.java
	 ├── Exercicio2.java
	 ├── Exercicio3.java
	 ├── Exercicio4.java
	 ├── Exercicio5.java
	 ├── Exercicio6.java
	 └── Exercicio7.java
```

### Função de cada arquivo

- `App.java`: executa todos os exercícios em sequência.
- `Exercicio1.java`: inversão de vetor com 8 posições.
- `Exercicio2.java`: composição de matriz `8x3` a partir de 3 vetores.
- `Exercicio3.java`: binário (vetor de 8 bits) → decimal.
- `Exercicio4.java`: decimal → binário (vetor de 8 bits).
- `Exercicio5.java`: intercalação de dois vetores de 5 posições.
- `Exercicio6.java`: impressão formatada de matriz 2D com `System.out.print`.
- `Exercicio7.java`: transposição de matriz `3x2` para `2x3`.

---

## ⚙️ Requisitos

- **Java JDK 17+** (recomendado);
- VS Code com extensão Java **ou** terminal com `javac` e `java` configurados.

Para verificar no terminal:

```bash
javac -version
java -version
```

---

## ▶️ Como compilar e executar

### Executar todos os exercícios (recomendado para aula)

No terminal, dentro da pasta do projeto:

```bash
javac -d bin src/*.java
java -cp bin App
```

### Executar apenas um exercício

Exemplo com o exercício 4:

```bash
javac -d bin src/*.java
java -cp bin Exercicio4
```

> No Windows PowerShell, os comandos acima funcionam normalmente no projeto atual.

---

## 📘 Resumo dos exercícios (1 ao 7)

### Exercício 1 — Inverter vetor de 8 posições

**Ideia:** criar um novo vetor e preencher do fim para o início.

**Conceitos trabalhados:** indexação, laço `for`, validação de tamanho.

---

### Exercício 2 — Construir matriz `8x3` com 3 vetores

**Ideia:** cada linha da matriz recebe os elementos de mesma posição dos três vetores.

**Conceitos trabalhados:** matriz bidimensional, associação coluna↔vetor.

---

### Exercício 3 — Converter binário (8 bits) para decimal

**Ideia:** percorrer os bits da esquerda para direita acumulando o valor decimal.

**Conceitos trabalhados:** base 2, validação de bits (somente `0` e `1`).

---

### Exercício 4 — Converter decimal para binário (8 bits)

**Ideia:** usar divisões sucessivas por 2 e guardar restos (`%`).

**Conceitos trabalhados:** operador módulo `%`, preenchimento de vetor da direita para esquerda.

---

### Exercício 5 — Intercalar dois vetores de 5 posições

**Ideia:** alternar inserção entre vetor A e vetor B no vetor de saída.

**Conceitos trabalhados:** controle de índice de saída e composição de novo vetor.

---

### Exercício 6 — Imprimir matriz 2D no padrão solicitado

**Ideia:** dois laços (`linha` e `coluna`) e impressão no formato:

`|\tvalor\t|`

**Conceitos trabalhados:** saída formatada, matriz bidimensional.

---

### Exercício 7 — Transpor matriz `3x2` para `2x3`

**Ideia:** trocar posição de linhas por colunas: `transposta[j][i] = original[i][j]`.

**Conceitos trabalhados:** transposição, manipulação de índices em matriz.

---

## 🧪 Estratégia didática sugerida para aula

1. **Executar `App.java`** e observar a saída de cada exercício.
2. Em seguida, abrir exercício por exercício e discutir:
	- entrada;
	- processamento;
	- saída.
3. Propor alterações rápidas em sala:
	- trocar valores de entrada;
	- testar casos inválidos (vetor com tamanho errado, bit inválido etc.);
	- prever o resultado antes de executar.

---

## ✅ Critérios de correção (rubrica rápida)

Sugestão de avaliação por exercício:

- **40%** lógica correta;
- **20%** validações (quando aplicável);
- **20%** organização e legibilidade do código;
- **20%** comentários e explicação da solução.

---

## 🚀 Desafios extras (para aprofundamento)

1. Generalizar o exercício 1 para vetor de tamanho variável.
2. Generalizar o exercício 2 para `n` vetores de mesmo tamanho.
3. No exercício 4, suportar representação com mais de 8 bits.
4. Criar um menu interativo no console para escolher qual exercício rodar.
5. Implementar testes unitários com JUnit.

---

## 🛠️ Solução de problemas comuns

- **`javac` não reconhecido**: verifique instalação/configuração do JDK no `PATH`.
- **Erro de classe não encontrada**: confirme se compilou com `-d bin` e executou com `-cp bin`.
- **Caracteres estranhos no terminal**: ajuste codificação para UTF-8 no terminal/VS Code.

---

## 👨‍🏫 Observação do professor

Este material foi estruturado para facilitar tanto:

- a **demonstração em aula** (com `App.java`), quanto
- o **estudo individual** (execução por arquivo de exercício).
