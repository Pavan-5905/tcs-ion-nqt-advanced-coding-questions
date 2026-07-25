# Golden House Puzzle

During your vacation, you visited the **Golden House**, which contains **N** rooms. The owner of the house is looking for an intelligent person to manage it. Since you have been unemployed for a long time, you are interested in the job.

To select the manager, the owner has created a puzzle.

Each room contains a certain number of **gold coins**. You must choose:

- **One room to enter**, and
- **One room to exit**.

Starting from the entry room:

- You may either **move to the next room** or **exit**.
- Whenever you enter a room, you **must collect all the gold coins** in that room.
- You **cannot skip** collecting coins from any visited room.

The owner wants to be left with **exactly `K` coins** after you exit. It is guaranteed that **at least one valid solution exists**.

Your task is to determine the **starting room number** and the **ending room number** of a **continuous sequence of rooms** whose total number of collected coins is exactly **K**.

If multiple valid sequences exist, print the one with the **smallest starting room number**.

> **Hint:** Find a **continuous subarray** whose sum is exactly equal to **K**.

---

## Example 1

### Input

```text
10 15
5 3 7 14 18 1 18 4 8 3
```

### Output

```text
1 3
```

### Explanation

There are **10 rooms**, and the required total number of coins is **15**.

The following continuous sequences have a total sum of **15**:

- Rooms **1 to 3** → `5 + 3 + 7 = 15`
- Rooms **8 to 10** → `4 + 8 + 3 = 15`

Since multiple solutions exist, choose the one with the **smaller starting room number**.

Hence, the output is:

```text
1 3
```

---

## Constraints

```text
1 ≤ N ≤ 10^5
1 ≤ K ≤ 10^9
1 ≤ A[i] ≤ 10^9
```

Where:

- `N` = Number of rooms
- `K` = Required total number of gold coins
- `A[i]` = Number of gold coins in the `i-th` room

---

## Input Format

### First Input

```text
N K
```

- `N` → Number of rooms
- `K` → Required total number of coins

### Second Input

```text
A1 A2 A3 ... AN
```

- `Ai` represents the number of gold coins in the `i-th` room.

---

## Output Format

Print two space-separated integers:

```text
start_room end_room
```

representing the starting and ending room numbers of the continuous sequence whose total number of coins is exactly **K**.

If multiple valid sequences exist, print the one with the **smallest starting room number**.