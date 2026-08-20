# Java Datatypes

Java has **8 primitive data types**:

*`char`, `boolean`, `byte`, `short`, `int`, `long`, `float`, and `double`.*

For this exercise, we will work with the primitive data types used to store integer values:

- `byte`
- `short`
- `int`
- `long`

Their sizes are:

- A `byte` is an **8-bit signed integer**.
- A `short` is a **16-bit signed integer**.
- An `int` is a **32-bit signed integer**.
- A `long` is a **64-bit signed integer**.

Given an input integer, determine which of these primitive data types are capable of properly storing that value.

> A portion of the solution may already be provided in the editor.

**Reference:** :contentReference[oaicite:0]{index=0}

---

## Input Format

The first line contains an integer `T`, denoting the number of test cases.

Each of the next `T` lines contains a single integer `n`, which may be arbitrarily large or small.

---

## Output Format

For each input value `n`, determine which of the following primitive data types can store it:

- `byte`
- `short`
- `int`
- `long`

If `n` can be stored in one or more of these data types, print:

```text
n can be fitted in:
* dataType
```

If more than one data type can store the value, print each suitable data type on a separate line, ordered by increasing size:

```text
byte
short
int
long
```

If the number cannot be stored in any of the four primitive data types, print:

```text
n can't be fitted anywhere.
```

---

## Sample Input

```text
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

---

## Sample Output

```text
-150 can be fitted in:
* short
* int
* long

150000 can be fitted in:
* int
* long

1500000000 can be fitted in:
* int
* long

213333333333333333333333333333333333 can't be fitted anywhere.

-100000000000000 can be fitted in:
* long
```

---

## Explanation

- `-150` can be stored in a `short`, an `int`, or a `long`.
- `150000` can be stored in an `int` or a `long`.
- `1500000000` can be stored in an `int` or a `long`.
- `213333333333333333333333333333333333` is too large to be stored in any of the four primitive data types.
- `-100000000000000` can only be stored in a `long`.