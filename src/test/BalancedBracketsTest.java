package test;

import static main.BalancedBrackets.hasBalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyStringHasBalancedBrackets() {
        // Test case ---> ""
        // we expect that an empty string does have balanced brackets
        assertTrue(hasBalancedBrackets(""));
    }

    @Test
    public void testSinglePairOfBalancedBrackets() {
        // Test case ---> "[]"
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void testTenPairsOfNestedBalancedBrackets() {
        // Test case ---> "[[[[[[[[[[]]]]]]]]]]"
        assertTrue(hasBalancedBrackets("[[[[[[[[[[]]]]]]]]]]"));
    }

    @Test
    public void testClosingThenOpeningBracketReturnsFalse() {
        // Test case ---> "]["
        assertFalse(hasBalancedBrackets("]["));
    }

    @Test
    public void testMoreOpeningBracketsThanClosingBracketsReturnsFalse() {
        // Test case ---> "[[[[[[[[[[[]]]"
        assertFalse(hasBalancedBrackets("[[[[[[[[[[[]]]"));
    }

    @Test
    public void testRandomOrderOfBalancedBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[[][][[]][]]"));
    }

    @Test
    public void testRandomBracketsReturnsFalse() {
        assertFalse(hasBalancedBrackets("[][[]]]][[]]]][]]][]]][][][][][][]]][]]["));
    }

}
