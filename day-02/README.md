# 🔍 Day-02: Binary Search

- **Platform**: Offline / Custom  
- **Date**: 2025-08-01  
- **Difficulty**: Easy  
- **Topic**: Binary Search, Arrays

---

## ✅ Problem Statement

Given a sorted array and a target element, implement Binary Search to return the index of the target. If not found, return `-1`.

---

## 💡 Approach

- Set `low = 0` and `high = n-1`.
- Use a loop to calculate `mid = (low + high) / 2`.
- If `arr[mid] == target`, return `mid`.
- If `arr[mid] < target`, search in right half.
- If `arr[mid] > target`, search in left half.

---

## ✍️ Notes

- Time Complexity: O(log n)  
- Space Complexity: O(1)
- Works only on **sorted arrays**
