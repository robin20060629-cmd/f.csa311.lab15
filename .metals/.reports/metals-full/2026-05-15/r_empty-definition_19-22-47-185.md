error id: file://<WORKSPACE>/src/test/StringUtilsTest.java:_empty_/StringUtils#
file://<WORKSPACE>/src/test/StringUtilsTest.java
empty definition using pc, found symbol in pc: _empty_/StringUtils#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 216
uri: file://<WORKSPACE>/src/test/StringUtilsTest.java
text:
```scala
package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils utils = new StringU@@tils();

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
        // Хэрэв чиний код null утгыг шалгадаг бол:
        assertNull(utils.reverse(null));
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/StringUtils#