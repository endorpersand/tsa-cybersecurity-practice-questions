# Cupid Shuffle

Type: **Reversing**

`bbbbhhhh]]]]ccccwwwwiiiieeee````````hhhhaaaa[[[[oooo____ddddkkkkkkkkhhhh[[[[rrrreeee^^^^aaaaooooyyyy`! I'm having so much fun!

[CupidShuffle.java](../_assets/CupidShuffle.java)

*The answer is of the format `flag{answer}`.*

## Solution

Each of the functions are pretty simple on their own:

- `toTheLeft`: takes the last character and brings it to the beginning of the string
- `toTheRight`: takes the first character and brings it to the end of the string
- `kick`: changes each character to the one with a ASCII value of 1 less
- `walkItByYourself`: repeat each character in the input
- `letMeSeeYouDo`: print the result

To undo `walkItByYourself` x2, replace each run of 4 in the string. This results in: `bh]cwie``ha[o_dkkh[re^aoy`

To undo `kick` x4: shift the ASCII values up by 4: `flag{middle_school_vibes}`

The `toTheLeft`s and the `toTheRight`s cancel each other out, so you're done.

Here's how you'd do this question in Python:

```py
enc = "`bbbbhhhh]]]]ccccwwwwiiiieeee````````hhhhaaaa[[[[oooo____ddddkkkkkkkkhhhh[[[[rrrreeee^^^^aaaaooooyyyy`"

# undo walk it
enc = "".join(enc[i] for i in range(0, len(enc), 4))

# undo kick
enc = "".join(chr(ord(c) + 4) for c in enc)
```

**Answer**: `flag{middle_school_vibes}`
