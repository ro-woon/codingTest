This solution uses the two-pointer technique with a dummy node to remove the nth node from the end of a linked list in one pass.
By moving the fast pointer ahead first, we ensure that the slow pointer lands exactly at the node before the one we need to delete.

1. We create a dummy node before the head to simplify edge cases, such as removing the head itself.

2. The fast pointer is moved n+1 steps ahead, creating a fixed gap of size n between fast and slow.

3. Both fast and slow pointers move together until fast reaches the end. At this point, slow is positioned right before the target node.

4. We remove the target node by updating slow.next = slow.next.next.
