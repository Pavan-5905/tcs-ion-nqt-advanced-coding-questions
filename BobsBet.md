# Maximum Continuous Sequence of Horses

Bob is going to bet today on horse riding. There are **N** horses listed in a sequence from **1** to **N**.

The probability of winning for each horse is different, so the cost of betting on each horse is also different. There is no limit on the number of horses Bob can bet on, but he believes that betting on a **continuous sequence** of horses gives him a better chance of winning.

If **any** horse in the chosen sequence wins, Bob receives **K** units of money as the reward. Since the maximum reward is **K**, Bob wants to invest **less than K** units in total.

Your task is to determine the **maximum length** of a continuous sequence of horses on which Bob can bet while keeping the total betting cost **strictly less than K**.

If multiple such sequences exist, Bob may choose any one of them.

> **Hint:**  
> For each starting index of a horse, the ending index of the valid sequence will always be **equal to or greater than** the ending index of the previous starting index.

---

## Example 1

### Input

```text
10 100
30 40 50 20 20 10 90 10 10 10
```

### Output

```text
3
```

### Explanation

- Number of horses: **10**
- Reward money: **100**

Bob must spend **less than 100** units.

Possible continuous sequences of length **3** with total cost less than **100**:

- `[50, 20, 20]` → Sum = **90**
- `[10, 10, 10]` → Sum = **30**

No continuous sequence of length greater than **3** has a total cost less than **100**.

Therefore, the answer is:

```text
3
```

---

## Example 2

### Input

```text
10 100
10 90 80 20 90 60 40 60 70 75
```

### Output

```text
1
```

### Explanation

There are **no two consecutive horses** whose total betting cost is less than **100**.

Therefore, Bob can only bet on a single horse.

Hence, the maximum sequence length is:

```text
1
```

---

## Constraints

```text
2 ≤ N ≤ 10^5
1 ≤ K ≤ 10^9
1 ≤ A[i] ≤ 10^9
```

Where:

- `N` = Number of horses
- `K` = Reward money
- `A[i]` = Cost of betting on the `i-th` horse

---

## Input Format

The program should accept **two inputs**.

### First Input

```text
N K
```

- `N` → Number of horses
- `K` → Reward money

### Second Input

```text
A1 A2 A3 ... AN
```

- `Ai` represents the cost of betting on the `i-th` horse.

---

## Output Format

Print a single integer representing the **maximum length of a continuous sequence** whose total betting cost is **strictly less than K**.