# Survival of the Fittest

Alice is watching a game called **Survival of the Fittest**, where **N** people are released into a forest.

You are given an array **A**, where the energy of the **i-th** person is `A[i]`.

During the game:

- One person eats another person until **only one person remains**.
- If a person **B** with energy **`x`** eats a person **C** with energy **`y`**, then B's new energy becomes:

```text
x - y
```

Your task is to determine the **maximum possible energy** of the last remaining person.

> **Note:**
>
> - Energy values can be **negative**.
> - Person indexing starts from **0**.

---

## Example 1

### Input

```text
2
10 8
```

### Output

```text
2
```

### Explanation

The only possible operation is:

```text
10 - 8 = 2
```

Hence, the maximum possible energy of the last remaining person is:

```text
2
```

---

## Example 2

### Input

```text
5
-1 2 0 -2 5
```

### Output

```text
10
```

---

## Constraints

```text
1 ≤ N ≤ 2 × 10^6
1 ≤ |A[i]| ≤ 10^10
```

> **Note:** Although the original statement specifies `1 ≤ A[i] ≤ 10^10`, the examples contain negative values. Therefore, the energy values should be interpreted as allowing both positive and negative integers.

---

## Input Format

### First Line

```text
N
```

- `N` → Number of people.

### Second Line

```text
A0 A1 A2 ... A(N-1)
```

- `A[i]` represents the energy of the `i-th` person.

---

## Output Format

Print a single integer representing the **maximum possible energy** of the last remaining person.

---

## Instructions

- Do **not** use hardcoded input values.
- Read input from **standard input**.
- Print **only** the required answer.
- The solution will be tested against **hidden test cases**.