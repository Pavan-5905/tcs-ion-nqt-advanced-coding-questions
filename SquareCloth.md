# Tina's Square Cloth Problem

Tina was given a piece of silk cloth with several points (coordinates) already marked on it.

She wants to cut out a **perfect square** from the cloth. To do so, she may add a few additional coordinates if necessary.

Your task is to help Tina determine the **minimum number of additional points** she must add to form a perfect square.

### Rules

- The square should include **as many of the given points as possible**.
- If multiple squares require the same minimum number of additional points, choose the **largest possible square**.
- Print the **minimum number of additional coordinates** required.

---

## Example

Suppose there are **3** given points:

```text
(0, 0)
(2, 2)
(3, 3)
```

Two possible squares can be formed by adding:

### Option 1

Additional points:

```text
(2, 0)
(0, 2)
```

### Option 2

Additional points:

```text
(3, 0)
(0, 3)
```

Both options require **2** additional points.

However, the second option forms the **larger square**, so Tina chooses it.

Therefore, the answer is:

```text
2
```

---

## Example 1

### Input

```text
5
0 0
100 100
200 200
100 0
0 100
```

### Output

```text
0
```

### Explanation

The following four points already form a square:

```text
(0, 0)
(100, 0)
(100, 100)
(0, 100)
```

No additional coordinates are needed.

Hence, the answer is:

```text
0
```

---

## Example 2

### Input

```text
3
0 0
2 2
3 3
```

### Output

```text
2
```

### Explanation

Two possible ways to complete a square are:

**Option 1**

```text
(2, 0)
(0, 2)
```

**Option 2**

```text
(3, 0)
(0, 3)
```

Both require **2** additional coordinates.

Since the second option produces the **larger square**, Tina chooses it.

Hence, the answer is:

```text
2
```

---

## Constraints

```text
1 ≤ N ≤ 10^5
-10^9 ≤ x[i], y[i] ≤ 10^9
```

---

## Input Format

### First Line

```text
N
```

- `N` → Number of given coordinates.

### Next N Lines

```text
x[i] y[i]
```

- `x[i]` and `y[i]` represent the coordinates of the `i-th` point.

---

## Output Format

Print a single integer representing the **minimum number of additional coordinates** required to form a perfect square.

If multiple valid squares require the same minimum number of additional coordinates, consider the **largest possible square**.

---

## Instructions

- Do **not** use hardcoded input values.
- Read input from **standard input**.
- Print **only** the required answer.
- Any extra output may cause the test cases to fail.