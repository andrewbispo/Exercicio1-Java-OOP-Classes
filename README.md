# 📐 Rectangle Calculator

Um programa simples em Java que calcula a **área**, **perímetro** e **diagonal** de um retângulo a partir de sua largura e altura.

## 🚀 Funcionalidades

O programa realiza as seguintes operações:

1. Solicita ao usuário dois valores: **largura** e **altura** do retângulo
2. Utiliza os métodos da classe `Rectangle` para calcular:
   - `area()` - calcula a área do retângulo
   - `perimeter()` - calcula o perímetro
   - `diagonal()` - calcula a diagonal
3. Exibe os resultados formatados com duas casas decimais

## 📋 Exemplo de Uso

### Entrada
```
Enter rectangle width and height:
3.0
4.0
```

### Saída
```
AREA = 12.00 m²
PERIMETER = 14.00 m
DIAGONAL = 5.00 m
```

## 📁 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java
└── entities/
    └── Rectangle.java
```

## 🔧 Classe Rectangle

A classe `Rectangle` deve conter os seguintes atributos e métodos:

```java
public class Rectangle {
    public double w;      // largura
    public double h;      // altura
    
    public double area() { ... }        // retorna a área
    public double perimeter() { ... }   // retorna o perímetro
    public double diagonal() { ... }    // retorna a diagonal
}
```

## ▶️ Como Executar

### No terminal (Windows/Linux/Mac)

```bash
javac src/application/Program.java src/entities/Rectangle.java
java -cp src application.Program
```

Ou, se usando um IDE como Eclipse ou IntelliJ, basta executar a classe `Program.java` diretamente.

## 📌 Observações Importantes

- O programa utiliza `Locale.US` para garantir o uso do **ponto** como separador decimal
- Os resultados são exibidos em **metros (m)** e **metros quadrados (m²)**
- O programa aceita valores decimais como entrada
- Os cálculos utilizam a fórmula da diagonal: `√(w² + h²)`

## 💡 Fórmulas Utilizadas

- **Área**: `A = largura × altura`
- **Perímetro**: `P = 2 × (largura + altura)`
- **Diagonal**: `D = √(largura² + altura²)`

---

**Desenvolvido em Java** ☕
