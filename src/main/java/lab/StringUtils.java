package lab;

public class StringUtils {

    // 1. Текстийг урвуу болгох функц (Даалгавар 2)
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    // 2. Текстийн эхний үсгийг том болгох функц
    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    // 3. Текст хоосон эсвэл зөвхөн зай авагдсан эсэхийг шалгах функц
    public boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    // Төслийн зааварт байсан хуучин isEmpty функцийг давхар үлдээе
    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
