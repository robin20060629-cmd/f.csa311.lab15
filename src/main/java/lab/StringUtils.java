package lab;

public class StringUtils {
    
    // Текстийг урвуу болгох функц
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Текст хоосон эсэхийг шалгах функц
    public boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }
}
