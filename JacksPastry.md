# Jack's Pastry Packing Problem

Jack recently got a job at a bakery that makes pastries. He not only enjoys making pastries but also loves eating them.

There is a special rule in the bakery:

> After all the pastries are packed and the bakery closes, Jack can take **all the leftover pastries** home.

Jack is responsible for packing the pastries into **one or more packets**. He wants to choose a **single packet size** such that the number of leftover pastries is **maximum**, allowing him to take home as many pastries as possible.

### Example

Suppose there are **5 pastries**.

Possible packet sizes:

| Packet Size | Packing Arrangement | Leftovers |
|-------------|---------------------|----------:|
| 2 | `2 + 2 + 1` | 1 |
| 3 | `3 + 2` | 2 |
| 4 | `4 + 1` | 1 |
| 5 | `5` | 0 |

The maximum number of leftovers is **2**, achieved by choosing a **packet size of 3**.

If **multiple packet sizes** produce the **same maximum number of leftovers**, choose the **largest packet size**.

---

## Example 1

### Input

```text
2
```

### Output

```text
2
```

### Explanation

There are **2 pastries**.

| Packet Size | Leftovers |
|-------------|----------:|
| 1 | 0 |
| 2 | 0 |

Both packet sizes leave **0 leftovers**, so choose the **larger packet size**, which is **2**.

---

## Example 2

### Input

```text
5
```

### Output

```text
3
```

### Explanation

There are **5 pastries**.

| Packet Size | Leftovers |
|-------------|----------:|
| 1 | 0 |
| 2 | 1 |
| 3 | 2 |
| 4 | 1 |
| 5 | 0 |

The maximum number of leftovers is **2**, which occurs with **packet size 3**.

Hence, the answer is:

```text
3
```

---

## Constraints

```text
0 < N < 1000
```

- `N` is an integer.

---

## Input Format

The first and only input contains a single integer:

```text
N
```

where `N` is the number of pastries.

---

## Output Format

Print a single integer representing the **packet size** that results in the **maximum number of leftover pastries**.

If multiple packet sizes produce the same maximum leftovers, print the **largest packet size**.

---

## Instructions

- Do **not** use hardcoded input values.
- Read the input from **standard input**.
- Print **only** the required answer.
- Any extra output may cause the test cases to fail.