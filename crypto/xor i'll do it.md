# xor i'll do it

Type: **Cryptography**

I thought `^` meant exponentiation D:
How am I supposed to get the flag?

Flag ^ K1 ^ K2 ^ K3 ^ K4 = `02a6dfe98ae7dcbf96cf951b39488228c94297fb12c46096d8`

K1 ^ K3 = `e572345388e5dee89dd8c62be6326fe0a2360e29853fbd01d6`

K2 ^ K3 = `352c61c7afe6400d5e5fb1cb0f331e5eb93aee14889371a8f6`

K3 ^ K4 = `b494eb1ad6832735272f87a4a82681e1b7221b992e51940b85`

*The answer is of the format `flag{answer}`.*

## Solution

xor is a very special operation.

Note what happens when you calculate `5 ^ 10 ^ 10`:

```
5 ^ 10 = 15
15 ^ 10 = 5
```

As you can see, xor is its own inverse.
So, to get the flag, apply XORs to cancel out the K1 ^ K2 ^ K3 ^ K4 in the first line.

This can be done as so:

```
(Flag ^ K1 ^ K2 ^ K3 ^ K4) ^ (K1 ^ K3) ^ (K2 ^ K3) ^ (K3 ^ K4)
```

Calculate the result and convert the hex into bytes.

**Answer**: `flag{george_xorwell_1984}`
