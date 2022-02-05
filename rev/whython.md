# whython

Type: **Reversing**

hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh. People need to stop typing one-liner Python code.
I put in a flag and I got out:
```
|fmhcmdgdqolnb^dgs^rdqdgv^sta^mnhrmdgdqol_n_b_^_`_^_c_d_k_k_`_b_^_r_s_h_z_f_`_k_e
```
???

What does this code even do?
```py
'_'.join(sorted(chr(ord(c)-1))[0] for c in list(reversed(flag))).replace("_", "", 40)
```

## Solution

This code...

1. reverses the flag
2. shifts all the characters down by one ASCII value
3. adds underlines between each character
4. removes 40 of those underlines

The reverse of this is:

1. remove **all** underlines
2. shift the characters up by one ASCII value
3. unreverse the flag

**Answer**: `flag{its_called_a_comprehension_but_wheres_the_comprehending}`
