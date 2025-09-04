# Projeto de Java Reflection

Este projeto demonstra o uso da **Java Reflection** para realizar tarefas dinâmicas, como a transformação de objetos e a conversão de objetos para o formato **JSON**.  
O objetivo é mostrar como a reflexão permite inspecionar e manipular classes, métodos e campos em tempo de execução.

---

## ✨ Funcionalidades

O projeto possui duas funcionalidades principais:

1. **Transformação de Objetos (Transformator)**  
   Transforma dinamicamente um objeto de entrada (por exemplo, `Filme.java`) em um objeto de saída diferente (como `FilmeDTO.java`).  
   A transformação copia automaticamente os valores de campos que possuem o mesmo **nome** e **tipo**.

2. **Conversão para JSON (ObjectToJson)**  
   Converte qualquer objeto Java em uma string JSON, inspecionando seus campos e valores em tempo de execução.

---

## 🛠 Tecnologias

- **Java 17**
- **Maven**
- **JUnit Jupiter 5.10.1** → testes unitários  
- **Jackson Databind 2.16.0** → geração de JSON

---

## 📂 Estrutura do Projeto

```bash
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br
│   │   │       └── com
│   │   │           └── JavaRelection
│   │   │               ├── Filme.java
│   │   │               ├── FilmeDTO.java
│   │   │               ├── FilmeRepository.java
│   │   │               ├── FilmeService.java
│   │   │               ├── Produtora.java
│   │   │               └── refl
│   │   │                   ├── ObjectToJson.java
│   │   │                   ├── ObjectToJsonTester.java
│   │   │                   └── Transformator.java
│   │   └── resources
│   └── test
│       └── java
│           └── br
│               └── com
│                   └── JavaRelection
│                       └── refl
│                           └── TransformatorTest.java
└── pom.xml

```

## 🚀 Como Executar

### 1. Clonar o repositório

```bash
git clone https://github.com/wellingtonwos/projetojavareflection.git

cd projetojavareflection

mvn clean install

mvn exec:java -Dexec.mainClass="br.com.JavaRelection.refl.ObjectToJsonTester"

mvn test
```
