public class Calculator {
    private int result;

    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public void minus(int first, int second) {
        this.result = first - second;
    }

    public void mult(int first, int second) {
        this.result = first * second;
    }

    public void div(int first, int second) {
        this.result = first / second;
    }

    public void power(int first, int second) {
        result = (int) Math.pow(first, second);
    }

    public int getResult() {
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }
}
