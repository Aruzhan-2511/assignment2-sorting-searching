Assignment 3: Sorting and Searching Algorithm Analysis

## A. Project Overview

In this project, I implemented and analyzed three algorithms:

* Bubble Sort (basic sorting)
* Merge Sort (advanced sorting)
* Linear Search (searching)

The purpose of this experiment is to compare the performance of different algorithms and understand how they behave with different input sizes and data types. The execution time of each algorithm is measured using `System.nanoTime()`.

---

## B. Algorithm Descriptions

### 1. Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. It continues until the array is fully sorted.

* Time Complexity:

  * Best Case: O(n)
  * Worst Case: O(n²)
  * Average Case: O(n²)

---

### 2. Merge Sort

Merge Sort is a divide-and-conquer algorithm. It splits the array into smaller parts, sorts each part recursively, and then merges them back together in sorted order.

* Time Complexity:

  * Best Case: O(n log n)
  * Worst Case: O(n log n)
  * Average Case: O(n log n)

---

### 3. Linear Search

Linear Search checks each element of the array one by one until the target element is found or the array ends.

* Time Complexity:

  * Best Case: O(1)
  * Worst Case: O(n)
  * Average Case: O(n)

---

## C. Experimental Results

### Execution Time Table (example)

| Array Size | Bubble Sort (ns) | Merge Sort (ns) | Linear Search (ns) |
| ---------- | ---------------- | --------------- | ------------------ |
| 10         | 5000             | 2000            | 1000               |
| 100        | 50000            | 8000            | 3000               |
| 1000       | 2000000          | 30000           | 10000              |

*(Note: Values may vary depending on system performance.)*

---

### Analysis

* Merge Sort performed faster than Bubble Sort for larger arrays because it has a better time complexity (O(n log n)).
* Bubble Sort becomes very slow when the array size increases.
* Linear Search performance increases linearly with the size of the array.
* Sorted arrays slightly improve Bubble Sort performance but do not significantly affect Merge Sort.

---

## D. Screenshots

Screenshots of program execution are available in the folder:

```
docs/screenshots/
```

They show:

* Output of sorting algorithms is stored in the results file
* Execution time results
* Different test runs with various array sizes

---

## E. Reflection

In this project, I learned how different algorithms perform under various conditions. I understood that theoretical complexity (Big-O notation) is important, but actual execution time can vary depending on implementation and input data.

I also noticed that simple algorithms like Bubble Sort are easy to implement but inefficient for large datasets, while more advanced algorithms like Merge Sort provide much better performance.

One of the main challenges was implementing Merge Sort correctly and measuring execution time accurately using `System.nanoTime()`. Overall, this project helped me better understand algorithm efficiency and performance analysis.
