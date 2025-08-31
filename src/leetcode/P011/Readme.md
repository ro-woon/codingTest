This solution uses a two-pointer technique: start at both ends and move the pointer with the shorter 
line inward to potentially find a larger area while always computing the current area.

1. Initialize two pointers l = 0, r = n-1.

2. Compute area = (r - l) * min(height[l], height[r]), update max.

3. Move inward the pointer with the smaller height (since the area is bounded by the shorter side).

4. Repeat until l >= r, return the maximum area found.
