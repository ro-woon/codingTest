Given an array of strings `strs`, group the anagrams together and return the groups.

1. Initialize:
    - Let `groups` be a hash map from `String` → `List<String>`.

2. For each string `s` in `strs`:
    - Create a key by sorting the characters of `s` (e.g., `"eat"` → `"aet"`).
    - Append `s` to `groups[key]` (create the list if it doesn't exist).

3. Build the result:
    - Collect all lists from `groups` into the final array of lists.

4. Return the array of lists as the grouped anagrams.
