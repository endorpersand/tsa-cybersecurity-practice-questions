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

`flag{its_called_a_comprehension_but_wheres_the_comprehending}`
