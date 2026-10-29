/*
 * LeetCode 217: Contains Duplicate
 * Approach: Sort the array, then check adjacent elements.
 * Time Complexity: O(n log n)
 * Extra Space: Depends on the qsort implementation.
 */

#include <stdlib.h>
#include <stdbool.h>

int compare(const void *a, const void *b) {
    int x = *(const int *)a;
    int y = *(const int *)b;
    return (x > y) - (x < y);
}

bool containsDuplicate(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), compare);

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] == nums[i - 1]) {
            return true;
        }
    }

    return false;
}
