package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {
    
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //First test for only brackets
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Only opening bracket
    @Test
    public void onlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void moreOpeningBracketsThanClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void moreOpeningBracketsThanClosingBracketsWithContent() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[word]"));
    }

    @Test
    public void lessOpeningBracketsThanClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void lessOpeningBracketsThanClosingBracketsWithContent() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]]"));
    }

    @Test
    public void bracketsAreBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsAreBalancedWithContent() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[word]]"));
    }

    @Test
    public void curlyBracketIsIncluded() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{]]"));
    }

    @Test
    public void curlyBracketIsIncludedWithContent() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{word]]"));
    }
}
