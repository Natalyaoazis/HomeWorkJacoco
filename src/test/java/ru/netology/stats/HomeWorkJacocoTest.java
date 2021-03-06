package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkJacocoTest {
    @Test
    void findMax() {
        HomeWorkJacoco service = new HomeWorkJacoco();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 29};
        long expected = 29;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}