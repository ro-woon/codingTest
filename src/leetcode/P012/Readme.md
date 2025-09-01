This solution uses a greedy technique: keep a descending table of values (including subtractive pairs) 
and always take the largest value not exceeding the remaining number, appending its Roman symbol.

1. Prepare descending arrays
vals = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
syms = ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"].

2. Set i = 0, result = "".

3. While num > 0:
      While num >= vals[i]:
          append syms[i] to result.
          set num -= vals[i]
      Increment i.

4. Return result when num == 0.
