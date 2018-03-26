public class Calculate {
    public static void main(String[] args) {
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);

        Calculate calculate = new Calculate();
        System.out.println(calculate.sum(first, second));
        System.out.println(calculate.div(first, second));
        System.out.println(calculate.multiplay(first, second));
        System.out.println(calculate.power(first, second));

    }


    int sum(int one, int two) {
        return (one + two);
    }

    double div(double one, double two) {
        return (one / two);
    }

    double multiplay(double one, double two) {
        return one * two;
    }

    double power(double one, double two) {

        return Math.pow(one, two);
    }

}