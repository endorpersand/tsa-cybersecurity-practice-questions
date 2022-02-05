# i've got nothing here's some rsa

Type: **Cryptography**

I don't have a funny quip to say here. I was gonna put like some super simple calculus but I also realize that not everyone has taken calculus yet... so...

Have fun!

```
p = 172264247183169894489153119451334259897
q = 214570086054419925362447458720950927091
e = 65537

c = 1821723370200066645588366051142376454249231561365317783558173520514583559350
```

What is the decoded value `m`?

## Solution

Recall the equations that define [RSA](https://en.wikipedia.org/wiki/RSA_(cryptosystem)#Key_generation):

- n = pq
- λ(n) = λ(pq) = lcm(p - 1, q - 1)
- ed ≡ 1 (mod λ(n))
- c^d ≡ m (mod n)

Then, you can write some Python to just do this:

```py
p = 172264247183169894489153119451334259897
q = 214570086054419925362447458720950927091
e = 65537

c = 1821723370200066645588366051142376454249231561365317783558173520514583559350

from math import lcm

n = p * q
totient = lcm(p - 1, q - 1)
d = pow(e, -1, totient) # d = e^-1 (mod λ(n))
m = pow(c, d, n) # m = c^d (mod n)
```

**Answer**: `314159`
