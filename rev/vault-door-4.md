# vault-door-4

Type: **Reversing**

This vault uses ASCII encoding for the password. The source code for this vault is here: [VaultDoor4.java](https://jupiter.challenges.picoctf.org/static/09d3002ae349631324a17e2255ae8df2/VaultDoor4.java)

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.
Also, the vault doors before this one were boring.*

**Hint**: Use a search engine to find an "ASCII table".

**Hint**: You will also need to know the difference between octal, decimal, and hexadecimal numbers.

## Solution

All `checkPassword` does is compares each character in the input string to make sure its ASCII value matches the respective byte in the byte array.

So convert each decimal, hexadecimal, and octal number into ASCII and you're done.

But... why do it manually? You have the Java code right there. Java can convert hex, decimal, and octal into `char`s automatically... so:

```java
byte[] myBytes = {
    106 , 85 , 53 , 116 , 95 , 52 , 95 , 98 ,
    0x55, 0x6e, 0x43, 0x68, 0x5f, 0x30, 0x66, 0x5f,
    0142, 0131, 0164, 063 , 0163, 0137, 0143, 061 ,
    '9' , '4' , 'f' , '7' , '4' , '5' , '8' , 'e' ,
};

for (byte b : myBytes) System.out.print((char) b);
```

Plop that in `jshell` or `repl.it` and you're done!

**Answer**: `picoCTF{jU5t_4_bUnCh_0f_bYt3s_61e0f2769c}`
