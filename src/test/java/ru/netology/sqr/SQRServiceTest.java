package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateNumSquareTwo() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.calculateNumSquare(200, 300);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNumSquareZero() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int actual = sqrService.calculateNumSquare(0, 99);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumSquareLowerLimit() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int actual = sqrService.calculateNumSquare(0, 100);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNumSquareHigherLimit() {
        SQRService sqrService = new SQRService();

        int expected = 90;
        int actual = sqrService.calculateNumSquare(0, 9801);

        assertEquals(expected, actual);
    }

}