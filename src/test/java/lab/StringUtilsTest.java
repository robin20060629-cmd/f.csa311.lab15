package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    @DisplayName("Текстийг урвуу болгох шалгалт")
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    @DisplayName("Хоосон текст шалгах")
    void testIsEmpty() {
        assertTrue(utils.isEmpty(""));
        assertFalse(utils.isEmpty("not empty"));
    }

    @Test
    @DisplayName("Null утга орж ирэх үед")
    void testHandleNull() {
        assertNull(utils.reverse(null));
    }
}
