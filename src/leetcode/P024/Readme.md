This solution uses a dummy node and pointer manipulation to swap nodes in pairs within a singly linked list.
By re-linking two nodes at a time, we ensure that all pairs are swapped in one pass with constant extra space.

1. We create a dummy node before the head to handle edge cases, such as swapping the first two nodes.

2. Starting from the dummy, we take two nodes at a time (a and b) along with the pointer to the next group (nxt).

3. We rewire the pointers so that prev -> b -> a -> nxt, effectively swapping the pair.

4. We move the prev pointer forward by two nodes and continue the process until no more pairs are left.
