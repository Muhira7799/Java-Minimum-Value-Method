# Java Minimum Value Method

A small Java program that finds the smaller of two integers using a `static` method.

## What It Demonstrates

- Writing a method that takes parameters and returns a value
- Using `if / else` inside a method
- Calling a `static` method directly through the class name

```java
public static int minValue(int n1, int n2) {
    if (n1 > n2) {
        return n2;
    } else {
        return n1;
    }
}
```

## How It Works

1. `main` calls `MinValue.minValue(10, 20)`.
2. The method checks whether `n1 > n2`. Here `10 > 20` is false.
3. The `else` branch runs and returns `n1`, which is `10`.
4. `main` prints the result.

## Output

```
Minimum value is: 10
```

## Results for Different Inputs

| `n1` | `n2` | Result |
|------|------|--------|
| 10 | 20 | 10 |
| 20 | 10 | 10 |
| 7 | 7 | 7 |
| -3 | 5 | -3 |

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac MinValue.java
```

### Run

```bash
java MinValue
```

## Project Structure

```
.
├── MinValue.java
└── README.md
```

## Next Steps

- Write a `maxValue` method
- Find the minimum of three numbers
- Compare with the built-in `Math.min(a, b)`
- Read the two numbers from the user with `Scanner`
