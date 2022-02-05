# TSA Cybersecurity Mock Competition

## Cryptography

### frenchman

Hey, so uhhh... this French dude came into the building and was screaming something?

I think they said:
> **aidezmoi**! Ils m'ont laissé dans un lycée américain!

I'm not sure; I don't speak French.

Anyway, they seemed stressed about this sheet of paper. Any idea?

![qu'est-ce que cela signifie???|400](../_assets/IMG_6741.jpg)

*The answer is of the format `flag{answer}`.*

**Hint**: I think the dude was mentioning something about "le chiffrage indéchiffrable"? Something about a V guy??

### xor i'll do it

I thought `^` meant exponentiation D:
How am I supposed to get the flag?

Flag ^ K1 ^ K2 ^ K3 ^ K4 = `02a6dfe98ae7dcbf96cf951b39488228c94297fb12c46096d8`

K1 ^ K3 = `e572345388e5dee89dd8c62be6326fe0a2360e29853fbd01d6`

K2 ^ K3 = `352c61c7afe6400d5e5fb1cb0f331e5eb93aee14889371a8f6`

K3 ^ K4 = `b494eb1ad6832735272f87a4a82681e1b7221b992e51940b85`

*The answer is of the format `flag{answer}`.*

### i've got nothing here's some rsa

I don't have a funny quip to say here. I was gonna put like some super simple calculus but I also realize that not everyone has taken calculus yet... so...

Have fun!

```
p = 172264247183169894489153119451334259897
q = 214570086054419925362447458720950927091
e = 65537

c = 1821723370200066645588366051142376454249231561365317783558173520514583559350
```

What is the decoded value `m`?

## Forensics

### extensions

This is a really weird text file [TXT](https://jupiter.challenges.picoctf.org/static/e7e5d188621ee705ceeb0452525412ef/flag.txt)? Can you find the flag?

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint:** How do operating systems know what kind of file it is? (It's not just the ending!

### Glory of the Garden

This [garden](https://jupiter.challenges.picoctf.org/static/43c4743b3946f427e883f6b286f47467/garden.jpg) contains more than it seems.

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: What is a hex editor?

### like1000

This [.tar file](https://jupiter.challenges.picoctf.org/static/52084b5ad360b25f9af83933114324e0/1000.tar) got tarred a lot.

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: Try and script this, it'll save you a lot of time

### What Lies Within

There's something in the [building](https://jupiter.challenges.picoctf.org/static/011955b303f293d60c8116e6a4c5c84f/buildings.png). Can you retrieve the flag?

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: There is data encoded somewhere... there might be an online decoder.

### WhitePages

I stopped using YellowPages and moved onto WhitePages... but [the page they gave me](https://jupiter.challenges.picoctf.org/static/74274b96fe966126a1953c80762af80d/whitepages.txt) is all blank!

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

## Reverse Engineering

### Cupid Shuffle

`wwwwiiiieeee````````hhhhaaaa[[[[oooo____ddddkkkkkkkkhhhh[[[[rrrreeee^^^^hhhh]]]]cccc`! I'm having so much fun!

```java
import java.util.*;

public class CupidShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        input = toTheRight(input);
        input = toTheRight(input);
        input = toTheRight(input);
        input = toTheRight(input);
        input = toTheLeft(input);
        input = toTheLeft(input);
        input = toTheLeft(input);
        input = toTheLeft(input);
        input = kick(input);
        input = kick(input);
        input = kick(input);
        input = kick(input);
        input = walkItByYourself(input);
        input = walkItByYourself(input);
        letMeSeeYouDo(input);
    }

    public static String toTheRight(String input) {
        int len = input.length();
        return input.substring(len - 1, len) + input.substring(1, len - 1);
    }

    public static String toTheLeft(String input) {
        return input.substring(1, input.length()) + input.substring(0, 1);
    }

    public static String kick(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char nc = (char) (input.charAt(i) - 1);
            result += nc;
        }

        return result;
    }
    public static String walkItByYourself(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(i);
            result += input.charAt(i);
        }
        return result;
    }
    public static void letMeSeeYouDo(String input) {
        System.out.println(input);
    }
}
```

*The answer is of the format `flag{answer}`.*

### vault-door-4

This vault uses ASCII encoding for the password. The source code for this vault is here: [VaultDoor4.java](https://jupiter.challenges.picoctf.org/static/09d3002ae349631324a17e2255ae8df2/VaultDoor4.java)

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.
Also, the vault doors before this one were boring.*

**Hint**: Use a search engine to find an "ASCII table".
**Hint**: You will also need to know the difference between octal, decimal, and hexadecimal numbers.

### whython

hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh. People need to stop typing one-liner Python code.
I put in a flag and I got out

```
|fmhcmdgdqolnb^dgs^rdqdgv^sta^mnhrmdgdqol_n_b_^_`_^_c_d_k_k_`_b_^_r_s_h_z_f_`_k_e
```

???

What does this code even do?

```py
'_'.join(sorted(chr(ord(c)-1))[0] for c in list(reversed(flag))).replace("_", "", 40)
```

## Web Security

### Cookies

Who doesn't love cookies? Try to figure out the best one. [http://mercury.picoctf.net:6418/](http://mercury.picoctf.net:6418/)

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

### Irish-Name-Repo 1

There is a website running at `https://jupiter.challenges.picoctf.org/problem/33850/` ([link](https://jupiter.challenges.picoctf.org/problem/33850/)) or http://jupiter.challenges.picoctf.org:33850. Do you think you can log us in? Try to see if you can login!

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: There doesn't seem to be many ways to interact with this. I wonder if the users are kept in a database?
**Hint**: Try to think about how the website verifies your login.

### JaWT Scratchpad

Check the admin scratchpad! `https://jupiter.challenges.picoctf.org/problem/63090/` or http://jupiter.challenges.picoctf.org:63090

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: What is that cookie?
**Hint**: Have you heard of JWT?

### where are the robots

Can you find the robots? `https://jupiter.challenges.picoctf.org/problem/36474/` ([link](https://jupiter.challenges.picoctf.org/problem/36474/)) or http://jupiter.challenges.picoctf.org:36474

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: What part of the website could tell you where the creator doesn't want you to look?