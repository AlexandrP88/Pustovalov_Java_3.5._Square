package ru.netology.sqr;

public class SQRService {

    public int calculateNumSquare(int limitMin, int limitMax) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limitMin && i * i <= limitMax) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
