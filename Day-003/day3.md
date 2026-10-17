## DSA Challenge — Day 3

**Date:** 17 October 2026  
**Day:** Saturday  
**Topics:** Conditional Statements & Loops in Java

---

## 1. Today's Learning Goals

Today, I learned how to control the flow of a Java program using conditional statements and loops.

- Understand decision-making in Java.
- Learn how to use `if`, `if-else`, and `else-if`.
- Understand `switch` statements.
- Learn loops: `for`, `while`, and `do-while`.
- Understand `break` and `continue`.
- Practice problems using conditions and loops.
- Learn how these concepts are used in DSA.

---

## 2. Conditional Statements in Java

Conditional statements allow a program to make decisions based on whether a condition is true or false.

### 2.1 The `if` Statement

Executes a block of code only when a condition is true.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

**Output:**
```text
Eligible to vote
```

### 2.2 The `if-else` Statement

Chooses between two possible paths.

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

**Output:**
```text
Odd
```

### 2.3 The `else-if` Ladder

Checks multiple conditions in sequence.

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

**Output:**
```text
Grade B
```

### 2.4 The `switch` Statement

Useful when selecting an action based on a value.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

**Output:**
```text
Wednesday
```

The `break` statement prevents execution from falling through into the next case in this traditional `switch` form.

---

## 3. Loops in Java

Loops allow us to execute a block of code repeatedly while a condition or iteration rule permits it.

Loops are important because they help us process data without writing the same code repeatedly.

### 3.1 The `for` Loop

Use a `for` loop when you know the iteration pattern, such as counting from 1 to 5.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Output:**
```text
1
2
3
4
5
```

A `for` loop has three main parts:

- **Initialization:** `int i = 1`
- **Condition:** `i <= 5`
- **Update:** `i++`

### 3.2 The `while` Loop

Checks the condition before each iteration.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Output:**
```text
1
2
3
4
5
```

Use a `while` loop when the number of iterations depends on a condition.

### 3.3 The `do-while` Loop

Executes the block at least once because the condition is checked after the loop body.

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

**Output:**
```text
1
2
3
4
5
```

Even if the condition is false initially, a `do-while` loop executes its body once.

### 3.4 Difference Between Loops

| Loop | Condition Checked | Minimum Executions |
|---|---|---|
| `for` | Before each iteration | 0 |
| `while` | Before each iteration | 0 |
| `do-while` | After each iteration | 1 |

---

## 4. `break` and `continue`

### The `break` Statement

Terminates the loop immediately.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}
```

**Output:**
```text
1
2
```

### The `continue` Statement

Skips the remaining statements in the current iteration and proceeds to the next iteration.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

**Output:**
```text
1
2
4
5
```

---

## 5. Combining Conditions and Loops

Conditional statements and loops often work together to solve problems.

### Example: Print Even Numbers from 1 to 10

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

**Output:**
```text
2
4
6
8
10
```

**How it works:**

1. The loop visits each number from 1 through 10.
2. The condition `i % 2 == 0` checks whether the number is even.
3. Only numbers that satisfy the condition are printed.

---

## 6. Time Complexity Introduction

Understanding loops is the first step toward understanding algorithm time complexity.

### One Loop

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop runs approximately `n` times.

**Time Complexity:** `O(n)`

### Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

For each of the `n` outer iterations, the inner loop runs `n` times.

Total iterations: `n × n = n²`

**Time Complexity:** `O(n²)`

These are common patterns in DSA. Actual complexity depends on the loop bounds and how they change.

---

## 7. Practice Problems

Try solving these problems independently before looking at solutions.

### Beginner Level

- [ ] Check whether a number is positive, negative, or zero.
- [ ] Check whether a number is even or odd.
- [ ] Find the largest of two numbers.
- [ ] Find the largest of three numbers.
- [ ] Print numbers from 1 to `n`.
- [ ] Print all even numbers from 1 to `n`.
- [ ] Calculate the sum of numbers from 1 to `n`.

### Intermediate Level

- [ ] Calculate the factorial of a number.
- [ ] Print the multiplication table of a number.
- [ ] Count the digits in an integer.
- [ ] Reverse the digits of an integer.
- [ ] Check whether a number is prime.
- [ ] Print a simple star pattern using nested loops.

---

## 8. Common Mistakes

1. **Forgetting to update the loop variable:** This can create an infinite loop.
2. **Using the wrong condition:** For example, `i < n` versus `i <= n` changes the number of iterations.
3. **Adding an unnecessary semicolon:** A semicolon immediately after a loop header can create an empty loop body.
4. **Misunderstanding `break` and `continue`:** `break` exits the loop; `continue` skips to the next iteration.
5. **Incorrect `if-else` ordering:** Conditions in an `else-if` ladder are checked from top to bottom.
6. **Off-by-one errors:** Carefully check the starting value, ending condition, and update.

---

## 9. Connection to DSA

Conditional statements and loops are essential building blocks of algorithms.

- **Searching:** Loops examine elements until a target is found.
- **Arrays:** Loops traverse elements to calculate sums, find maximum values, or count matches.
- **Sorting:** Many sorting algorithms use loops to compare and rearrange elements.
- **Mathematical problems:** Loops help calculate factorials, digit sums, and prime numbers.
- **Time complexity:** Loop structures help us estimate how an algorithm's work grows as input size increases.

---

## 10. Day 3 Summary

Today, I learned:

- How to make decisions using `if`, `if-else`, `else-if`, and `switch`.
- How to repeat instructions using `for`, `while`, and `do-while`.
- How to control loop execution using `break` and `continue`.
- How to combine conditions and loops to solve problems.
- The basic connection between loops and time complexity.

### Tomorrow's Plan

- Practice conditional statements and loop-based problems.
- Strengthen problem-solving logic.
- Learn how to trace code manually.
- Begin connecting these fundamentals to arrays and DSA.

---

## Day 3 Reflection

Today, I strengthened my Java fundamentals by learning how programs make decisions and repeat tasks.

I understand that **conditions control which path a program follows, while loops control how many times instructions execute**.

These concepts form the foundation for solving more complex programming problems and learning Data Structures and Algorithms.

**Progress:** Day 3 completed — keep learning, keep practicing, and keep improving!

#DSAChallenge #Day3 #Java #ConditionalStatements #Loops #ProblemSolving