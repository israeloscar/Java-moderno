# ☕ Estudos de Java — Java Moderno

Repositório com os exercícios de Java moderno do meu aprendizado de Java.
Iniciado em maio/2026 para conseguir o meu primeiro emprego como desenvolvedor. 🚀

---

## 📁 Estrutura do repositório

```text
Java-moderno/
│
├── README.md
│
└── src/
    │
    ├── streams/
    │   ├── OperacoesStream.java
    │   ├── OperacoesStreamString.java
    │   ├── Produto.java
    │   ├── OperacoesStreamObjetos.java
    │   └── ExemploOptional.java
    │
    ├── var/
    │   ├── CadastroComVar.java
    │   └── FiltroLinguagens.java
    │
    ├── records/
    │   ├── PessoaRecords.java
    │   ├── ProdutoRecords.java
    │   └── LivroRecords.java
    │
    ├── switch_expressions/
    │   ├── MenuUsuario.java
    │   ├── NivelFuncionario.java
    │   └── TipoDia.java
    │
    └── text_blocks/
        ├── MensagemBoasVindas.java
        ├── PaginaHTML.java
        └── ConsultaProdutos.java
```

---

## 🧪 Exercícios

| Arquivo                       | Descrição                                                             | Conceitos praticados                                                                                       |
| ----------------------------- | --------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `OperacoesStream.java`        | Operações com Streams e Lambdas em uma lista de números               | `stream`, `filter`, `map`, `collect`, `mapToInt`, `sum`, `average`, `max`, `OptionalDouble`, `OptionalInt` |
| `OperacoesStreamString.java`  | Operações com Streams e Lambdas em uma lista de Strings               | `stream`, `filter`, `map`, `sorted`, `startsWith`, `toUpperCase`, `collect`                                |
| `Produto.java`                | Classe que representa um produto com nome e preço                     | classes, construtores, `toString`                                                                          |
| `OperacoesStreamObjetos.java` | Operações com Streams em objetos incluindo forEach e method reference | `stream`, `filter`, `sorted`, `Comparator`, `mapToDouble`, `sum`, `map`, `toList`, `forEach`, `::`         |
| `ExemploOptional.java`        | Busca segura de produtos usando Optional                              | `Optional`, `isPresent`, `get`, `orElse`, `findFirst`                                                      |
| `CadastroComVar.java`         | Cadastro simples utilizando inferência de tipo local                  | `var`, inferência de tipo, `ArrayList`, `add`, `printf`                                                    |
| `FiltroLinguagens.java`       | Manipulação de lista de linguagens utilizando var                     | `var`, `ArrayList`, `size`, `getFirst`, `getLast`                                                          |
| `PessoaRecords.java`          | Primeiro contato com Records                                          | `record`, construtor automático, métodos de acesso, `toString`                                             |
| `ProdutoRecords.java`         | Comparação de objetos utilizando Records                              | `record`, `equals`, `toString`, comparação por valor                                                       |
| `LivroRecords.java`           | Prática completa com Records e var                                    | `record`, `var`, `equals`, `toString`, imutabilidade                                                       |
| `MenuUsuario.java`            | Primeiro contato com Switch Expressions                               | `switch expression`, `case ->`, `default`, retorno de valores                                              |
| `NivelFuncionario.java`       | Associação de níveis e cargos utilizando Switch Expression            | `switch expression`, `var`, retorno de valores                                                             |
| `TipoDia.java`                | Agrupamento de múltiplos casos no Switch Expression                   | `switch expression`, múltiplos `case`, `default`                                                           |
| `MensagemBoasVindas.java`     | Primeiro contato com Text Blocks                                      | `text block`, strings multilinha, `var`                                                                    |
| `PaginaHtml.java`             | Representação de HTML utilizando Text Blocks                          | `text block`, HTML, legibilidade                                                                           |
| `ConsultaProdutos.java`       | Representação de consulta SQL utilizando Text Blocks                  | `text block`, SQL, strings multilinha                                                                      |

---

## 🗺️ Plano de estudos

| Fase   | Conteúdo                      | Status          |
| ------ | ----------------------------- | --------------- |
| Fase 1 | Fundamentos de Java           | ✅ Concluído     |
| Fase 2 | POO Avançada e Coleções       | ✅ Concluído     |
| Fase 3 | Java Moderno e Banco de Dados | 🟡 Em andamento |
| Fase 4 | Spring Boot e APIs REST       | ⏳ Pendente      |

### Conteúdos concluídos da Fase 3

* ✅ Streams e Lambdas
* ✅ Optional
* ✅ var
* ✅ Records
* ✅ Switch Expressions
* ✅ Text Blocks

### Próximos tópicos

* ⏳ SQL Básico
* ⏳ JDBC
* ⏳ Maven

---

## 🛠️ Tecnologias

* **Linguagem:** Java 21 ☕
* **IDE:** IntelliJ IDEA Community 💡
* **Controle de versão:** Git + GitHub 🐙

---

## ▶️ Como rodar os exercícios

1. Clone o repositório:

```bash
git clone https://github.com/israeloscar/Java-moderno.git
```

2. Abra a pasta no IntelliJ IDEA 💡

3. Navegue até o arquivo `.java` desejado e execute com `Ctrl + Shift + F10`

Ou pelo terminal:

```bash
javac src/NomeDoArquivo.java
java -cp src NomeDoArquivo
```

---

## 👤 Autor

### Israel Oscar

*Atualizado conforme avanço nos estudos.* 📈
