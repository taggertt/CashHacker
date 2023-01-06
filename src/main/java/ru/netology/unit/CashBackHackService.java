package ru.netology.unit;

public class CashBackHackService {

    public final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
