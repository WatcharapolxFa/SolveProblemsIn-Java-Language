package beryi8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatternTest {

    Pattern pattern;

    @Test
    void test_display_func_given_4_is_valid_result() {
        pattern = new Pattern(4);
        String actual = pattern.display();
        String expect = "      \n    * \n  * * * \n* * * * * \n    * \n  * * * \n";

        assertEquals(expect, actual);
    }

    @Test
    void test_display_func_given_5_is_valid_result() {
        pattern = new Pattern(5);
        String actual = pattern.display();
        String expect = "        \n      * \n    * * * \n  * * * * * \n* * * * * * * \n      * \n    * * * \n";

        assertEquals(expect, actual);
    }

    @Test
    void test_display_func_given_6_is_valid_result() {
        pattern = new Pattern(6);
        String actual = pattern.display();
        String expect = "          \n        * \n      * * * \n    * * * * * \n  * * * * * * * \n* * * * * * * * * \n        * \n      * * * \n";

        assertEquals(expect, actual);
    }
}
