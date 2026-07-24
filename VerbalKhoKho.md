# Alice and Her Friends – Verbal Kho-Kho Game

Alice and her friends are playing a game of **verbal Kho-Kho**. Alice acts as the mediator, while the remaining **N** friends are seated on **N** chairs, one friend per chair.

Alice starts by giving a paper containing a **single-digit number** to the first friend.

Let the friends be represented by an array **F** of size **N**, where:

- `F[1]` is the first friend.
- `F[2]` is the second friend.
- ...
- `F[N]` is the last friend.

After receiving the digit:

1. `F[1]` enacts the digit and communicates it **without speaking** to `F[2]`.
2. `F[2]` similarly communicates the digit to `F[3]`.
3. This process continues until `F[N]` receives the digit.
4. Finally, `F[N]` writes the digit on a separate paper and gives it to Alice.

Alice compares the original digit with the digit written by the last friend.

- If both digits are the same, Alice gives a **T-shirt to every friend**.
- Otherwise, Alice asks each friend what digit they understood and gives a **T-shirt only to the friends who understood the digit correctly**.

Your task is to determine **how many friends either:**

- did **not enact the digit correctly**, or
- **did not understand the enactment** from the previous friend correctly.

---

## Example 1

### Input

```text
3
4 4 4
```

### Output

```text
0
```

### Explanation

All friends understood and communicated the digit correctly.

---

## Example 2

### Input

```text
5
1 2 3 2 2
```

### Output

```text
4
```

### Explanation

The **1st, 2nd, 3rd, and 4th** friends either:

- enacted the digit incorrectly, or
- misunderstood the enactment from the previous friend.

Hence, the answer is:

```text
4
```

---

## Input Format

### First Input

```text
N
```

- `N` → Number of friends.

### Second Input

```text
D1 D2 D3 ... DN
```

- `Di` represents the digit understood by the `i-th` friend.

---

## Output Format

Print a single integer representing the **number of friends who either enacted the digit incorrectly or misunderstood the previous friend's enactment**.