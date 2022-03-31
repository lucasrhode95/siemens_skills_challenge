package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q3Test {

    @Test
    void concatRemove() {
        // questionnaire
        assertTrue(Q3.concatRemove("blablablabla", "blablabcde", 8));
        assertTrue(Q3.concatRemove("tab", "tab", 7));

        assertFalse(Q3.concatRemove("", "tab", 1)); // not enough inserts
        assertFalse(Q3.concatRemove("", "tab", 2)); // not enough inserts
        assertTrue(Q3.concatRemove("", "tab", 3)); // just enough inserts
        assertTrue(Q3.concatRemove("", "tab", 4)); // 1x insert excess
        assertTrue(Q3.concatRemove("", "tab", 5)); // 2x insert excess

        assertFalse(Q3.concatRemove("tab", "", 1)); // not enough deletes
        assertFalse(Q3.concatRemove("tab", "", 2)); // not enough deletes
        assertTrue(Q3.concatRemove("tab", "", 3)); // just enough deletes
        assertTrue(Q3.concatRemove("tab", "", 4)); // 1x delete excess
        assertTrue(Q3.concatRemove("tab", "", 5)); // 2x delete excess

        assertFalse(Q3.concatRemove("lewis", "bruno", 8)); // not enough to rewrite all
        assertFalse(Q3.concatRemove("lewis", "bruno", 9)); // not enough to rewrite all
        assertTrue(Q3.concatRemove("lewis", "bruno", 10)); // just enough to rewrite all
        assertTrue(Q3.concatRemove("lewis", "bruno", 11)); // more than enough to rewrite all
        assertTrue(Q3.concatRemove("lewis", "bruno", 12)); // more than enough to rewrite all

        assertFalse(Q3.concatRemove("lewis", "lewishamilton", 7)); // not enough to partial rewrite
        assertTrue(Q3.concatRemove("lewis", "lewishamilton", 8)); // just enough to partial rewrite
        assertFalse(Q3.concatRemove("lewis", "lewishamilton", 9)); // more than enough to partial rewrite (odd)
        assertTrue(Q3.concatRemove("lewis", "lewishamilton", 10)); // more than enough to partial rewrite (even)
    }

    @Test
    void commonLength() {
        assertEquals(Q3.commonLength("lewis hamilton", "lewis armstrong"), 6);
        assertEquals(Q3.commonLength("mika hakkinen", "mika smith"), 5);
        assertEquals(Q3.commonLength("botas", "botas"), 5);
    }
}
