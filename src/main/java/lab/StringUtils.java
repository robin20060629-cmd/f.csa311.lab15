package lab;

public class StringUtils {

    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
