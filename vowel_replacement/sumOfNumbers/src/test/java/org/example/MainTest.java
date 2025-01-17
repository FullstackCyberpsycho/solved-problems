package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.Main.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSum() {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(8);

        int res = sum(nums);
        assertEquals(10, res);
    }
}
