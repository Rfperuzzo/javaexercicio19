# 🔁 Repetidor de Texto em Java

Projetinho simples em **Java** para praticar o uso de:

- `Scanner`
- Variáveis
- Entrada de dados
- Estrutura de repetição `for`

## 💻 Como funciona

O programa pede para o usuário:

1. Digitar um texto.
2. Digitar um número.
3. O programa repete o texto a quantidade de vezes informada.

### Exemplo

```text
Digita algo aí
Java

Digita um número
3

Java
Java
Java
```

## 🧠 Código

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, j;
        String texto;

        System.out.println("Digita algo aí");
        texto = scanner.next();

        System.out.println("Digita um número");
        num = scanner.nextInt();

        for (j = 1; j <= num; j = j + 1) {
            System.out.println(texto);
        }
    }
}
```

## 📚 O que estou praticando

Principalmente o funcionamento do `for`:

```java
for (j = 1; j <= num; j = j + 1)
```

Onde:

- `j = 1` → começa contando em 1.
- `j <= num` → continua enquanto `j` for menor ou igual ao número digitado.
- `j = j + 1` → aumenta `j` em 1 a cada repetição.

---

Projeto feito para estudos de **Java e lógica de programação**. ☕
