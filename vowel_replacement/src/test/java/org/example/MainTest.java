package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testVowelReplacement() {
        StringBuilder strSB = Main.vowelReplacement("Hello, world!");
        String strS= String.valueOf(strSB);

        Assertions.assertEquals(strS, "H*ll*, w*rld!");
    }
}
