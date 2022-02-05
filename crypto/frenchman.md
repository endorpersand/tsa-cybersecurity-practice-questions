# frenchman

Type: **Cryptography**

Hey, so uhhh... this French dude came into the building and was screaming something?

I think they said:
> **aidezmoi**! Ils m'ont laissé dans un lycée américain!

I'm not sure; I don't speak French.

Anyway, they seemed stressed about this sheet of paper. Any idea?

![qu'est-ce que cela signifie???|400](../_assets/IMG_6741.jpg)

*The answer is of the format `flag{answer}`.*

**Hint**: I think the dude was mentioning something about "le chiffrage indéchiffrable"? Something about a V guy??

## Solution

The cipher this question uses is the Vigenère cipher (as hinted by the French and the colloquial name for the cipher: "le chiffrage indéchiffrable").

The passphrase is aidezmoi (as hinted by the bold and incorrect spelling).

Plug that into a decoder and you're done!

**Answer**: `flag{if_only_gsmst_had_french}`
