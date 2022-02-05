# Cookies

Type: **Web Security**

Who doesn't love cookies? Try to figure out the best one. [http://mercury.picoctf.net:6418/](http://mercury.picoctf.net:6418/)

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

## Solution

You can find cookies at Inspect Element > Application > Cookies > \[the website\].

Here, there's a suspicious `name` cookie. Changing that cookie to `0` gives you a different page.

Keep changing it until you get to a flag (`18`).

**Answer**: `picoCTF{3v3ry1_l0v3s_c00k135_88acab36}`
