package ru.lesson;

public class Calculator {
    private int result;

    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public void minus(final int first, final int second) {
        this.result = first - second;
    }

    public void mult(final int first, final int second) {
        this.result = first * second;
    }

    public void div(final int first, final int second) {
        this.result = first / second;
    }

    public void power(final int first, final  int second) {
        result = (int) Math.pow(first, second);
    }

    public int getResult() {
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }
}
