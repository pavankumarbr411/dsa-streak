# ⚡ Day-02: QuickSort Algorithm

- **Date**: 2025-08-01  
- **Language**: Java  
- **Topic**: Sorting Algorithm - QuickSort  
- **Status**: ✅ Completed

---

## 📌 Problem Statement

Sort an unsorted array using the **QuickSort algorithm**, a popular **divide-and-conquer** technique.

---

## 💡 Approach

- Choose the **last element** of the array as a pivot.
- Partition the array such that:
  - Elements less than the pivot come before it.
  - Elements greater come after it.
- Recursively apply the same logic to the subarrays on the left and right of the pivot.

---

## 🔍 Complexity

- **Time Complexity**:
  - Best/Average Case: O(n log n)
  - Worst Case: O(n²)
- **Space Complexity**: O(log n) for recursive call stack

---

## 📌 Sample Output

Input:  
