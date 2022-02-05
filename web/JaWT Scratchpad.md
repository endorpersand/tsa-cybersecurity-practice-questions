# JaWT Scratchpad

Type: **Web Security**

Check the admin scratchpad! `https://jupiter.challenges.picoctf.org/problem/63090/` or http://jupiter.challenges.picoctf.org:63090

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

Hint 1: What is that cookie?

Hint 2: Have you heard of JWT?

## Solution

This question uses JWT and the password cracker JohnTheRipper.

When you make an account (and check your cookies), there's a cookie for JWT.
If you take the cookie and plug it into the jwt.io website, note that:

- The algorithm they are using for JWT is HMAC256
- The token has a user payload that stores the username
- The last portion represents the signature, but since we don't know the signature, the site tells us our signature is invalid.

So, the goal then is to find this signature.

`john` can be used to do this.
Take the cookie you have, and dump it into a file like `jwt.john`.
(Install the `rockyou.txt` wordlist too)

Then, you can run,

```sh
john --wordlist=rockyou.txt jwt.john
```

This gives you the secret: `ilovepico`.

Then, you can use that secret to sign a payload with `{"user": "admin"}` (using the JWT website).

Replace your cookie on the JaWT Scratchpad website with your new token, refresh the page, and get the flag.

**Answer**: `picoCTF{jawt_was_just_what_you_thought_9ed4519dee8140de7a186a5df5a08d6e}`
