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

    public static String toTheLeft(String input) {
        int len = input.length();
        return input.substring(len - 1, len) + input.substring(0, len - 1);
    }

    public static String toTheRight(String input) {
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