# Add Two Numbers

A dummy node was used to eliminate the "if" check when registering the first node.

We traverse both lists and add the values node by node. Since the two lists may have different lengths, 
we continue the addition as long as at least one list still has remaining nodes.

If there is a carry left after processing all nodes, we append it as a new node at the end of the list. 
Finally, we return the next value from the dummy node, excluding the initial placeholder 0.
