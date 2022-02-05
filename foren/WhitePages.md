# WhitePages

Type: **Forensics**

I stopped using YellowPages and moved onto WhitePages... but [the page they gave me](https://jupiter.challenges.picoctf.org/static/74274b96fe966126a1953c80762af80d/whitepages.txt) is all blank!

*This question is from picoCTF. PicoCTF flags are of the format: `picoCTF{answer}`.*

## Solution

The page doesn't have any visible characters, but it has whitespace: tabs and spaces.

Replace all tabs with `0` and all spaces with `1` and put that in a binary converter.

**Answer**: `picoCTF{not_all_spaces_are_created_equal_c167040c738e8bcae2109ef4be5960b1}`
