# where are the robots

Type: **Web Security**

Can you find the robots? `https://jupiter.challenges.picoctf.org/problem/36474/` ([link](https://jupiter.challenges.picoctf.org/problem/36474/)) or http://jupiter.challenges.picoctf.org:36474

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: What part of the website could tell you where the creator doesn't want you to look?

## Solution

The site is hinting you towards the site's `robot.txt`.

If you visit http://jupiter.challenges.picoctf.org:36474/robots.txt, there is an interesting line:

```
Disallow: /477ce.html
```

Visit http://jupiter.challenges.picoctf.org:36474/477ce.html and get the flag.

**Answer**: `picoCTF{ca1cu1at1ng_Mach1n3s_477ce}`
